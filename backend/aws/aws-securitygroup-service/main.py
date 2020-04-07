#import flask
from flask import Flask, jsonify, request, make_response
import boto3
import os
import json

from Models.SecurityConfiguration import SecurityConfiguration

client = boto3.client(
    'ec2',
    aws_access_key_id=os.environ['accessKey'],
    aws_secret_access_key = os.environ['secretKey'],
    region_name='eu-central-1'
    )


app = Flask(__name__)


#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the aws security group service"

@app.route('/securityGroup', methods=['POST'])
def createSecurityGroup():
    #get the provided json body
    content = request.get_json()

    #check if the SecurityGroup not exists
    resp = json.loads(searchSecurityGroup(content['groupName']).data)
    if resp['groupId'] != None:
        return make_response(jsonify(groupId=resp['groupId']))

    try:
        config = SecurityConfiguration(content['groupName'], content['groupDescription'],
                                       content['vpcId'])
    except KeyError:
        return make_response(jsonify(groupId = None))

    #create the securityGroup
    createresult = client.create_security_group(
        Description=config.groupDescription,
        GroupName=config.groupName,
        VpcId=config.vpcId,
        DryRun=False
    )

    if content['authorizeConfiguration']:
        for authorization in content['authorizeConfiguration']:
            config.addAuthorize(authorization)
        #Create Ingress Permission on Group
        for auth in config.authorizeConfiguration:
            response = client.authorize_security_group_ingress(
                CidrIp=auth['ipaddress'],
                FromPort=auth['port'],
                GroupId=createresult['GroupId'],
                IpProtocol=auth['protocol'],
                ToPort=auth['port'],
                DryRun=False
            )

    return make_response(jsonify(groupId = createresult['GroupId']))

@app.route('/securityGroup', methods=['GET'])
def loadAllSecurityGroups():
    #Search group based on Name on aws
    response = client.describe_security_groups()
    if response['SecurityGroups']:
        groups = response['SecurityGroups']
        return make_response(jsonify(groups=groups))
    return make_response(jsonify(groups=None))

@app.route('/securityGroup/<groupName>', methods=['GET'])
def searchSecurityGroup(groupName):
    if groupName:
        #Search group based on Name on aws
        response = client.describe_security_groups(
            Filters=[
                dict(Name='group-name', Values=[groupName])
            ]
        )
        if response['SecurityGroups']:
            group_id = response['SecurityGroups'][0]['GroupId']
            return make_response(jsonify(groupId = group_id))
    return make_response(jsonify(groupId=None))


@app.route('/securityGroup', methods=['DELETE'])
def deleteSecurityGroups():
    #Delete SecurityGorup
    content = request.get_json()
    if content and content['groupName']:
        try:
            response = client.delete_security_group(GroupName=content['groupName'])
            return make_response(jsonify(response))
        except Exception:
            pass
    return make_response(jsonify(None))

#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

from flask import Flask, jsonify, request, make_response
import boto3
import os
import json
import configparser
import requests

from Models.VMModel import VMModel

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
instancetypeURL = config.get('MicroServiceURL', 'aws-instancetype')
keypairURL = config.get('MicroServiceURL', 'aws-keypair')
securitygroupURL = config.get('MicroServiceURL', 'aws-securitygroup')

#requests.get(instancetypeURL).text call Service
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
    return "welcome at the aws vm service"

@app.route('/vm/<instanceId>', methods=['GET'])
def getVM(instanceId):
    return "welcome at the aws vm service"

@app.route('/vm/<instanceId>', methods=['PATH'])
def stopVM(instanceId):
    return "welcome at the aws vm service"

@app.route('/vm/<instanceId>', methods=['PUT'])
def startVM(instanceId):
    return "welcome at the aws vm service"

@app.route('/vm/', methods=['POST'])
def createVM():
    #get the provided json body
    content = request.get_json()

    try:
        vm = VMModel(content['InstanceType'], content['KeyName'])
    except KeyError:
        return make_response(jsonify(groupId = None))

    for securitygroup in content['SecurityGroups']:
        vm.addSecurityGroup(securitygroup)
        response = client.run_instances(
            InstanceType=vm.instanceType,
            KeyName=vm.keyname,
            SecurityGroups=vm.securiyGroups,
            DryRun=False,
            MaxCount=1,
            MinCount=1
        )
        if response['Instances']:
            instanceId = response['Instances'][0]['InstanceId']
            return make_response(jsonify(instanceId=instanceId))
    return make_response(jsonify(instanceId=None))

    return Instances

#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port=8080, threaded=True)
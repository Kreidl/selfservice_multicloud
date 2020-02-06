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
imageURL = config.get('MicroServiceURL', 'aws-image')

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
    pass
    '''
    try:
        vm = VMModel(content['InstanceType'], content['KeyName'], imageId)
    except KeyError:
        return make_response(jsonify(instanceId = None))

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
    '''

@app.route('/vm/image', methods=['GET'])
def loadImages():
    content = request.get_json()

    if content:
        if "imageId" in content:
            imageId = content['imageId']
        elif "imageName" in content:
            # call Image Service to Filter the latest created Image, if nothing found or other error return null on method
            try:
                imageId = json.loads(requests.get(imageURL + '/images/' + content['imageName']).text)
            except Exception:
                return make_response(jsonify(instanceId = None))
        else:
            return make_response(jsonify(instanceId=None))
    else:
        return make_response(jsonify(instanceId=None))

    return make_response(jsonify(instanceId=imageId))


@app.route('/vm/keypair', methods=['GET'])
def loadOrCreateKeyPair():
    content = request.get_json()

    if content:
        if "keypair" in content:
            keypair = content['keypair']
            # call keypair Service to Filter the latest created Image, if nothing found or other error return null on method
            try:
                keypairId = json.loads(requests.post(keypairURL + '/keypair', json={"keypairName" : keypair}).text)
            except Exception:
                return make_response(jsonify(keypairId=None))
        else:
            return make_response(jsonify(keypairId=None))
    else:
        return make_response(jsonify(keypairId=None))

    return make_response(jsonify(keypairId))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port=8080, threaded=True)
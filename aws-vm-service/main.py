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

    if content:
        try:
            vm = VMModel(content['instanceType'], content['keyName'], content['imageId'])
        except KeyError:
            return make_response(jsonify(instanceId = None))

        if content['securityGroups']:
            for securitygroup in content['securityGroups']:
                vm.addSecurityGroup(securitygroup)

            try:
                response = client.run_instances(
                    ImageId=vm.imageId,
                    InstanceType=vm.instanceType,
                    KeyName=vm.keyname,
                    SecurityGroupIds=vm.securiyGroups,
                    DryRun=False,
                    MaxCount=1,
                    MinCount=1
                )
            except Exception:
                return make_response(jsonify(instanceId=None))
        else:
            try:
                response = client.run_instances(
                    ImageId=vm.imageId,
                    InstanceType=vm.instanceType,
                    KeyName=vm.keyname,
                    DryRun=False,
                    MaxCount=1,
                    MinCount=1
                )
            except Exception:
                return make_response(jsonify(instanceId=None))


        if response['Instances']:
            instanceId = response['Instances'][0]['InstanceId']
            return make_response(jsonify(instanceId=instanceId))


    return make_response(jsonify(instanceId=None))

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
                pass

    if not imageId:
        try:
            imageId = json.loads(requests.get(imageURL + '/images' + content['imageName']).text)
        except Exception:
            return make_response(jsonify(imageId=None))
    return make_response(jsonify(imageId=imageId))


@app.route('/vm/types/<maxMemory>', methods=['GET'])
@app.route('/vm/types', methods=['GET'])
def loadInstanceType(maxMemory=None):
    if maxMemory:
        try:
            types = json.loads(requests.get(instancetypeURL + '/types/' + maxMemory).text)
        except Exception:
            return make_response(jsonify(types=[]))
    else:
        try:
            types = json.loads(requests.get(instancetypeURL + '/types').text)
        except Exception:
            return make_response(jsonify(types=[]))

    return make_response(jsonify(types))


@app.route('/vm/keypair', methods=['POST'])
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


@app.route('/vm/securitygroup', methods=['POST'])
def loadOrCreateSecurityGroup():
    content = request.get_json()

    if content and content['groupName']:
        try:
            groupId = json.loads(requests.post(securitygroupURL + '/securityGroup',json=content).text)
            if groupId:
                return make_response(jsonify(groupId))
        except Exception:
            pass

    return make_response(jsonify(groupId=None))

#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port=8080, threaded=True)
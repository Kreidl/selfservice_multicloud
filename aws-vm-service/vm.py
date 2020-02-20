from flask import jsonify, request, make_response
import json
import boto3
import os
import requests

from Models.VMModel import VMModel

client = boto3.client(
    'ec2',
    aws_access_key_id=os.environ['accessKey'],
    aws_secret_access_key = os.environ['secretKey'],
    region_name='eu-central-1'
    )

def getVM(instanceId):
    if instanceId:
        try:
            response = client.describe_instances(
                InstanceIds=[
                    instanceId,
                ],
                DryRun=False
            )

            if response['Reservations']:
                instance = response['Reservations'][0]['Instances']
                return make_response(jsonify(instance=instance))
        except Exception:
            pass

    return make_response(jsonify(instance=None))



def loadAllVM():
    #try:
    response = client.describe_instances(
        DryRun=False
    )

    if response['Reservations']:
        instances = response['Reservations']
        return make_response(jsonify(instances=instances))
    #except Exception:
    #    pass

    return make_response(jsonify(instances=None))

def stopVM(instanceId):
    if instanceId:
        try:
            response = client.stop_instances(
            InstanceIds=[
                instanceId
            ],
            DryRun=False
            )

            state = response['StoppingInstances'][0]['CurrentState']['Name']
            return make_response(jsonify(State=state))

        except Exception:
            pass

    return make_response(jsonify(State=None))

def startVM(instanceId):
    if instanceId:
        try:
            response = client.start_instances(
                InstanceIds=[
                     instanceId
                ],
                DryRun=False
            )

            state = response['StartingInstances'][0]['CurrentState']['Name']
            return make_response(jsonify(State=state))

        except Exception:
            pass

    return make_response(jsonify(State=None))

def createVM():
    #get the provided json body
    content = request.get_json()
    if content:
        try:
            vm = VMModel(content['instanceType'], content['keyName'], content['imageId'], content['vmname'])
        except KeyError:
            return make_response(jsonify(instanceId=None))
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
            client.create_tags(Resources=[instanceId], Tags=[{'Key':'Name', 'Value':vm.vmname}])
            return make_response(jsonify(instanceId=instanceId))

    return make_response(jsonify(instanceId=None))

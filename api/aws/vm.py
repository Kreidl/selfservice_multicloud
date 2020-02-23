from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
vmURL = config.get('MicroServiceURL', 'aws-vm')


def createVM():
    #get the provided json body
    content = request.get_json()

    if content and content['instanceType'] and content['keyName'] and content['imageId'] and content['vmname']:
        try:
            instanceId = json.loads(requests.post(vmURL + '/vm',json=content).text)
            if instanceId:
                return make_response(jsonify(instanceId))
        except Exception:
            pass

    return make_response(jsonify(instanceId=None))



def loadAllVM():
    try:
        instances = json.loads(requests.get(vmURL + '/vm').text)
        if instances:
            return make_response(jsonify(instances))
    except Exception:
        pass

    return make_response(jsonify(instances=None))


def getVM(instanceId):
    if instanceId:
        try:
            instance = json.loads(requests.get(vmURL + '/vm/' + instanceId).text)
            if instance:
                return make_response(jsonify(instance))
        except Exception:
            pass

    return make_response(jsonify(instance=None))


def stopVM(instanceId):
    if instanceId:
        try:
            instance = json.loads(requests.patch(vmURL + '/vm/' + instanceId).text)
            if instance:
                return make_response(jsonify(instance))
        except Exception:
            pass

    return make_response(jsonify(instance=None))


def startVM(instanceId):
    if instanceId:
        try:
            instance = json.loads(requests.put(vmURL + '/vm/' + instanceId).text)
            if instance:
                return make_response(jsonify(instance))
        except Exception:
            pass

    return make_response(jsonify(instance=None))
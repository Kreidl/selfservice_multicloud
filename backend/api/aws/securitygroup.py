
from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
securitygroupURL = config.get('MicroServiceURL', 'aws-securitygroup')

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

def loadOrCreateSecurityGroupWithAuthorization():
    content = request.get_json()

    if content and content['groupName']:
        try:
            groupId = json.loads(requests.post(securitygroupURL + '/securityGroup',json=content).text)
            if groupId:
                return make_response(jsonify(groupId))
        except Exception:
            pass

    return make_response(jsonify(groupId=None))


def loadAllSecurityGroups():
    try:
        groups = json.loads(requests.get(securitygroupURL + '/securityGroup').text)
        if groups:
            return make_response(jsonify(groups))
    except Exception:
        pass

    return make_response(jsonify(groups=None))

def deleteSecurityGroup():
    content = request.get_json()

    if content and content['groupName']:
        try:
            groupId = json.loads(requests.delete(securitygroupURL + '/securityGroup',json=content).text)
            if groupId:
                return make_response(jsonify(groupId))
        except Exception:
            pass

    return make_response(jsonify(groupId=None))

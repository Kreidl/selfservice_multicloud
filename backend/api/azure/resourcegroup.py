from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
resourceURL = config.get('MicroServiceURL', 'azure-resource')


#CreateResourceGroup
def createOrUpdateResourceGroup():
    content = request.get_json()
    if content and content['groupName']:
        try:
            resourcegroup = json.loads(requests.post(resourceURL + '/resource',json=content).text)
            return make_response(jsonify(resourcegroup))
        except Exception:
            pass

    return make_response(jsonify(None))


#Get all Resourcegroups
def getAllResourceGroups():
    try:
        resourcegroup = json.loads(requests.get(resourceURL + '/resource').text)
        return make_response(jsonify(resourcegroup))
    except Exception:
        pass

    return make_response(jsonify(None))

#Get a ResourceGroup
def getAResourceGroup(groupName):
    if groupName:
        try:
            resourcegroup = json.loads(requests.get(resourceURL + '/resource/'+groupName).text)
            return make_response(jsonify(resourcegroup))
        except Exception:
            pass

    return make_response(jsonify(None))


#Delete ResourceGroup
def deleteResourceGroup():
    content = request.get_json()
    if content and content['groupName']:
        #try:
            resourcegroup = json.loads(requests.delete(resourceURL + '/resource',json=content).text)
            return make_response(jsonify(resourcegroup))
        #except Exception:
        #    pass

    return make_response(jsonify(None))

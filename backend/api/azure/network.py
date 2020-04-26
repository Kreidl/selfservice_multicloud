from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
networkURL = config.get('MicroServiceURL', 'azure-network')


#CreateANetwork
def createANetwork():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['vnetName'] and content['networkIp']:
        try:
            network = json.loads(requests.post(networkURL + '/network',json=content).text)
            return make_response(jsonify(network))
        except Exception:
            pass

    return make_response(jsonify(None))

#GetAllnetworks
def getAllNetworks():
    content = request.get_json()
    if content and content['resourcegroupname']:
        try:
            networks = json.loads(requests.patch(networkURL + '/network',json=content).text)
            return make_response(jsonify(networks))
        except Exception:
            pass

    return make_response(jsonify(None))

#Get a Network
def getANetwork(networkName):
    content = request.get_json()
    if networkName and content and content['resourcegroupname']:
        try:
            network = json.loads(requests.patch(networkURL + '/network/'+networkName,json=content).text)
            return make_response(jsonify(network))
        except Exception:
            pass

    return make_response(jsonify(None))

#Delete Network
def deleteNetwork():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['vnetName']:
        try:
            network = json.loads(requests.delete(networkURL + '/network',json=content).text)
            return make_response(jsonify(network))
        except Exception:
            pass

    return make_response(jsonify(None))

#Createsubnet
def createOrUpdateSubnet():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['vnetName'] and content['subnetName'] and content['subnetIp']:
        try:
            subnet = json.loads(requests.post(networkURL + '/subnet',json=content).text)
            return make_response(jsonify(subnet))
        except Exception:
            pass

    return make_response(jsonify(None))

#Create NIC
def CreateOrUpdateNic():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['nicname'] and content['ipconfigname'] and content['subnetid'] and content['vnetName']:
        try:
            nic = json.loads(requests.post(networkURL + '/nic',json=content).text)
            return make_response(jsonify(nic))
        except Exception:
            pass

    return make_response(jsonify(None))

#get all NIC
def getALLNIC():
    content = request.get_json()
    if content and content['resourcegroupname']:
        try:
            nic = json.loads(requests.patch(networkURL + '/nic',json=content).text)
            return make_response(jsonify(nic))
        except Exception:
            pass

    return make_response(jsonify(None))

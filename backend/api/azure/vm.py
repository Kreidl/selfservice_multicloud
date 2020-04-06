from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
vmURL = config.get('MicroServiceURL', 'azure-vm')


#create VM
def createaVM():
    content = request.get_json()
    if (content and content['resourcegroupname'] and content['vmname'] and
    content['username'] and content['password'] and content['vmsize'] and
    content['publishername'] and content['offername'] and content['skuname'] and content['version'] and content['nicid']):
        #try:
        vm = json.loads(requests.post(vmURL + '/vm',json=content).text)
        return make_response(jsonify(vm))
        #except Exception:
        #    pass

    return make_response(jsonify(None))

#Get all VMS in resourcegroup
def getAllVMS():
    content = request.get_json()
    if content and content['resourcegroupname']:
        try:
            vms = json.loads(requests.patch(vmURL + '/vm',json=content).text)
            return make_response(jsonify(vms))
        except Exception:
            pass

    return make_response(jsonify(None))

#Get a VM
def getaVM(vmName):
    content = request.get_json()
    if vmName and content and content['resourcegroupname']:
        try:
            vm = json.loads(requests.patch(vmURL + '/vm/'+vmName,json=content).text)
            return make_response(jsonify(vm))
        except Exception:
            pass

    return make_response(jsonify(None))

#Delete VM
def deleteVM():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['vmname']:
        try:
            vm = json.loads(requests.delete(vmURL + '/vm',json=content).text)
            return make_response(jsonify(vm))
        except Exception:
            pass

    return make_response(jsonify(None))

#start VM
def startVM():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['vmname']:
        try:
            vm = json.loads(requests.put(vmURL + '/vm',json=content).text)
            return make_response(jsonify(vm))
        except Exception:
            pass

    return make_response(jsonify(None))

#stop VM
def stopVM():
    content = request.get_json()
    if content and content['resourcegroupname'] and content['vmname']:
        try:
            vm = json.loads(requests.head(vmURL + '/vm',json=content).text)
            return make_response(jsonify(vm))
        except Exception:
            pass

    return make_response(jsonify(None))

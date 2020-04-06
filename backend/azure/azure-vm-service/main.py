from flask import Flask, jsonify, make_response, request
from azure.common.credentials import ServicePrincipalCredentials
from azure.mgmt.compute import ComputeManagementClient
import os, json

subscription_id = os.environ["subscriptionId"]

credentials = ServicePrincipalCredentials(
    client_id=os.environ["clientId"],
    secret=os.environ["secret"],
    tenant=os.environ["tenantId"],
)

compute_client = ComputeManagementClient(credentials, subscription_id)

compute_group_params = "westeurope"


app = Flask(__name__)

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the azure vm service"


#create VM
@app.route('/vm', methods=['POST'])
def createaVM():
    content = request.get_json()
    if content:
        vm = compute_client.virtual_machines.create_or_update(
            content['resourcegroupname'],
            content['vmname'],
            {
                'location': compute_group_params,
                'os_profile': {
                    'computer_name': content['vmname'],
                    'admin_username': content['username'],
                    'admin_password': content['password']
                },
                'hardware_profile': {
                    'vm_size': content['vmsize']
                },
                'storage_profile': {
                    'image_reference': {
                        'publisher': content['publishername'],
                        'offer': content['offername'],
                        'sku': content['skuname'],
                        'version': content['version']
                    },
                },
                'network_profile': {
                    'network_interfaces': [{
                        'id': '/subscriptions/'+subscription_id+'/resourceGroups/'+content['resourcegroupname']+'/providers/Microsoft.Network/networkInterfaces/'+content['nicid'],
                    }]
                },
            }
        ).result().serialize()

        return make_response(jsonify(json.loads(json.dumps(vm))))

    return make_response(jsonify(None))

#Get all VMS in resourcegroup
@app.route('/vm', methods=['PATCH'])
def getAllVMS():
    content = request.get_json()
    if content:
        vmList = [vm.serialize() for vm in compute_client.virtual_machines.list(content['resourcegroupname'])]
        return make_response(jsonify(json.loads(json.dumps(vmList))))

    return make_response(jsonify(None))

#Get a VM
@app.route('/vm/<vmName>', methods=['PATCH'])
def getaVM(vmName):
    content = request.get_json()
    if content and vmName:
        vm = compute_client.virtual_machines.get(content['resourcegroupname'], vmName).serialize()
        return make_response(jsonify(json.loads(json.dumps(vm))))
    return make_response(jsonify(None))


#Delete VM
@app.route('/vm', methods=['DELETE'])
def deleteVM():
    content = request.get_json()
    if content:
        network = compute_client.virtual_machines.delete(content['resourcegroupname'], content['vmname'])

    return make_response(jsonify(None))


#start VM
@app.route('/vm', methods=['PUT'])
def startVM():
    content = request.get_json()
    if content:
        vm = compute_client.virtual_machines.start(content['resourcegroupname'], content['vmname']).result().serialize()
        return make_response(jsonify(json.loads(json.dumps(vm))))

    return make_response(jsonify(None))


#stop VM
@app.route('/vm', methods=['HEAD'])
def stopVM():
    content = request.get_json()
    if content:
        vm = compute_client.virtual_machines.power_off(content['resourcegroupname'], content['vmname']).result().serialize()
        return make_response(jsonify(json.loads(json.dumps(vm))))

    return make_response(jsonify(None))




#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

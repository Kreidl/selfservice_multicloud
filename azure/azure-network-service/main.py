from flask import Flask, jsonify, make_response, request
from azure.common.credentials import ServicePrincipalCredentials
from azure.mgmt.network import NetworkManagementClient
import os, json

from Models.NetworkModel import NetworkModel
from Models.SubnetModel import SubnetModel

subscription_id = os.environ["subscriptionId"]

credentials = ServicePrincipalCredentials(
    client_id=os.environ["clientId"],
    secret=os.environ["secret"],
    tenant=os.environ["tenantId"],
)

network_client = NetworkManagementClient(credentials, subscription_id)

network_group_params = "westeurope"


app = Flask(__name__)

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the azure network service"


#CreateNework
@app.route('/network', methods=['POST'])
def createOrUpdateNetwork():
    content = request.get_json()
    if content:
        try:
            network = NetworkModel(content['resourcegroupname'], content['vnetName'], content['networkIp'])
            vnet = network_client.virtual_networks.create_or_update(
                network.resourcegroupname,
                network.vnetName,
                {
                    'location': network_group_params,
                    'address_space': {
                        'address_prefixes': [network.networkIp]
                    }
                }
            ).result().serialize()

            return make_response(jsonify(json.loads(json.dumps(vnet))))
        except Exception:
            pass

    return make_response(jsonify(None))

#Get all Networks in resourcegroup
@app.route('/network', methods=['PATCH'])
def getAllNetworks():
    content = request.get_json()
    if content:
        networkList = [vm_size.serialize() for vm_size in network_client.virtual_networks.list(content['resourcegroupname'])]
        return make_response(jsonify(json.loads(json.dumps(networkList))))

    return make_response(jsonify(None))

#Get a Network
@app.route('/network/<networkName>', methods=['PATCH'])
def getANetwork(networkName):
    content = request.get_json()
    if content and networkName:
        try:
            network = network_client.virtual_networks.get(content['resourcegroupname'], networkName).serialize()
            #networkList = [vm_size.serialize() for vm_size in network_client.virtual_networks.list(content['resourcegroupname'], networkName)]
            return make_response(jsonify(json.loads(json.dumps(network))))
        except Exception:
            pass

    return make_response(jsonify(None))


#Delete Network
@app.route('/network', methods=['DELETE'])
def deleteNetwork():
    content = request.get_json()
    if content:
        try:
            network = network_client.virtual_networks.delete(content['resourcegroupname'], content['vnetName'])
        except Exception:
            pass

    return make_response(jsonify(None))


#Createsubnet
@app.route('/subnet', methods=['POST'])
def createOrUpdateSubnet():
    content = request.get_json()
    if content:
        try:
            subnetModel = SubnetModel(content['resourcegroupname'], content['vnetName'], content['subnetName'], content['subnetIp'])
            # Create Subnet
            newsubnet = network_client.subnets.create_or_update(
                subnetModel.resourcegroupname,
                subnetModel.vnetName,
                subnetModel.subnetName,
                {'address_prefix': subnetModel.subnetIp}
            ).result().serialize()

            return make_response(jsonify(json.loads(json.dumps(newsubnet))))
        except Exception:
            pass

    return make_response(jsonify(None))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

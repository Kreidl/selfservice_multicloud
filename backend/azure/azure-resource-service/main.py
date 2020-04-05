from flask import Flask, jsonify, make_response, request
from azure.common.credentials import ServicePrincipalCredentials
from azure.mgmt.resource import ResourceManagementClient
import os, json

from Models.ResourceGroupModel import ResourceGroupModel

subscription_id = os.environ["subscriptionId"]

credentials = ServicePrincipalCredentials(
    client_id=os.environ["clientId"],
    secret=os.environ["secret"],
    tenant=os.environ["tenantId"],
)

client = ResourceManagementClient(credentials, subscription_id)

resource_group_params = {"location": "westeurope"}

app = Flask(__name__)

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the azure resource service"


#CreateResourceGroup
@app.route('/resource', methods=['POST'])
def createOrUpdateResourceGroup():
    content = request.get_json()
    try:
        groups =[]
        if content:
            group = client.resource_groups.create_or_update(content['groupName'], resource_group_params)
            if group.properties and group.properties.provisioning_state:
                groups.append(ResourceGroupModel(group.name, group.id, group.location, group.tags, group.properties.provisioning_state))
            else:
                groups.append(ResourceGroupModel(group.name, group.id, group.location, group.tags, None))
            return jsonify(json.loads(json.dumps([ob.__dict__ for ob in groups])))
    except Exception:
        pass

    return make_response(jsonify(None))

#Get all Resourcegroups
@app.route('/resource', methods=['GET'])
def getAllResourceGroups():
    groups = []
    for group in client.resource_groups.list():
        if group.properties and group.properties.provisioning_state:
            groups.append(ResourceGroupModel(group.name, group.id, group.location, group.tags, group.properties.provisioning_state))
        else:
            groups.append(ResourceGroupModel(group.name, group.id, group.location, group.tags, None))
    return jsonify(json.loads(json.dumps([ob.__dict__ for ob in groups])))

#Get a ResourceGroup
@app.route('/resource/<groupName>', methods=['GET'])
def getAResourceGroup(groupName):
    groups = []
    for group in client.resources.list_by_resource_group(groupName):
        if group.properties and group.properties.provisioning_state:
            groups.append(ResourceGroupModel(group.name, group.id, group.location, group.tags, group.properties.provisioning_state))
        else:
            groups.append(ResourceGroupModel(group.name, group.id, group.location, group.tags, None))
    return jsonify(json.loads(json.dumps([ob.__dict__ for ob in groups])))

#Delete ResourceGroup
@app.route('/resource', methods=['DELETE'])
def deleteResourceGroup():
    content = request.get_json()
    try:
        if content:
            client.resource_groups.delete(content['groupName'])
    except Exception:
        pass

    return make_response(jsonify(None))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

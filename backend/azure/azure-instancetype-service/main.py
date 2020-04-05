from flask import Flask, jsonify, make_response
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
    return "welcome at the azure instancetype service"


#Get all InstanceTypes
@app.route('/types', methods=['GET'])
def getAllInstanceTypes():
    vmSizesList = [vm_size.serialize() for vm_size in compute_client.virtual_machine_sizes.list(compute_group_params)]
    return make_response(jsonify(json.loads(json.dumps(vmSizesList))))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

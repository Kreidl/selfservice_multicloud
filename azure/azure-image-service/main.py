from flask import Flask, jsonify, make_response, request
from azure.common.credentials import ServicePrincipalCredentials
from azure.mgmt.compute import ComputeManagementClient
import os, json#, time
#from datetime import datetime, timedelta

from Models.PublisherModel import PublisherModel
from Models.ImageModel import ImageModel
from Models.PublisherListModel import PublisherListModel
from Models.SkuModel import SkuModel

subscription_id = os.environ["subscriptionId"]

credentials = ServicePrincipalCredentials(
    client_id=os.environ["clientId"],
    secret=os.environ["secret"],
    tenant=os.environ["tenantId"],
)

compute_client = ComputeManagementClient(credentials, subscription_id)

compute_group_params = "westeurope"

fileName = "images.json"

app = Flask(__name__)

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the azure image service"


#Get all Image Publishers
@app.route('/pub', methods=['GET'])
def getAllPublishers():
    publisherList = [vm.serialize() for vm in compute_client.virtual_machine_images.list_publishers(compute_group_params)]
    return make_response(jsonify(json.loads(json.dumps(publisherList))))

#Get all Offers from Publisher
@app.route('/offer', methods=['PATCH'])
def getAllOffersForPub():
    content = request.get_json()
    if content:
        offerList = [offer.serialize() for offer in compute_client.virtual_machine_images.list_offers(compute_group_params, content['publishername'])]
        return make_response(jsonify(json.loads(json.dumps(offerList))))

    return make_response(jsonify(None))

#Get all SKUS from Image
@app.route('/sku', methods=['PATCH'])
def getAllSkusForimage():
    content = request.get_json()
    if content:
        skuList = [sku.serialize() for sku in compute_client.virtual_machine_images.list_skus(compute_group_params,content['publishername'],content['imagename'])]
        return make_response(jsonify(json.loads(json.dumps(skuList))))

    return make_response(jsonify(None))

#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

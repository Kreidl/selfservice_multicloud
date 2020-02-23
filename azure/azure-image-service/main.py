from flask import Flask, jsonify, make_response
from azure.common.credentials import ServicePrincipalCredentials
from azure.mgmt.compute import ComputeManagementClient
import os, json, time
from datetime import datetime, timedelta

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


#Get all Images
@app.route('/image', methods=['GET'])
def getAllImages():
    if not os.path.isfile(fileName):
        return make_response(jsonify(createFile()))
    else:
        creationDate = datetime.fromtimestamp(os.path.getctime(fileName)).replace(hour=0, minute=0, second=0, microsecond=0)
        today = datetime.today().replace(hour=0, minute=0, second=0, microsecond=0)
        d = timedelta(days=21)
        t = creationDate + d
        if t == creationDate:
            return make_response(jsonify(createFile()))
        else:
            return make_response(jsonify(readFile()))


def readFile():
    pubs = PublisherListModel()
    with open(fileName) as json_file:
        return json.load(json_file)

def createFile():
    pubs = PublisherListModel()
    publishers = compute_client.virtual_machine_images.list_publishers(compute_group_params)
    for pub in publishers:
        publisher = PublisherModel(pub.id, pub.name, pub.location, pub.tags)
        images = compute_client.virtual_machine_images.list_offers(compute_group_params, publisher.name)
        for image in images:
            image = ImageModel(image.id, image.name, image.location, image.tags)
            skus = result_list_skus = compute_client.virtual_machine_images.list_skus(compute_group_params,pub.name,image.name)
            for sku in skus:
                sku = SkuModel(sku.id, sku.name, sku.location, sku.tags)
                image.addsku(sku)
            publisher.addImage(image)
    pubs.addPublisher(publisher)
    #Delete file if already exists
    if os.path.isfile(fileName):
        os.remove(fileName)
    with open(fileName, 'w') as f:
        json.dump(pubs.toJSON(), f, ensure_ascii=False, indent=4)
    return pubs.toJSON()

#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

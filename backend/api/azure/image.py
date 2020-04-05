from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
imageURL = config.get('MicroServiceURL', 'azure-image')

#Get all Image Publishers
def getAllPublishers():
    try:
        publishers = json.loads(requests.get(imageURL + '/pub').text)
    except Exception:
        return make_response(jsonify(None))

    return make_response(jsonify(publishers))

#Get all Offers from Publisher
def getAllOffersForPub():
    content = request.get_json()
    if content and content['publishername']:
        try:
            offers = json.loads(requests.patch(imageURL + '/offer',json=content).text)
            return make_response(jsonify(offers))
        except Exception:
            pass

    return make_response(jsonify(None))

#Get all SKUS from Image
def getAllSkusForimage():
    content = request.get_json()
    if content and content['publishername'] and content['imagename']:
        #try:
        skus = json.loads(requests.patch(imageURL + '/sku',json=content).text)
        return make_response(jsonify(skus))
        #except Exception:
        #    pass

    return make_response(jsonify(None))

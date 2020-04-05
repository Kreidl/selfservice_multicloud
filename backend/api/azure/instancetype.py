from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
typeURL = config.get('MicroServiceURL', 'azure-instancetype')


#Get all Instancetypes
def getAllTypes():
    try:
        types = json.loads(requests.get(typeURL + '/types').text)
    except Exception:
        return make_response(jsonify(None))

    return make_response(jsonify(types))

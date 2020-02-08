
from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
instancetypeURL = config.get('MicroServiceURL', 'aws-instancetype')

def loadInstanceType(maxMemory=None):
    try:
        types = json.loads(requests.get(instancetypeURL + '/types').text)
    except Exception:
        return make_response(jsonify(types=[]))

    return make_response(jsonify(types))

def loadInstanceTypeWithMemory(maxMemory):
    if maxMemory:
        try:
            types = json.loads(requests.get(instancetypeURL + '/types/' + maxMemory).text)
        except Exception:
            return make_response(jsonify(types=[]))

    return make_response(jsonify(types))
from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
vpcURL = config.get('MicroServiceURL', 'aws-vpc')


def loadVPCs():
    try:
        vpcs = json.loads(requests.get(vpcURL + '/vpc').text)
        return make_response(jsonify(vpcs))
    except Exception:
        return make_response(jsonify(vpcs=None))

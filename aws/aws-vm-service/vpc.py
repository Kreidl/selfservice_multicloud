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

def createVPC():
    content = request.get_json()

    if content and content['ipaddress'] and content['vpcname']:
        try:
            vpc = json.loads(requests.post(vpcURL + '/vpc',json=content).text)
            return make_response(jsonify(vpc))
        except Exception:
            pass
    return make_response(jsonify(vpcId=None))

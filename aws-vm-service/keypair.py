from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
keypairURL = config.get('MicroServiceURL', 'aws-keypair')

def loadOrCreateKeyPair():
    content = request.get_json()

    if content:
        if "keypair" in content:
            keypair = content['keypair']
            # call keypair Service to Filter the latest created Image, if nothing found or other error return null on method
            try:
                keypairId = json.loads(requests.post(keypairURL + '/keypair', json={"keypairName" : keypair}).text)
            except Exception:
                return make_response(jsonify(keypairId=None))
        else:
            return make_response(jsonify(keypairId=None))
    else:
        return make_response(jsonify(keypairId=None))

    return make_response(jsonify(keypairId))
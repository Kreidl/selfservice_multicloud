from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
authenticatonURL = config.get('MicroServiceURL', 'authentication')


def login():
    content = request.get_json()

    if content and content['userId'] and content['password']:
        token = json.loads(requests.post(authenticatonURL + '/auth', json=content).text)

        if token:
            return make_response(jsonify(token))

    return make_response(jsonify(token=None))

def verify(token):
    if token:
        message = json.loads(requests.post(authenticatonURL + '/verify', json={"token" : token}).text)
        if message:
            return make_response(message)
    return make_response(jsonify(message=None))

def checkAuthorization(authorizationType, token):
    if token and authorizationType:
        if authorizationType == 'AWS':
            message = json.loads(requests.post(authenticatonURL + '/awsauthorize', json={"token" : token}).text)
            if message:
                return make_response(jsonify(message))
        elif authorizationType == 'Azure':
            message = json.loads(requests.post(authenticatonURL + '/azureauthorize', json={"token" : token}).text)
            if message:
                return make_response(jsonify(message))

    return make_response(jsonify(message=None))

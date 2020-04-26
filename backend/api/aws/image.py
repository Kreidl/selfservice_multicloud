from flask import jsonify, request, make_response
import json
import requests
import configparser
from util.AuthenticationCheck import checkIfAuthorized


config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
imageURL = config.get('MicroServiceURL', 'aws-image')


import sys
# insert at 1, 0 is the script path (or '' in REPL)
sys.path.insert(1, 'authentication/')




def loadImages():
    content = request.get_json()

    checkIfAuthorized(content)

    imageId = None
    if "imageId" in content:
        imageId = json.loads(requests.get(imageURL + '/images/' + content['imageId']).text)
    elif "imageName" in content:
        # call Image Service to Filter the latest created Image, if nothing found or other error return null on method
        try:
            imageId = json.loads(requests.get(imageURL + '/images/' + content['imageName']).text)
        except Exception:
            pass
    if not imageId:
        try:
            imageId = json.loads(requests.get(imageURL + '/images').text)
        except Exception:
            return make_response(jsonify(images=None))
    return make_response(jsonify(imageId))

from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
imageURL = config.get('MicroServiceURL', 'aws-image')


def loadImages():
    content = request.get_json()

    imageId = None
    if content:
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
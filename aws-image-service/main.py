from flask import Flask, jsonify, make_response
import boto3
import os

client = boto3.client(
    'ec2',
    aws_access_key_id=os.environ['accessKey'],
    aws_secret_access_key = os.environ['secretKey'],
    region_name='eu-central-1'
    )

app = Flask(__name__)

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the aws image service"


@app.route('/images', methods=['GET'])
def getAllImages():
    images = client.describe_images(
        Filters=[
            dict(Name='owner-alias', Values=['amazon'])
        ])
    return make_response(jsonify(images=images['Images']))



@app.route('/ownImages', methods=['GET'])
def getOwnImages():
    images = client.describe_images(Owners=['self'])
    return make_response(jsonify(images=images['Images']))


@app.route('/images/<imageName>', methods=['GET'])
def getImageByName(imageName):
    if imageName:
        images = client.describe_images(
            Filters=[
                dict(Name='name', Values=[imageName+'*']),
                dict(Name='owner-id', Values=['099720109477'])
            ]
        )
        return make_response(jsonify(images=images['Images']))
    return make_response(jsonify(images=None))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)
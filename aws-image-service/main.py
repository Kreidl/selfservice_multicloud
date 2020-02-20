from flask import Flask, jsonify, make_response
import boto3
import os

client = boto3.client(
    'ec2',
    aws_access_key_id=os.environ['accessKey'],
    aws_secret_access_key=os.environ['secretKey'],
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



@app.route('/images/own', methods=['GET'])
def getOwnImages():
    images = client.describe_images(Owners=['self'])
    return make_response(jsonify(images=images['Images']))


@app.route('/images/<imageName>', methods=['GET'])
def getImageByName(imageName):
    images = None
    if imageName:
        try:
            images = client.describe_images(
                Filters=[
                    dict(Name='name', Values=[imageName+'*'])
                ]
            )
        except Exception:
            pass
        if not images['Images']:
            try:
                images = client.describe_images(
                    Filters=[
                        dict(Name='image-id', Values=[imageName])
                    ]
                )

            except Exception:
                pass

        if images['Images']:
            return make_response(jsonify(images=images['Images']))

    return make_response(jsonify(images=None))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

from flask import Flask, jsonify, request, make_response
import json
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
    return "welcome at the aws keypair service"

@app.route('/keypair', methods=['POST'])
def createKeyPair():
    #get the provided json body
    content = request.get_json()
    try:
        resp = json.loads(getKeyPair(content['keypairName']).data)
    except KeyError:
        return make_response(jsonify(keypairId = None))


    if not resp['keypairId']:
        response = client.create_key_pair(
        KeyName=content['keypairName'],
        DryRun=False)

        return make_response(jsonify(keypairId=response['KeyPairId']))
    else:
        return make_response(jsonify(resp))
    return make_response(jsonify(keypairId=None))

@app.route('/keypair', methods=['GET'])
def getKeyPairs():
    #Search group based on Name on aws
    response = client.describe_key_pairs()

    if response['KeyPairs']:
        keypairs = response['KeyPairs']
        return make_response(jsonify(keypairs=keypairs))


@app.route('/keypair/<keypairname>', methods=['GET'])
def getKeyPair(keypairname):
    if keypairname:
        #Search group based on Name on aws
        response = client.describe_key_pairs(
            Filters=[
                dict(Name='key-name', Values=[keypairname])
            ]
        )
        if response['KeyPairs']:
            keypairId = response['KeyPairs'][0]['KeyPairId']
            return make_response(jsonify(keypairId=keypairId))
    return make_response(jsonify(keypairId=None))


@app.route('/keypair', methods=['DELETE'])
def deleteKeyPair():
    content = request.get_json()
    if content and content['keypairname']:
        #Deletes the key_pair
        response = client.delete_key_pair(KeyName=content['keypairname'])
        return make_response(keypairId(response))

    return make_response(jsonify(None))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

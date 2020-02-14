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
    return "welcome at the aws vpc service"

#Get VPC's
@app.route('/vpc', methods=['GET'])
def getAllVPC():
    try:
        vpcs = client.describe_vpcs()
        if vpcs:
            return make_response(jsonify(vpcs=vpcs['Vpcs']))
    except Exception:
        pass
    return make_response(jsonify(vpcs=None))

#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

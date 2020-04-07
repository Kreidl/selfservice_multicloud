from flask import Flask, jsonify, make_response, request
import boto3
import os
from Models.VPCModel import VPCModel

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


#create VPC's
@app.route('/vpc', methods=['POST'])
def createVPC():
    #get the provided json body
    content = request.get_json()
    #try:
    vpcmodel = VPCModel(content['ipaddress'], content['vpcname'])
    # create VPC
    vpc = client.create_vpc(CidrBlock=vpcmodel.ipaddress)
    # assign a name to our VPC
#    vpcs = client.describe_vpcs()
    if vpc:
        client.create_tags(Resources=[vpc['Vpc']['VpcId']], Tags=[{'Key':'Name', 'Value':vpcmodel.vpcname}])
        return make_response(jsonify(vpcId=vpc['Vpc']['VpcId']))
    #except Exception:
    #    pass
    return make_response(jsonify(vpcId=None))

#delete Vpc
@app.route('/vpc', methods=['DELETE'])
def deleteVPC():
    content = request.get_json()
    if content and content['VpcId']:
        try:
            response = client.delete_vpc(VpcId=content['VpcId'])
            return make_response(keypairId(response))
        except Exception:
            pass
    return make_response(jsonify(vpcs=None))


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run('0.0.0.0', port = 8080, threaded=True)

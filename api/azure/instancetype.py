from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
typeURL = config.get('MicroServiceURL', 'azure-instancetype')

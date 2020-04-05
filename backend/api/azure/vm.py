from flask import jsonify, request, make_response
import json
import requests
import configparser

config = configparser.ConfigParser()
config.read_file(open(r'config.txt'))
vmURL = config.get('MicroServiceURL', 'azure-vm')

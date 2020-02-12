#!/bin/bash

#Install api from backend (aws-vm service)
openapi-generator generate -g typescript-angular -o ./aws -i awsapi.json

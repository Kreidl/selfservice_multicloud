#!/bin/bash

#Install api from backend (aws-vm service)
openapi-generator generate -g typescript-angular -o . -i http://localhost:32400/api/openapi.json

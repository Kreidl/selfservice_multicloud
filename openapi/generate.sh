#!/bin/bash

#Install api in frontend from backend
openapi-generator generate -g typescript-angular -o ../frontend/src/app/api -i backendapi.json

$SHELL

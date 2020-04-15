#/bin/#!/usr/bin/env bash

#build Authentication
docker build -t authenthication:v1 ../authnode
#build api
docker build -t api:v1 ../backend/api
#build aws-image
docker build -t aws-image:v1 ../backend/aws/aws-image-service
#build aws-instance
mvn -f ../backend/aws/aws-instancetype-service compile jib:build
#build aws-keypair
docker build -t aws-keypair:v1 ../backend/aws/aws-keypair-service
#build aws-security
docker build -t aws-security:v1 ../backend/aws/aws-securitygroup-service
#build aws-vm
docker build -t aws-vm:v1 ../backend/aws/aws-vm-service
#build aws-vpc
docker build -t aws-vpc:v1 ../backend/aws/aws-vpc-service
#build azure-image
docker build -t azure-image:v1 ../backend/azure/azure-image-service
#build azure-instance
docker build -t azure-instance:v1 ../backend/azure/azure-instancetype-service
#build azure-network
docker build -t azure-network:v1 ../backend/azure/azure-network-service
#build azure-resource
docker build -t azure-resource:v1 ../backend/azure/azure-resource-service
#build azure-vm
docker build -t azure-vm:v1 ../backend/azure/azure-vm-service
#build frontend
docker build -t frontend:v1 ../frontend

$SHELL

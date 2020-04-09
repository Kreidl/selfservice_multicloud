# selfservice_multicloud UNDER CONSTRUCTION
A Self service platform for creating Resources in aws and azure

## If you want to contribute feel free to open issue so I can see

## External things needed
There should be an active Secret in Kubernetes in this Structure:
<pre>
apiVersion: v1<br/>
kind: Secret<br/>
metadata:<br/>
  name: multicloud<br/>
  namespace: multicloud<br/>
type: Opaque<br/>
stringData:<br/>
    awsaccessKey: "YOUR ACCESS KEY TO AWS (EC2)"<br/>
    awssecretKey: "YOUR SECRET KEY FOR AWS EC2 User"<br/>
    azuresubscriptionId: "YOUR Azure SubscriptionId"<br/>
    azureclientId: "YOUR Azure APP Client Id"<br/>
    azuresecret: "YOUR Azure APP Secret"<br/>
    azureTenantId: "YOUR Azure APP Tenant Id"<br/>
    ldappassword: "Your LDAP Password"<br/>
</pre>


I created a namespace (namespace.yaml).<br/>
To set the context to all kubectl commands run: <br/>
kubectl config set-context --current --namespace=multicloud<br/>

Otherwise the namespace needs to be defined in every command

## Update API
Update swagger.yaml in AWS VM service<br/>
Installation: npm install @openapitools/openapi-generator-cli -g<br/><br/>
Get the api.json from aws-vm (Edit services.yaml to enable NodePort or Loadbalancer and copy SERVER_NAME:PORT/awsapi/openapi.json into the file awsapi.json)<br/>
Run generate.sh under frontend/src/app/api to update API

### Define API
To define the api use this url [Swagger Editor](https://editor.swagger.io/)


## Azure Credentials
Create a SubScription and add in the subscriptionId in the secrets file <br/>
Create a Role with the permissions to create resources, start,stop and delete<br/>
Create an app registration and copy client and tenantId in the secrets file<br/>
Create a new secret and copy the value in the secrets file<br/>

## Authentication
For this a ldap statefulSet is deployed (see in authentication folder)<br/>
define the LDAP Domain --> Admin password needs to be in secret

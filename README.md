# selfservice_multicloud UNDER CONSTRUCTION
A Self service platform for creating Resources in aws and gcloud

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
</pre>


I created a namespace (namespace.yaml).<br/>
To set the context to all kubectl commands run: <br/>
kubectl config set-context --current --namespace=multicloud<br/>

Otherwise the namespace needs to be defined in every command

## If you want to contribute feel free to open issue so I can see 
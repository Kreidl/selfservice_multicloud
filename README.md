# selfservice_multicloud UNDER CONSTRUCTION
A Self service platform for creating Resources in aws and gcloud

## External things needed
There should be an active Secret in Kubernetes in this Structure:
apiVersion: v1
kind: Secret
metadata:
  name: multicloud
type: Opaque
stringData:
    awsaccessKey: "YOUR ACCESS KEY TO AWS (EC2)"
    awssecretKey: "YOUR SECRET KEY FOR AWS EC2 User"

## If you want to contribute feel free to open issue so I can see 
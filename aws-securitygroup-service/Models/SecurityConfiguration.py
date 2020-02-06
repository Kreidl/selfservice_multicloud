class SecurityConfiguration:
    def __init__(self, groupName, groupDescription, vpcId):
        self.groupName = groupName
        self.groupDescription = groupDescription
        self.vpcId = vpcId
        self.authorizeConfiguration = []

    def addAuthorize(self, authorization):
        self.authorizeConfiguration.append(authorization)

class VMModel:
    def __init__(self, instanceType, keyname, imageId):
        self.instanceType = instanceType
        self.keyname = keyname
        self.imageId = imageId
        self.securiyGroups = []

    def addSecurityGroup(self, securityGroup):
        self.securiyGroups.append(securityGroup)
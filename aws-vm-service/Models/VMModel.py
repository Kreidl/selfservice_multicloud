class VMModel:
    def __init__(self, instanceType, keyname):
        self.instanceType = instanceType
        self.keyname = keyname
        self.securiyGroups = []

    def addSecurityGroup(self, securityGroup):
        self.securiyGroups.append(securityGroup)
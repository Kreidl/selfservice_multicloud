class VMModel:
    def __init__(self, instanceType, keyname, imageId, vmname):
        self.instanceType = instanceType
        self.keyname = keyname
        self.imageId = imageId
        self.securiyGroups = []
        self.vmname = vmname


    def addSecurityGroup(self, securityGroup):
        self.securiyGroups.append(securityGroup)

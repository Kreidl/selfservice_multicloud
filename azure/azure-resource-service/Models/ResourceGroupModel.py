class ResourceGroupModel:
    def __init__(self, groupName, groupId, location, tags, provisioningstate):
        self.groupName = groupName
        self.groupId = groupId
        self.location = location
        self.tags = tags
        self.provisioningstate = provisioningstate

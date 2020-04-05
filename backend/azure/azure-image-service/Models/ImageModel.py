class ImageModel:
    def __init__(self, id, name, location, tags):
        self.id = id
        self.name = name
        self.location = location
        self.tags = tags
        self.skus = []

    def addsku(self, sku):
        self.skus.append(sku)    

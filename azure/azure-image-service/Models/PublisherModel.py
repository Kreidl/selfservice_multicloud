class PublisherModel:
    def __init__(self, id, name, location, tags):
        self.id = id
        self.name = name
        self.location = location
        self.tags = tags
        self.images = []

    def addImage(self, image):
        self.images.append(image)

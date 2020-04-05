import json

class PublisherListModel:
    def __init__(self):
        self.publishers = []

    def addPublisher(self, publisher):
        self.publishers.append(publisher)

    def toJSON(self):
        return json.loads(json.dumps(self, default=lambda o: o.__dict__,sort_keys=True, indent=4))

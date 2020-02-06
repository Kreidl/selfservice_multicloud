import unittest
import sys
sys.path.insert(0,'..')
from main import app, createSecurityGroup, searchSecurityGroup

# set our application to testing mode
app.testing = True

class MainTest(unittest.TestCase):

    def testGetWithCorrectResult(self):
        with app.app_context():
            self.assertEqual(searchSecurityGroup("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testGetNotCorrectResult(self):
        with app.app_context():
            self.assertNotEqual(searchSecurityGroup("default").data.decode('UTF-8').rstrip(), "Test")

    def testGetEmpty(self):
        with app.app_context():
            self.assertTrue(searchSecurityGroup("").data.decode('UTF-8').rstrip())

    def testCreateCorrect(self):
        with app.app_context():
            content = {"groupName": "ttest", "groupDescription": "Group created via app",
                   "vpcId": "vpc-038b29af8bdb5f634",
                       "authorizeConfiguration": [
                           {
                               "port": 80,
                               "ipaddress": "0.0.0.0/0",
                               "protocol": "TCP"
                           },
                           {
                               "port": 80,
                               "ipaddress": "62.178.238.153/32",
                               "protocol": "TCP"
                           }
                       ]}
            with app.test_client() as client:
                # send data as POST form to endpoint
                #sent = {'return_url': 'my_test_url'}
                result = client.post(
                    '/securityGroup/',
                    json=content
                )
                self.assertTrue(
                    result.data
                )

        #self.assertTrue(createSecurityGroup(content).data.decode('UTF-8').rstrip())

    def testOnlySecurityGroup(self):
        with app.app_context():
            content = {"groupName": "ttest", "groupDescription": "Group created via app",
                   "vpcId": "vpc-038b29af8bdb5f634"}
            with app.test_client() as client:
                # send data as POST form to endpoint
                result = client.post(
                    '/securityGroup/',
                    json=content
                )
                self.assertTrue(
                    result.data
                )

    def testOnlySecurityGroupWrongKeys(self):
        with app.app_context():
            content = {"group": "ttest", "groupDescription": "Group created via app",
                   "vpcId": "vpc-038b29af8bdb5f634"}
            with app.test_client() as client:
                # send data as POST form to endpoint
                result = client.post(
                    '/securityGroup/',
                    json=content
                )
                self.assertTrue(
                    result.data
                )

    def testCreateWithOutBody(self):
        with app.app_context():
            content = {"test": "test"}
            print(content)
            with app.test_client() as client:
                # send data as POST form to endpoint
                result = client.post(
                    '/securityGroup/',
                    json=content
                )
                self.assertRaises(
                    TypeError,
                    result.data
                )

if __name__ == "__main__":
    unittest.main()
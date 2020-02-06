import unittest
import sys
sys.path.insert(0,'..')
from main import app, createKeyPair, getKeyPair

# set our application to testing mode
app.testing = True

class MainTest(unittest.TestCase):
    def testGetWithCorrectResult(self):
        with app.app_context():
            self.assertEqual(getKeyPair("test").data.decode('UTF-8').rstrip(), "{\"keypairId\":\"key-00f9975f82d6a9ccb\"}")


    def testGetNotCorrectResult(self):
        with app.app_context():
            self.assertNotEqual(getKeyPair("default").data.decode('UTF-8').rstrip(), "Test")

    def testGetEmpty(self):
        with app.app_context():
            self.assertTrue(getKeyPair("").data.decode('UTF-8').rstrip())

    def testCreateCorrect(self):
        with app.app_context():
            content = {"keypairName": "test"}

            with app.test_client() as client:
                # send data as POST form to endpoint
                #sent = {'return_url': 'my_test_url'}
                result = client.post(
                    '/keypair/',
                    json=content
                )
                self.assertTrue(
                    result.data
                )


    def testOnlyKeyPairWrongKeys(self):
        with app.app_context():
            content = {"group": "ttest", "groupDescription": "Group created via app",
                   "vpcId": "vpc-038b29af8bdb5f634"}
            with app.test_client() as client:
                # send data as POST form to endpoint
                result = client.post(
                    '/keypair/',
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
                    '/keypair/',
                    json=content
                )
                self.assertRaises(
                    TypeError,
                    result.data
                )
if __name__ == "__main__":
    unittest.main()
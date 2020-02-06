import unittest
import sys
sys.path.insert(0,'..')
from main import app, getVM, stopVM, startVM, createVM

# set our application to testing mode
app.testing = True

class MainTest(unittest.TestCase):
    def testGetCorrect(self):
        with app.app_context():
            self.assertEqual(getVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testGetWrong(self):
        with app.app_context():
            self.assertEqual(getVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testGetEmpty(self):
        with app.app_context():
            self.assertTrue(getVM("").data.decode('UTF-8').rstrip())

    def testStopCorrect(self):
        with app.app_context():
            self.assertEqual(stopVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testStopAlreadyStopped(self):
        with app.app_context():
            self.assertEqual(stopVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testStopEmpty(self):
        with app.app_context():
            self.assertEqual(stopVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testStartCorrect(self):
        with app.app_context():
            self.assertEqual(startVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testStartAlreadyStarted(self):
        with app.app_context():
            self.assertEqual(startVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")

    def testStartEmpty(self):
        with app.app_context():
            self.assertEqual(startVM("default").data.decode('UTF-8').rstrip(), "{\"groupId\":\"sg-043cd0fddddd7a2b2\"}")


if __name__ == "__main__":
    unittest.main()
import connexion
from flask_cors import CORS

# Create the application instance
app = connexion.App(__name__, specification_dir='./')

port = 8080

# Read the swagger.yml file to configure the endpoints
app.add_api('swagger.yaml')

# add CORS support
cors = CORS(app.app, resources={r"/api/*": {"origins": "*"}})

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the api service"


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=port, threaded=True)

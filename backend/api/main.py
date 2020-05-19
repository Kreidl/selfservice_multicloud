import connexion
from flask_cors import CORS



class CorsHeaderMiddleware(object):
    def __init__(self, app):
        self.app = app

    def __call__(self, environ, start_response):
        def custom_start_response(status, headers, exc_info=None):
            # append whatever headers you need here
            headers.append(('Access-Control-Allow-Origin', '*'))
            headers.append(
                ('Access-Control-Allow-Headers', 'X-Requested-With')
            )
            headers.append(('Access-Control-Allow-Methods', 'OPTIONS'))
            return start_response(status, headers, exc_info)

        return self.app(environ, custom_start_response)

# Create the application instance
app = connexion.App(__name__, specification_dir='./')

port = 8080

app = connexion.FlaskApp(__name__, specification_dir='.')
app.add_api('api.yml')
app.app.wsgi_app = CorsHeaderMiddleware(app.app.wsgi_app)

# Read the swagger.yml file to configure the endpoints
#app.add_api('api.yml')

# add CORS support
#cors = CORS(app.app, resources={r"/api/*": {"origins": "*"}})
#cors = CORS(app.app, resources={r"*": {"origins": "*"}})

#Default Route
@app.route('/', methods=['GET'])
def index():
    return "welcome at the api service"


#Starts application if main.py is the main called file
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=port, threaded=True)

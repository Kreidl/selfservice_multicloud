from authentication.authenticate import verify, checkAuthorization
from flask import abort

def checkIfAuthorized(content):
    try:
        if content:
            if content['token']:
                verifyResp = verify(content['token']).json
                if verifyResp['response']['error'] == True:
                    abort(403, description="not Authorized")
                    #return make_response(jsonify(images=None))

                else:
                    authorizeResp = checkAuthorization('AWS', content['token']).json
                    return True
                    if authorizeResp['message'] != True:
                        abort(403, description="not Authorized")
                        #return make_response(jsonify(images=None))
    except Exception:
        pass
    abort(403, description="not Authorized")

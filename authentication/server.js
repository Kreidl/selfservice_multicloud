const ldap = require('ldapjs')
const bodyParser = require('body-parser');
const express = require('express');
const assert = require('assert');
const app = express();
const cors = require('cors');
const jwt = require('jsonwebtoken');

//Own modules
const token = require('./modules/token');


const APPPORT = process.env.APPPORT;
const LDAPBASEDN = process.env.LDAPBASEDN;
const LDAPHOST = process.env.LDAPHOST;
const LDAPPORT = process.env.LDAPPORT;
const LDAPREADONLYPASSWORD = process.env.LDAPREADONLYPASSWORD;
const LDAPREADONLYUSERNAME = process.env.LDAPREADONLYUSERNAME;
const LDAPDNPATTERN = process.env.LDAPDNPATTERN;
const LDAPPASSWORDATTRIBUTE = process.env.LDAPPASSWORDAttribute;


var client;


// enable CORS
app.use(cors());
// parse application/json
app.use(bodyParser.json());
// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', function (req,res) {
   res.send('Welcome at the authservice');
});

app.post('/auth', function (req, res) {

  client = ldap.createClient({
    url: 'ldap://'+LDAPHOST+':'+LDAPPORT
  });

  client.bind(LDAPREADONLYUSERNAME, LDAPREADONLYPASSWORD, function(err) {
    assert.ifError(err);
  });

  let searchResponseData
    authenticate(req.body.userId, req.body.password)
    .then(authenticateResponse => {
            return new Promise((resolve, reject) => {
              resolve(authenticateResponse)
            });
        })
        .then(searchResponse => {
            searchResponseData = searchResponse
            return closeConnection()
        })
        .then(closeConnectionResponse => {
            res.status(200).send(searchResponseData)
        })
        .catch(error => {
          return closeConnection()
        })

})

app.post('/verify', function (req, res) {
  response = token.verifyToken(req.body.token);
  if(response.error){
    res.status(404).send(response.message);
  }else{
    res.status(200).send(response.message);
  }
});


function authenticate(userId, password) {
  //console.log(LDAPDNPATTERN+userId)

    return new Promise((resolve, reject) => {

      const opts = {
        filter: '('+LDAPDNPATTERN+userId+')',
        scope: 'sub',
        attributes: ['cn']
      };


      client.search(LDAPBASEDN, opts, (err, res) => {

        res.on('searchEntry', entry => {
            var dn = entry.object.dn;
            resolve(dn);
        });

        res.on('error', function(err) {
          reject(err);
        });

      });

    })
    .then(function(dn) {
      return new Promise((resolve, reject) => {
        client.bind(dn, password, err => {

            if (err) {
                resolve("")
            }

            resolve(token.generateToken(dn))
      });
      });
    }, function(value) {
      // not called
    })
    .catch(error => {

    })

}


// unbind after completion of process
function closeConnection() {
    client.unbind(err => {});
}



app.listen(APPPORT, () => {
  console.log(`Server is listening on port ${APPPORT}`);
});

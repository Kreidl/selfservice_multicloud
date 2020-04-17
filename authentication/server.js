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
const LDAPREADONLYPASSWORD = process.env.LDAPREADONLYPASSWORD;
const LDAPREADONLYUSERNAME = process.env.LDAPREADONLYUSERNAME;
const LDAPHOST = process.env.LDAPHOST;
const LDAPPORT = process.env.LDAPPORT;
const LDAPBASEDN = process.env.LDAPBASEDN;
const LDAPUSERDNPATTERN = process.env.LDAPUSERDNPATTERN;
const LDAPGROUPDNPATTERN = process.env.LDAPGROUPDNPATTERN;
const AWSAUTHORIZEGROUP = process.env.AWSAUTHORIZEGROUP;
const AZUREAUTHORIZEGROUP = process.env.AZUREAUTHORIZEGROUP;
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
    url: 'ldap://'+LDAPHOST+':'+LDAPPORT,
    timeout: '10'
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
              res.status(200).send(searchResponseData);
        })
        .catch(error => {
          res.status(404).send(searchResponseData);
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


app.post('/awsauthorize', function (req, res) {
  response = token.verifyToken(req.body.token);
  if(response.error){
    res.status(404).send(response.message);
  }else{
    authorize(AWSAUTHORIZEGROUP, response.userId)
    .then(authorizationResponse => {
      res.status(200).send(authorizationResponse);
    })
    .catch(error => {
      res.status(404).send();
    })
  }
});

app.post('/azureauthorize', function (req, res) {
  response = token.verifyToken(req.body.token);
  if(response.error){
    res.status(404).send(response.message);
  }else{
    authorize(AZUREAUTHORIZEGROUP, response.userId)
    .then(authorizationResponse => {
      res.status(200).send(authorizationResponse);
    })
    .catch(error => {
      res.status(404).send();
    })
  }
});


function authorize(authorizationGroupName, userId){
  client = ldap.createClient({
    url: 'ldap://'+LDAPHOST+':'+LDAPPORT
  });

  client.bind(LDAPREADONLYUSERNAME, LDAPREADONLYPASSWORD, function(err) {
    assert.ifError(err);
  });

  userId = userId.split(",")[0].split("=")[1]
  return new Promise((resolve, reject) => {

    const opts = {
      filter: '(&(memberUid='+userId+')('+LDAPGROUPDNPATTERN+authorizationGroupName+'))',
      scope: 'sub',
      attributes: ['cn']
    };

    client.search(LDAPBASEDN, opts, (err, res) => {

      var dn;
      var entries = [];
      res.on('searchEntry', entry => {
          entries.push(entry.object);
          dn = entry.object.dn;
          resolve();
      });
      res.on('end', function(result) {
        if(entries.length == 0){
          reject()
        }
      });
    });
  })
}

function authenticate(userId, password) {

    return new Promise((resolve, reject) => {

      const opts = {
        filter: '('+LDAPUSERDNPATTERN+userId+')',
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
                reject()
            }

            resolve(token.generateToken(dn))
      });
      });
    }, function(value) {
      // not called
    })

}


// unbind after completion of process
function closeConnection() {
    client.unbind(err => {});
}



app.listen(APPPORT, () => {
  console.log(`Server is listening on port ${APPPORT}`);
});

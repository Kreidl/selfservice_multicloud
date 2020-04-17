var ldap = require('ldapjs')
var bodyParser = require('body-parser');
var express = require('express');
var assert = require('assert');
var app = express();

const APPPORT = process.env.APPPORT;
const LDAPBASEDN = process.env.LDAPBASEDN;
const LDAPHOST = process.env.LDAPHOST;
const LDAPPORT = process.env.LDAPPORT;
const LDAPREADONLYPASSWORD = process.env.LDAPREADONLYPASSWORD;
const LDAPREADONLYUSERNAME = process.env.LDAPREADONLYUSERNAME;
const LDAPDNPATTERN = process.env.LDAPDNPATTERN;
const LDAPPASSWORDATTRIBUTE = process.env.LDAPPASSWORDAttribute;


var client;


app.use(bodyParser.json());

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
            console.log('authenticateResponse', authenticateResponse)
            return new Promise((resolve, reject) => {
              resolve(authenticateResponse)
            });
        })
        .then(searchResponse => {
            console.log('searchResponsesearchResponse', searchResponse)
            searchResponseData = searchResponse
            return closeConnection()
        })
        .then(closeConnectionResponse => {
            console.log('ldap connection closed', closeConnectionResponse)
            res.status(200).send(searchResponseData)
        })
        .catch(error => {
          return closeConnection()
        })

})
function authenticate(userId, password) {
  //console.log(LDAPDNPATTERN+userId)

  console.log("start search");
    return new Promise((resolve, reject) => {

      const opts = {
        filter: '('+LDAPDNPATTERN+userId+')',
        scope: 'sub',
        attributes: ['cn']
      };

      console.log("start search in ldap");

      client.search(LDAPBASEDN, opts, (err, res) => {

        res.on('searchEntry', entry => {
            var dn = entry.object.dn;
            console.log('dn: ' + dn);
            resolve(dn);
        });

        res.on('error', function(err) {
          console.log(opts.filter);
          console.error('error: ' + err.message);
          reject(err);
        });

      });

    })
    .then(function(dn) {
      console.log(dn); // "Success"
      return new Promise((resolve, reject) => {
        client.bind(dn, password, err => {

            if (err) {
              console.log("error");
                resolve(false)
            }
            resolve(true)
      });
      });
    }, function(value) {
      // not called
    })
    .catch(error => {

    })

}

/*
function search(userId) {

    const searchOptions = {
      filter: '('+LDAPDNPATTERN+userId+')',
      scope: 'sub',
      attributes: ['cn']
    };
    return new Promise((resolve, reject) => {
        client.search(LDAPBASEDN, searchOptions, (err, res) => {
            res.on('searchEntry', entry => {
                //console.log('searchEntry', entry.object);
                resolve(entry.object)
            });
            res.on('searchReference', referral => {
                //console.log('referral: ' + referral.uris.join());
                resolve(referral.uris.join())
            });
            res.on('error', err => {
                //console.error('search error: ' + err.message);
                reject(err)
            });
            res.on('end', result => {
                //console.log('If not found', result);
                reject({ message:'User not found'})
            });
        });
    })
}*/

// unbind after completion of process
function closeConnection() {
    console.log('closeConnection')
    client.unbind(err => {
        console.log('unbind error', err)
    });
}



app.listen(APPPORT, () => {
  console.log(`Server is listening on port ${APPPORT}`);
});

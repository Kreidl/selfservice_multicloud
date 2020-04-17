// generate token using secret from process.env.JWT_SECRET
var jwt = require('jsonwebtoken');

function generateToken(userDN) {
  //1. Don't use password and other sensitive fields
  //2. Use the information that are useful in other parts
  if (!userDN) return null;

  var u = {
    userId: userDN
  };

  return jwt.sign(u, process.env.JWT_SECRET, {
    expiresIn: 60 * 60 * 24 // expires in 24 hours
  });
}

// verify the token and return it if it's valid
function verifyToken(token){
  // check header or url parameters or post parameters for token
  if (!token) {
    return {
      error: true,
      message: "Token is required."
    };
  }
  // check token that was passed by decoding token using secret
  return jwt.verify(token, process.env.JWT_SECRET, function (err, user) {
    if (err) return {
      error: true,
      message: "Invalid token."
    };

    return {
      error: false,
      message: "valid user."
    };
  });
}

module.exports.generateToken = generateToken;
module.exports.verifyToken = verifyToken;

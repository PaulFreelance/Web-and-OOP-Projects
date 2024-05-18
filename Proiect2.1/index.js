var http = require('http');
var url = require('url');
const querystring = require('querystring');

const server = http.createServer((req, res) => {
  if (req.method === 'POST') {
    var body = '';
    req.on('data', chunk => {
      body += chunk.toString();
    });
    req.on('end', () => {
      const data = querystring.parse(body);
      const nume = data.nume;
      const prenume = data.prenume;
      
      // Insert the user's profile into the database
      const mysql = require('mysql');
      const con = mysql.createConnection({
        host: "localhost",
        user: "2022.lihat.radu.andrei",
        password: "albastru19",
        database: "2022.lihat.radu.andrei"
      });
      con.connect(function(err) {
          if (err) throw err;
          var sql = "INSERT INTO nume_profil (nume, prenume) VALUES ('"+"','"+Date()+"','"+Date()+"','"+nume+"', '"+prenume+"')";
          con.query(sql, function (err, result) {
          if (err) throw err;
          console.log("1 record inserted");
          });
      });
    });
  } else {
    // 
  }
});
server.listen(6070);
const MongoClient = require('mongodb').MongoClient;

const uri = "mongodb://localhost:27017";
const client = new MongoClient(uri);
const dbName = "musicdb";

let db;

function connectToDatabase() {
  if (!db) {
    client.connect();
    db = client.db(dbName);
  }
  return db;
}

const ObjectId = require("mongodb").ObjectId;
const validateAlbum = require("../models/albumValidator.js");

function getAllAlbums(req, res) {
  const db = req.app.locals.db;
  db.collection("albums").find().toArray((err, data) => {
    if (err) return res.status(500).json({ error: err.message });
    res.json(data);
  });
}

function getAlbumById(req, res) {
  const db = req.app.locals.db;
  db.collection("albums").findOne({ _id: new ObjectId(req.params.id) }, (err, item) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!item) return res.status(404).json({ error: "Album not found" });
    res.json(item);
  });
}

function createAlbum(req, res) {
  const data = res.body  
  const error = validateAlbum(data);
  if (error) return res.status(400).json({ error });
  
  const album = {
	  title: data.title,
	  releaseYear: data.releaseYear,
	  ratings: [
        { 
          "score": 0, 
          "vote": 0
        }
      ]
  }
  
  const db = req.app.locals.db;
  db.collection("albums").insertOne(album, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    res.status(201).json(result || req.body);
  });
}

function updateAlbum(req, res) {
  data = res.body
  
  const error = validateAlbum(data);
  if (error) return res.status(400).json({ error });

  const db = req.app.locals.db;
  db.collection("albums").findOneAndUpdate(
    { _id: new ObjectId(req.params.id) },
    { $set: req.body },
    { returnDocument: "after" },
    (err, result) => {
      if (err) return res.status(500).json({ error: err.message });
      if (!result.value) return res.status(404).json({ error: "Album not found" });
      res.json(result.value);
    }
  );
}

function deleteAlbum(req, res) {
  const db = req.app.locals.db;
  db.collection("albums").deleteOne({ _id: new ObjectId(req.params.id) }, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    if (result.deletedCount === 0) return res.status(404).json({ error: "Album not found" });
    res.status(204).send();
  });
}

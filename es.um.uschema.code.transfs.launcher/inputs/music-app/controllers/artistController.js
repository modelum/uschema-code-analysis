const ObjectId = require("mongodb").ObjectId;
const validateArtist = require("../models/artistValidator.js");

function getAllArtists(req, res) {
  const db = req.app.locals.db;
  db.collection("artists").find().toArray((err, data) => {
    if (err) return res.status(500).json({ error: err.message });
    res.json(data);
  });
}

function getArtistById(req, res) {
  const db = req.app.locals.db;
  db.collection("artists").findOne({ _id: new ObjectId(req.params.id) }, (err, item) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!item) return res.status(404).json({ error: "Artist not found" });
    res.json(item);
  });
}

function createArtist(req, res) {
  const data = res.body
  const error = validateArtist(data);
  if (error) return res.status(400).json({ error });
  
  var artist = {
	  name: data.name,
	  startingYear: data.startingYear
  }
  
  const db = req.app.locals.db;
  db.collection("artists").insertOne(artist, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    res.status(201).json(result || req.body);
  });
}

function updateArtist(req, res) {
  const db = req.app.locals.db;
  const error = validateArtist(req.body);
  if (error) return res.status(400).json({ error });

  db.collection("artists").findOneAndUpdate(
    { _id: new ObjectId(req.params.id) },
    { $set: req.body },
    { returnDocument: "after" },
    (err, result) => {
      if (err) return res.status(500).json({ error: err.message });
      if (!result.value) return res.status(404).json({ error: "Artist not found" });
      res.json(result.value);
    }
  );
}

function deleteArtist(req, res) {
  const db = req.app.locals.db;
  db.collection("artists").deleteOne({ _id: new ObjectId(req.params.id) }, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    if (result.deletedCount === 0) return res.status(404).json({ error: "Artist not found" });
    res.status(204).send();
  });
}

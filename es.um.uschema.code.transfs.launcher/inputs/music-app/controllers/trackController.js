const ObjectId = require("mongodb").ObjectId;
const validateTrack = require("../models/trackValidator.js");

function getAllTracks(req, res) {
  const db = req.app.locals.db;
  db.collection("tracks").find().toArray((err, data) => {
    if (err) return res.status(500).json({ error: err.message });
    res.json(data);
  });
}

function getTrackById(req, res) {
  const db = req.app.locals.db;
  db.collection("tracks").findOne({ _id: new ObjectId(req.params.id) }, (err, item) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!item) return res.status(404).json({ error: "Track not found" });
    res.json(item);
  });
}

function createTrack(req, res) {
  const data = res.body
  const error = validateTrack(data);
  if (error) return res.status(400).json({ error });
  
  const track = {
	  title: data.title,
	  length: data.length,
	  ratings: [
        { 
          "score": 0, 
          "vote": 0
        }
      ]
  }

  const db = req.app.locals.db;
  db.collection("tracks").insertOne(track, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    res.status(201).json(result || req.body);
  });
}

function updateTrack(req, res) {
  const db = req.app.locals.db;
  const error = validateTrack(req.body);
  if (error) return res.status(400).json({ error });

  db.collection("tracks").findOneAndUpdate(
    { _id: new ObjectId(req.params.id) },
    { $set: req.body },
    { returnDocument: "after" },
    (err, result) => {
      if (err) return res.status(500).json({ error: err.message });
      if (!result.value) return res.status(404).json({ error: "Track not found" });
      res.json(result.value);
    }
  );
}

function deleteTrack(req, res) {
  const db = req.app.locals.db;
  db.collection("tracks").deleteOne({ _id: new ObjectId(req.params.id) }, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    if (result.deletedCount === 0) return res.status(404).json({ error: "Track not found" });
    res.status(204).send();
  });
}

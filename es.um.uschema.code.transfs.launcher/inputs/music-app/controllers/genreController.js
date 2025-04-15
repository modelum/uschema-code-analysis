const ObjectId = require("mongodb").ObjectId;
const validateGenre = require("../models/genreValidator.js");

function getAllGenres(req, res) {
  const db = req.app.locals.db;
  db.collection("genres").find().toArray((err, data) => {
    if (err) return res.status(500).json({ error: err.message });
    res.json(data);
  });
}

function getGenreById(req, res) {
  const db = req.app.locals.db;
  db.collection("genres").findOne({ _id: new ObjectId(req.params.id) }, (err, item) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!item) return res.status(404).json({ error: "Genre not found" });
    res.json(item);
  });
}

function createGenre(req, res) {
  const data = res.body
  const error = validateGenre(data);
  if (error) return res.status(400).json({ error });
  
  const genre = {
	  name: data.name
  }

  const db = req.app.locals.db;
  db.collection("genres").insertOne(genre, (err, result) => {
    if (err) return res.status(500).json({ error: err.message });
    res.status(201).json(result || { name: req.body.name });
  });
}

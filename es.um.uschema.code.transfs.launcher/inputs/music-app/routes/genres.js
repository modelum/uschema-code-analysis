const express = require("express");

const genreController = require("../controllers/genreController.js");

const router = express.Router();

router.get("/", genreController.getAllGenres);
router.get("/:id", genreController.getGenreById);
router.post("/", genreController.createGenre);
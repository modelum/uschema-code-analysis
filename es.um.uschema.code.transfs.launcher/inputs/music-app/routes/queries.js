const express = require("express");

const queryController = require("../controllers/queryController.js");

const router = express.Router();

router.get("/artist/:id/albums", queryController.getAlbumsByArtist);
router.get("/albums-with-artist", queryController.getAlbumsWithArtist);
router.get("/album/:id/tracks", queryController.getTracksByAlbum);
router.get("/albums-with-genres", queryController.getAlbumsWithGenres);
router.get("/tracks-with-album-artist", queryController.getTracksWithAlbumAndArtist);
router.get("/tracks-with-genres", queryController.getTracksWithGenres);

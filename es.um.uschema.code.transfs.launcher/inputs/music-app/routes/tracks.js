const express = require("express");

const trackController = require("../controllers/trackController.js");

const router = express.Router();

router.get("/", trackController.getAllTracks);
router.get("/:id", trackController.getTrackById);
router.post("/", trackController.createTrack);
router.put("/:id", trackController.updateTrack);
router.delete("/:id", trackController.deleteTrack);
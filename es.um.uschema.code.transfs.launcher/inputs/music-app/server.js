const express = require("express");

const connectToDatabase = require("./services/db.js");

const artistRoutes = require("./routes/artists.js");
const albumRoutes = require("./routes/albums.js");
const trackRoutes = require("./routes/tracks.js");
const genreRoutes = require("./routes/genres.js");
const queryRoutes = require("./routes/queries.js");

const app = express();
app.use(express.json());

connectToDatabase().then(db => {
  locals = app.locals
  locals.db = db;

  app.use("/artists", artistRoutes);
  app.use("/albums", albumRoutes);
  app.use("/tracks", trackRoutes);
  app.use("/genres", genreRoutes);
  app.use("/queries", queryRoutes);

  app.listen(3000, () => {
    console.log("Server running on http://localhost:3000");
  });
  
}).catch(err => {
  console.error("Failed to connect to database:", err);
});

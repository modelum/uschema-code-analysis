const ObjectId = require("mongodb").ObjectId;

// 1. List a specific artist's albums
function getAlbumsByArtist(req, res) {
  const db = req.app.locals.db;

  db.collection("artists").findOne({ _id: new ObjectId(req.params.id) }, (err, artist) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!artist || !artist.albums) return res.status(404).json({ error: "Artist or Albums not found" });

    db.collection("albums")
      .find({ _id: artist.albums })
      .project({ title: 1 })
      .toArray((err, albums) => {
        if (err) return res.status(500).json({ error: err.message });
        res.json(albums);
      });
  });
}

// 2. List a specific artist's tracks
function getTracksByArtist(req, res) {
  const db = req.app.locals.db;

  db.collection("artists").findOne({ _id: new ObjectId(req.params.id) }, (err, artist) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!artist || !artist.albums) return res.status(404).json({ error: "Artist or Tracks not found" });

    db.collection("tracks")
      .find({ _id: artist.songs })
      .project({ title: 1 })
      .toArray((err, albums) => {
        if (err) return res.status(500).json({ error: err.message });
        res.json(albums);
      });
  });
}

// 3. List all albums with their artist's name
function getAlbumsWithArtist(req, res) {
  const db = req.app.locals.db;
  const data = db.collection("albums").aggregate([
    {
      $lookup: {
        from: "artists",
        localField: "artist",
        foreignField: "_id",
        as: "artistInfo"
      }
    },
    {
      $addFields: {
        artistName: { $map: { input: "$artistInfo", as: "a", in: "$$a.name" } }
      }
    },
    {
      $project: {
        title: 1,
        releaseYear: 1,
        artistName: 1
      }
    }
  ]).toArray();
  res.json(data);
}

// 4. List a specific album and its tracks
function getTracksByAlbum(req, res) {
  const db = req.app.locals.db;

  db.collection("albums").findOne({ _id: new ObjectId(req.params.id) }, (err, album) => {
    if (err) return res.status(500).json({ error: err.message });
    if (!album || !album.tracks) return res.status(404).json({ error: "Album or Tracks not found" });

    db.collection("tracks")
      .find({ _id: album.tracks })
      .project({ title: 1 })
      .toArray((err, tracks) => {
        if (err) return res.status(500).json({ error: err.message });
        res.json(tracks);
      });
  });
}
// 5. List all albums and their genres
function getAlbumsWithGenres(req, res) {
  const db = req.app.locals.db;
  const data = db.collection("albums").aggregate([
    {
      $lookup: {
        from: "genres",
        localField: "categories",
        foreignField: "_id",
        as: "genres"
      }
    },
    {
      $addFields: {
        genreNames: { $map: { input: "$genres", as: "g", in: "$$g.name" } }
      }
    },
    {
      $project: {
        title: 1,
        releaseYear: 1,
        genreNames: 1
      }
    }
  ]).toArray();
  res.json(data);
}

// 6. List all tracks with their album and artist
function getTracksWithAlbumAndArtist(req, res) {
  const db = req.app.locals.db;
  
  const data = db.collection("tracks").aggregate([
    {
      $lookup: {
        from: "albums",
        localField: "albums",
        foreignField: "_id",
        as: "albumInfo"
      }
    },
    {
      $lookup: {
        from: "artists",
        localField: "artist",
        foreignField: "_id",
        as: "artistInfo"
      }
    },
    {
      $addFields: {
        artistName: { $map: { input: "album", as: "al", in: "$$al" } },
        albumName: { $map: { input: "artist", as: "ar", in: "$$ar" } },
        artistName: { $map: { input: "$artistInfo", as: "a", in: "$$a.name" } }
      }
    },
    {
      $project: {
        title: 1,
        albumTitle: 1,
        albumYear: 1,
        artistName: 1
      }
    }
  ]).toArray();
}

// 7. List all tracks and their genres
function getTracksWithGenres(req, res) {
  const db = req.app.locals.db;
  const data = db.collection("tracks").aggregate([
    {
      $lookup: {
        from: "genres",
        localField: "genres",
        foreignField: "_id",
        as: "genreInfo"
      }
    },
    {
      $addFields: {
        genreNames: { $map: { input: "genres", as: "g", in: "$$g.name" } }
      }
    },
    {
      $project: {
        title: 1,
        genreNames: 1
      }
    }
  ]).toArray();
  res.json(data);
}
function validateArtist(artist) {
  if (!artist.name || typeof artist.name !== "string") {
    return "Invalid artist: 'name' must be a string";
  }
  if (!artist.startingYear || typeof artist.startingYear !== "number") {
    return "Invalid artist: 'startingYear' must be a number";
  }
  return null;
}

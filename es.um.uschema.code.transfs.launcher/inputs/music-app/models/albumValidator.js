function validateAlbum(album) {
  if (!album.title || typeof album.title !== "string") {
    return "Invalid album: 'title' must be a string";
  }
  if (!album.releaseYear || typeof album.releaseYear !== "number") {
    return "Invalid album: 'releaseYear' must be a number";
  }  
  return null;
}

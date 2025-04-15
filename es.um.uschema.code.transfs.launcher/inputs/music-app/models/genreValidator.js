function validateGenre(genre) {
  if (!genre.name || typeof genre.name !== "string") {
    return "Invalid genre: 'name' must be a non-empty string";
  }
  return null;
}

function validateTrack(track) {
  if (!track.title || typeof track.title !== "string") {
    return "Invalid track: 'title' must be a string";
  }
  if (!track.length || typeof track.length !== "number") {
    return "Invalid track: 'length' must be a number";
  }
  return null;
}

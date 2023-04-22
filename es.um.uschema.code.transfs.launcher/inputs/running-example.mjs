const MongoClient = require('mongodb').MongoClient;

const url = 'mongodb://localhost:27017';
const dbName = 'user_profile';

const client = new MongoClient(url);
client.connect(err => {

	client.db(dbName).collection('User').findOne(
		{ name: 'lifestyle' }, (err, user) => {
			client.db(dbName).collection('Movie').findOne(
		   { _id: user.watchedMovies[0].movie_id }, 
		   (err, movie) => {
			 if (user.watchedMovies[0].stars >= 5) {
			  console.log(user.name + ' ' + user.surname);
			  console.log(user.email + ' Last watched movie:');
			  console.log(movie.title + ' ' + 
						  user.watchedMovies[0].stars);
			 }
		   });
		});
});
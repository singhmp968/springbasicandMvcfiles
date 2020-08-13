package com.springcore;

public class Movie {
private String MovieId;
private String MovieName;
private String MovieActor;
public Movie(String movieId, String movieName, String movieActor) {
	super();
	MovieId = movieId;
	MovieName = movieName;
	MovieActor = movieActor;
}
public Movie() {
	super();
	// TODO Auto-generated constructor stub
}
public String getMovieId() {
	return MovieId;
}
public void setMovieId(String movieId) {
	MovieId = movieId;
}
public String getMovieName() {
	return MovieName;
}
public void setMovieName(String movieName) {
	MovieName = movieName;
}
public String getMovieActor() {
	return MovieActor;
}
public void setMovieActor(String movieActor) {
	MovieActor = movieActor;
}
@Override
public String toString() {
	return "Movie [MovieId=" + MovieId + ", MovieName=" + MovieName + ", MovieActor=" + MovieActor + "]";
}

}

package com.training.model;

public class Movie 
{

	private int movieReleasedYear;
	private String movieName;
	private String actorName;
	public int getMovieReleasedYear() {
		return movieReleasedYear;
	}
	public void setMovieReleasedYear(int movieReleasedYear) {
		this.movieReleasedYear = movieReleasedYear;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	@Override
	public String toString() {
		return "Movie [movieReleasedYear=" + movieReleasedYear + ", movieName=" + movieName + ", actorName=" + actorName
				+ "]";
	}
	
	
}

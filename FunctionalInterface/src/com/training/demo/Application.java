package com.training.demo;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.training.model.Movie;

public class Application
{

	public static void main(String[] args)
	{
		
		List<Movie> movieList= new ArrayList<>();
		
		Movie movie1 = new Movie();
		
		movie1.setMovieReleasedYear(2020);
		movie1.setMovieName("master");
		movie1.setActorName("vijay");
		
		
		Movie movie2 = new Movie();
		

		movie2.setMovieReleasedYear(2022);
		movie2.setMovieName("hey sinamika");
		movie2.setActorName("DQ");
		
		movieList.add(movie1);
		movieList.add(movie2);
		
    getMovies(movieList, m->m.getMovieReleasedYear()==2020);
    getMovies(movieList, m->m.getMovieName().equalsIgnoreCase("hey sinamika"));
		
	}

	public static void getMovies(List<Movie> movieList, Predicate<Movie> moviePredicate)
	{
		for(Movie mov : movieList)
		{
			if(moviePredicate.test(mov))
			{
				System.out.println(mov);
				//System.out.println(mov.getActorName());
			}
		}
	}
}

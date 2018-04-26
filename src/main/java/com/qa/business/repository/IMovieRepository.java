package com.qa.business.repository;

public interface IMovieRepository {
	String getAllMovies();

	String getAMovie(Long id);

	String createMovie(String movieJSON);
	
    String deleteAMovie(Long id);
	
	String updateAMovie (Long id, String movieToUpdate);
	
	
}

package com.qa.business.service;

public interface IMovieService {
	String getAllMovies();

	String getAMovie(Long id);

	String createMovie(String jsonMovie);
	
	
   String deleteAMovie(Long id);
	
	String updateAMovie (Long id, String movieToUpdate);
	
	
}
package com.qa.business.service;

import javax.inject.Inject;

import com.qa.business.repository.IMovieRepository;

public class MovieService implements IMovieService {

	@Inject
	private IMovieRepository repo;

	@Override
	public String getAllMovies() {
		return repo.getAllMovies();
	}

	@Override
	public String getAMovie(Long id) {
		return repo.getAMovie(id);
	}

	@Override
	public String createMovie(String jsonMovie) {
		return repo.createMovie(jsonMovie);
	}
	
	public String deleteMovie(Long id) {
		return repo.deleteMovie(id);
	}

	@Override
	public String updateMovie(String newMovie, Long id) {
		return repo.updateMovie(newMovie, id);
	}

}
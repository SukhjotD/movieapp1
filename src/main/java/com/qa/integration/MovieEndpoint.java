package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.IMovieService;

@Path("/movie")
public class MovieEndpoint {

	@Inject
	private IMovieService service;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getAllMovies() {
		return service.getAllMovies();
	}

	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getMovies(@PathParam("id") Long id) {
		return service.getAMovie(id);
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String createMovies(String jsonString) {
		return service.createMovie(jsonString);
	}
	
	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteMovie(@PathParam("id") Long id) {
		return service.deleteAMovie(id);
	}
	 
	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	@Consumes({ "application/json" })
	public String updateMovies(@PathParam("id") Long id, String updateMovie) {
		return service.updateAMovie(updateMovie,id);
	}
	
}

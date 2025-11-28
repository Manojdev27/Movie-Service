package com.hogwartsmovieproject.service;

import java.util.List;
import java.util.Optional;

import com.hogwartsmovieproject.entity.Movie;


public interface MovieService {

	public Movie addMovie(Movie movie);
	public List<Movie> getAllMovie();
	public Optional<Movie> getMovieById(Long id);
	
}

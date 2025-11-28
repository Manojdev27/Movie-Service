package com.hogwartsmovieproject.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hogwartsmovieproject.entity.Movie;
import com.hogwartsmovieproject.repository.MovieRepository;
import com.hogwartsmovieproject.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getAllMovie() {
		
		return movieRepository.findAll();
	}

	@Override
	public Optional<Movie> getMovieById(Long id) {
		Optional<Movie> optionalMovie = movieRepository.findById(id);
		return optionalMovie;
	}


}

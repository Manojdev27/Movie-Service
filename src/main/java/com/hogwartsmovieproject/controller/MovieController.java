package com.hogwartsmovieproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hogwartsmovieproject.entity.Movie;
import com.hogwartsmovieproject.service.MovieService;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);	
	}
	
	@GetMapping("/getAllMovie")
	public List<Movie> getAllMovie(){
		return movieService.getAllMovie();
		
	}
	
	@GetMapping("/findMovieById/{id}")
	public Optional<Movie> getMovieById(@PathVariable Long id){
		return movieService.getMovieById(id);
	}
}

package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Movie;
import com.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;

	public List<Movie> getTodayMovie() {
		return repo.findByDate(LocalDate.now());
	}

	public List<Movie> getUpcomingMovies() {
		return repo.findByDateAfter(LocalDate.now());
	}

	public Movie getMovieById(Long id) {
		return repo.findById(id).get();
	}
}

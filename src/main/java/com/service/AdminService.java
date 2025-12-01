package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Movie;
import com.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo;

	// Add Movie
	public void saveOrUpdateMovie(Movie movie) {
		repo.save(movie);	
	}

	public boolean checkUser(String name, String password) {
		if (name.equalsIgnoreCase("user") && password.equalsIgnoreCase("admin"))
			return true;
		return false;
	}

	public Movie getMovie(Long id) {
		return repo.findById(id).get();
	}

	public List<Movie> getAllMovies() {
		return repo.findAll();
	}

	public List<Movie> getTodayMovies() {
		LocalDate today = LocalDate.now();
		return repo.findByDate(today);
	}

	public List<Movie> getUpcomingMovies() {
		return repo.findByDateAfter(LocalDate.now());
	}

	public void deleteMovie(Long id) {
		repo.deleteById(id);
	}


}

package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Movie;
import com.model.Theater;
import com.service.MovieService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/movies")
public class MovieController {

	private final MovieService service;
	private final Theater theater;

	@Autowired
	public MovieController(MovieService service, Theater theater) {
		this.service = service;
		this.theater = theater;
	}

	@GetMapping("/home")
	public String homePage(Model m) {
		m.addAttribute("movies", service.getTodayMovie());
		return "pages/home";
	}

	@GetMapping("/filter")
	public String filterMovies(@RequestParam String type, Model model) {
		if (type.equalsIgnoreCase("today"))
			model.addAttribute("movies", service.getTodayMovie());
		else if (type.equalsIgnoreCase("upcoming")) {
			model.addAttribute("movies", service.getUpcomingMovies());
		}
		return "pages/home";
	}

	@GetMapping("/theater")
	public String showTheater(@RequestParam Long id, Model m, HttpSession session) {
		Movie movie = service.getMovieById(id);
		m.addAttribute("movie", movie);
		session.setAttribute("movie", movie);

		m.addAttribute("silverSeats", theater.getSilver());
		m.addAttribute("goldSeats", theater.getGold());
		m.addAttribute("platinumSeats", theater.getPlatinum());

		return "pages/theater";
	}

}

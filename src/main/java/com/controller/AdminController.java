package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Movie;
import com.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "admin/login";
	}
	
	@PostMapping("/login")
	public String adminLogin(@RequestParam String name, @RequestParam String password) {
		if(service.checkUser(name, password))
			return "admin/dashboard";
		return "redirect:/admin/login";
	}
	
	@GetMapping("/dashboard")
	public String showDashBoard(@RequestParam(required = false) Long id, Model m) {
	    if(id != null) {
	        Movie movie = service.getMovie(id);
	        m.addAttribute("movie", movie);
	    } else {
	        m.addAttribute("movie", new Movie());
	    }
	    return "admin/dashboard";
	}
	
	@PostMapping("/addMovie")
	public String addMovie(@ModelAttribute Movie movie) {
		service.saveOrUpdateMovie(movie);
		return "redirect:/admin/dashboard";
	}
	
	@GetMapping("/movies")
	public String showMoviesTable(Model m) {
		m.addAttribute("movies", service.getAllMovies());
		return "admin/movies";
	}
	
	@GetMapping("/filter")
	public String filterMovies(@RequestParam String type, Model model) {
		if(type.equalsIgnoreCase("all"))
			model.addAttribute("movies", service.getAllMovies());
		else if(type.equalsIgnoreCase("today"))
			model.addAttribute("movies", service.getTodayMovies());
		else if(type.equalsIgnoreCase("upcoming"))
			model.addAttribute("movies", service.getUpcomingMovies());
		return "admin/movies";
	}
	
	@GetMapping("/delete")
	public String deleteMovie(@RequestParam Long id) {
		service.deleteMovie(id);
		return "redirect:/admin/movies";
	}
}

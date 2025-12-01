package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Movie;
import com.model.Seat;
import com.service.SeatService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/seats")
public class SeatController {

	@Autowired
	private SeatService service;

	@PostMapping("/booking")
	public String bookSeats(@ModelAttribute Seat seat) {
		System.out.println("Seat : "+seat);
		service.saveSeat(seat);
		return "redirect:/movies/theater?id=" + seat.getMovieId();
	}

	@GetMapping("/pay")
	public String payAmount(HttpSession session, Model m){
		Movie movie = (Movie) session.getAttribute("movie");
		int price = service.getPrice();
		m.addAttribute("movie", movie);
		m.addAttribute("seat", service.getAllPays());
		m.addAttribute("price", price);
		m.addAttribute("total", service.getTotal(price));
		
		return "pages/pay";
	}
}

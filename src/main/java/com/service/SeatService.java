package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Movie;
import com.model.Pay;
import com.model.Seat;
import com.repository.MovieRepository;
import com.repository.PayRepository;
import com.repository.SeatRepository;

@Service
public class SeatService {


	private final SeatRepository repo;
	private final PayRepository payRepo;
	private final MovieRepository movieRepo;
	
	@Autowired
	public SeatService(SeatRepository repo, PayRepository payRepo, MovieRepository movieRepo) {
		this.repo = repo;
		this.payRepo = payRepo;
		this.movieRepo = movieRepo;
	}

	public boolean saveSeat(Seat seat) {
		if (repo.existsByMovieIdAndCategoryAndSeatNo(seat.getMovieId(), seat.getCategory(), seat.getSeatNo())) {
			System.out.println("Sorry Seat is already booked !");
			return false;
		}
		repo.save(seat);
		payRepo.save(new Pay(seat.getMovieId(), seat.getSeatNo(), seat.getCategory(), findPrice(seat.getCategory())));
		return true;
	}

	private int findPrice(String category){
		if(category.equalsIgnoreCase("platinum"))
			return 250;
		else if(category.equalsIgnoreCase("gold"))
			return 180;
		else
			return 120;
	}

	public int getPrice() {
		return payRepo.getTotalPrice();
	}
	
	public double getTotal(int price) {
	    return price + (price * 18 / 100.0);
	}

	public String getMovieName() {	
		Pay p = payRepo.findFirstByOrderByIdAsc();
		if(p != null) {
			return movieRepo.findById(p.getMovieId()).map(Movie::getName).orElse(null);
		}
		return "null";
	}

	public List<Pay> getAllPays() {
		return payRepo.findAll();
	}
}

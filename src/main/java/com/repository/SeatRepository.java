package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>{
	boolean existsByMovieIdAndCategoryAndSeatNo(Long movieId, String category, String seatNo);
}

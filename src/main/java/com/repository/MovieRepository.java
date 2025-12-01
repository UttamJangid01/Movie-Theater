package com.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	List<Movie> findByDate(LocalDate now);

	List<Movie> findByDateAfter(LocalDate now);
}

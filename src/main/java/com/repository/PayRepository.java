package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Pay;

@Repository
public interface PayRepository extends JpaRepository<Pay, Long> {

    @Query("SELECT SUM(p.price) FROM Pay p")
    Integer getTotalPrice();
    
    Pay findFirstByOrderByIdAsc(); 
}

package com.startup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.repository.PayRepository;

@Service
public class StartService implements CommandLineRunner {

    @Autowired
    PayRepository payRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started, cleaning Pay table...");
        payRepo.deleteAll();
    }
}

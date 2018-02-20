package com.codeovm.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.codeovm.testapp.entities.LandRover;
import com.codeovm.testapp.services.LandRoverService;


@SpringBootApplication
public class SpringBootRestMySqlHibernateApplication implements CommandLineRunner {


	
	@Autowired
	private LandRoverService landRoverService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestMySqlHibernateApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		LandRover landRover = new LandRover();
		landRover.setModel("Evoke");
		landRover.setSaleYear(2016);
		landRoverService.save(landRover);
		
	}
}

package com.codeovm.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeovm.testapp.entities.Customer;
import com.codeovm.testapp.services.CustomerService;

@SpringBootApplication
public class SpringBootRestMySqlHibernateApplication implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestMySqlHibernateApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		customerService.delete(2);
	}
}

package com.codeovm.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeovm.testapp.entities.Customer;
import com.codeovm.testapp.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/user")
	public Customer saveUser(Customer customer) {
		return customerService.save(customer);
	}
	
}

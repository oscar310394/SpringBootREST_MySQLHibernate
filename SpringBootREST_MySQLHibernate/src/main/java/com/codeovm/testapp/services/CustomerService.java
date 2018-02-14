package com.codeovm.testapp.services;

import org.springframework.data.repository.CrudRepository;

import com.codeovm.testapp.entities.Customer;

public interface CustomerService extends CrudRepository<Customer, Integer>{

}

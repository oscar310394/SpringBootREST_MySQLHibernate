package com.codeovm.testapp.services;

import org.springframework.data.repository.CrudRepository;

import com.codeovm.testapp.entities.LandRover;

public interface LandRoverService extends CrudRepository<LandRover, Integer>{

}

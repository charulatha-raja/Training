package com.example.demo.controller;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.example.demo.entity.Passenger;
import com.example.demo.repo.PassengerRepository;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping(path = "/api/v1")
public class PassengerController
{

	@Autowired
	private PassengerService service;
	
	
	public PassengerController(PassengerService service) 
	{
		super();
		this.service = service;
	}

	
	

	@GetMapping(path = "/passenger")
	public ResponseEntity<Passenger>addPassenger(@RequestBody Passenger entity)
	{
		Passenger passenger = this.service.add(entity);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getPassengerId()).toUri();
		return ResponseEntity.status(HttpStatus.CREATED).body(passenger);
	}
	
@GetMapping(path = "/passengername")

public List<Passenger> getAllPassengers()
{
	return this.service.findAll();
	
}
@GetMapping(path = "/passenger/srch/{passengerName}")

public List<Passenger> findByPassengerName(@PathVariable("passengerName") String srchName)
{
	return this.service.findByPassengerName(srchName);
	
}
@GetMapping(path = "/passenger/srchTime/{tripListTripDateTime}")

public List<Passenger> fndByTripHistoryTripDateTime(@PathVariable("tripListTripDateTime") 

@DateTimeFormat(iso=ISO.DATE_TIME)LocalDateTime time)
{
	
	return this.service.findByTripDateTime(time);
}
}

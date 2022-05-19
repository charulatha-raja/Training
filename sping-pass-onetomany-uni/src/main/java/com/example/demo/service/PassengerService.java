package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;

import com.example.demo.repo.PassengerRepository;

@Service
public class PassengerService 
{
	
	
	
	@Autowired
	PassengerRepository repo;
	
	@Autowired
	
	public PassengerService(PassengerRepository repo)
	{
		super();
		this.repo = repo;
	}
  public Passenger add(Passenger entity)
{
	return  this.repo.save(entity);
	
}
  
  public List<Passenger> findAll()
  {
	return this.repo.findAll();
	  
  }
  public List<Passenger> findByPassengerName(String srchName)
  {
	return this.repo.findByPassengerName(srchName);
	  
  }
  public List<Passenger> findByTripDateTime(LocalDateTime time)
  {
	return this.repo.fndByTripHistoryTripDateTime(time);
	  
  }
}
	
	


	

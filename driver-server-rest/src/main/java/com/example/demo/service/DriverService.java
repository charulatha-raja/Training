package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.DriverController;
import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverService
{

	@Autowired
	 private DriverRepository repo;

	

   public List<Driver> findAll()
	{
		return this.repo.findAll();
		
	}
  public Driver add(Driver entity)
  {
	return this.repo.save(entity);
	  
  }
  
  public Driver findById(int id)
{
	return  this.repo.findById(id).orElseThrow(()-> new RuntimeException(id+ "not found"));
}
 public Driver remove(Driver entity)
 {
	 boolean result = this.repo.existsById(entity.getDriverId());
	 
	 if (result)
	 {
		 this.repo.delete(entity);
	 }
	 else
	 {
		 throw new NoSuchElementException("elements with Id= " + entity.getDriverId()+"not present");
		 
	 }
	return entity;
 }
public  List<Driver> findByDriverName(String srchName)
{
	return this.repo.findByDriverName(srchName);
	
}
  
public  List<Driver> searchdByMobileNumber(long mobileNumber)

{
	return this.repo.findByMobileNumber(mobileNumber);

}

public  List<Driver> searchByRating(double rating)

{
	return this.repo.searchByRating(rating);
	
}

public  int modifyRating( int id, double updatedRating)
{
	return this.repo.modifyRating(id, updatedRating);
	
}
}

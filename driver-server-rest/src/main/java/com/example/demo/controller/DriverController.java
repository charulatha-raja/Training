package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;
@RestController
@RequestMapping(path = "/api/v1")
public class DriverController 
{

	@Autowired
	private DriverService service;

	@Autowired
	public DriverController(DriverService service)
	{
		super();
		this.service = service;
	}
	
	@GetMapping(path = "/drivers")
	
	public List<Driver> getAllDriver()
	
	{
		return this.service.findAll();
		
	}

	
	@GetMapping(path = "/drivers/{id}")
	
	public Driver getAllDriverById(@PathVariable("id") int id)
	
	{
		return this.service.findById(id);
		
	}
	
	
	@PostMapping(path = "/drivers")
	
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity)
	
	{
		Driver driver = this.service.add(entity);
		
	URI location = ServletUriComponentsBuilder
				       .fromCurrentRequest()
				       .path("/{id]")
				       .buildAndExpand(entity.getDriverId())
				       .toUri();
	
		return ResponseEntity.created(location).body(driver);
		
	}
	
	
	 @GetMapping(path = "/drivers/srch/number/{mobileNumber}")
		 
	 public List<Driver> getDriverByMobileNumber (@PathVariable("mobileNumber")long number)
	 {
	
		 return this.service.searchdByMobileNumber(number);
	}
	
	 @GetMapping(path = "/drivers/srch/name/{driverName}")
	 
	 public  List<Driver> findByDriverName(@PathVariable("driverName")String srchName)
	 {
		return this.service.findByDriverName(srchName);
		 
	 }
	 
	 
	 @GetMapping(path = "/drivers/srch/rate/{rating}")
	 
	 public  List<Driver> searchByRating(@PathVariable("rating") double rating)
	 {
		return this.service.searchByRating(rating);
		 
	 }
	 
	 
	 @PutMapping(path = "/drivers/{id}/{rating}")
	 
	 public ResponseEntity<Integer> modifyRating(@PathVariable("id") int id ,@PathVariable("rating") double updatedRating)

	 {
		 
		 int update=this.service.modifyRating(id, updatedRating);
		 
			return ResponseEntity.ok().body(update);
		
		
		 

		 
	 }
	
	 @DeleteMapping(path = "/drivers")
	public ResponseEntity<Object> remove(@RequestBody Driver entity)
	{
		Driver result = this.service.remove(entity);
		
		if(result!=null)
		{
			return ResponseEntity.status(204).build();
		}
		else
		{
			return ResponseEntity.ok("no record matching");
		}
	}
		
	@GetMapping(path = "/drivers/sort/{propName}")
	
	public List<Driver> sortedList(@PathVariable("propName")String propName)
	{
		return this.service.sortedList(propName);
		
	}
	
	
}



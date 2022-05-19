package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassengerRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Passenger service API", version = "1.0"))
public class SpingPassOnetomanyUniApplication 
{

	public static void main(String[] args) 
	{
		 ConfigurableApplicationContext ctx=SpringApplication.run(SpingPassOnetomanyUniApplication.class, args);
		
	}	
	@Bean
	public CommandLineRunner runner()
	{
		return new CommandLineRunner() 
		
		{
			@Autowired
			PassengerRepository repo;
			
			
			@Override
			public void run(String... args) throws Exception 
			{
			
//				Passenger pass = new Passenger();
//				
//				pass.setPassengerId(100);
//				pass.setPassengerName("kannan");
//				pass.setEmail("kannan123@gmail.com");
//				pass.setLocation("chennai");
//				
				TripHistory triphist=  new TripHistory(111, LocalDateTime.of(2000,05,02,3,10), "chennai", "trichy", 800);
				
				TripHistory triphist1 = new  TripHistory(201, LocalDateTime.of(2000, 06, 01, 4, 12), "trichy", "tanjore", 700);
			
				List<TripHistory> tripList= new ArrayList<TripHistory>();
				
				tripList.add(triphist);
				tripList.add(triphist1);
				
				repo.save(new  Passenger(101, "ram", "ram123@gnmail.com", "chennai", tripList));
				
			
			}
		};
		
	}
		 
		 
		  
		  
		 
	
	
	

}

package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.repo.DriverRepository;

@SpringBootApplication
//@RestController
public class ConfigClientApplication 

{
//	@Value("${customer.firstName}")
//	
//	private String name;
//	
//	@GetMapping(path = "/names")
//	
//	public String getNames()
//	{
//		return this.name;
//		
//	}

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx= SpringApplication.run(ConfigClientApplication.class, args);
		
		DriverRepository repo= ctx.getBean(DriverRepository.class);
		
		repo.findAll().forEach(System.out::println);
		
		
	}

}

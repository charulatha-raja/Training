package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class SingleTablePerHierarchyApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx=SpringApplication.run(SingleTablePerHierarchyApplication.class, args);
		 
		 InsuranceService service= ctx.getBean(InsuranceService.class);
		 
		 service.addHealthPolicy();
		 
		 ctx.close();
	}


	@Bean
	
	public LifeInsurance life()
	{
		return new LifeInsurance(8766, "sam", 23, "it service");
		
	}
	
	@Bean
	
	public HealthInsurance health()
	{
		return new HealthInsurance(1234, "ram", 56, "diabetics");
		
	}
}

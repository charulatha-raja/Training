package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidrection.Utility;

@SpringBootApplication
public class SpringDataJpaOnetomanyApplication 
{

	public static void main(String[] args)
	{
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOnetomanyApplication.class, args);
	
	Doctor obj = ctx.getBean(Doctor.class);
	
	Utility utils = ctx.getBean(Utility.class);
	
	utils.create();
	
	ctx.close();
	}
	
	
	@Bean
	public Doctor beem()
	{
		Doctor docc = new Doctor();
		
		docc.setDoctorId(901);
		
		docc.setDoctorName("puspa");
		docc.setDepartment("ent");
		docc.setPhoneNumber(98750l);
		
		return docc;
		
	}
	@Bean
	public Patient vedha()
	{
		return new Patient(888, "jaggu", 6754l);
		
	}

	@Bean
	public Patient angel()
	{
		return new Patient(999, "puspa", 6754l);
		
	}
	
	@Bean
	public Patient suba()
	{
		return new Patient(444, "teenu", 5469l);
		
	}
	}


	




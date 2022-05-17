package com.example.demo;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication

public class SpringDataJpaSimpleMappingApplication 
{

	public static void main(String[] args)
	
	{
		
	ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
	
	Doctor suresh = ctx.getBean(Doctor.class);
	
	DoctorService service = ctx.getBean(DoctorService.class);
	
	//Doctor added= service.add(suresh);
	
	//service.findByDepartment("cardiologist").forEach(System.out::println);
	
	//System.out.println(service.findByDoctorName("raamu"));
	
//	service.findAll().forEach(System.out::println);
	
	//System.out.println(service.findByDoctorNameAndDepartment("raamu", "ortho"));
	
	System.out.println(service.getBtDoctorNameDepartment("raamu", "ortho"));
//if(added!=null)
//	
//	{
//	System.out.println("one doctor added");
//}
//	
	ctx.close();
	

	
	}
	
	@Bean
	
	public Doctor suresh()
	{
		return new Doctor(100, "Ram", "cardiologist", 9865564378l);
		
	}
	
@Bean
	@Primary
	public Doctor sundar ()
	{
		return new Doctor(110, "raamu", "ortho", 9865764378l);
		
	}
	
	
	
	


}

package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import com.example.Student;

public class Application {

	public static void main(String[] args) 
	{
		Student ram= new Student(101,"ram", 
				LocalDate.of(2001, 05, 02), 
				LocalDateTime.of(2000, Month.JUNE,5,9,30));
		
		Student ramesh = new Student(102, "ramesh",
				LocalDate.now(),
				LocalDateTime.now());
		
		System.out.println("ram year of birth" + ram.getDateOfBirth().getMonth());
		
		System.out.println("ramesh year of birth"+ ramesh.getDateOfBirth().getYear());
		
		System.out.println("ramesh fourty birthday" + ramesh.getDateOfBirth().plus(30,ChronoUnit.MONTHS ));
				

	}

}

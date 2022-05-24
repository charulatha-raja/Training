package com.example.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import com.example.Student;

public class App {

	public static void main(String[] args) 
	{

		 String dateOfBirth = "1999-05-02";
		 
		 Student kumar = new Student();
		 
		 kumar.setRollNumber(600);
		 kumar.setStudentName("kumar");
		 kumar.setDateOfBirth(LocalDate.parse(dateOfBirth));
		 kumar.setDateOfJoining(LocalDateTime.now());
		 
		 System.out.println("year: " + kumar.getDateOfBirth().getYear());
		 System.out.println("month:" + kumar.getDateOfBirth().getMonth());
		 System.out.println("day: " + kumar.getDateOfBirth().getDayOfMonth());
		 
		 LocalTime startTime = LocalTime.of(11, 15);
		 
		//Duration duration = Duration.of(8, ChronoUnit.HOURS);
		 
		 LocalTime endTime = startTime.plus(3, ChronoUnit.HOURS);
		 
		 System.out.println("start time:" + startTime);
		 System.out.println("end time:" + endTime);
	}

}

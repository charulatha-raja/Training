package com.training.model;

import java.util.HashSet;
import java.util.Set;

import com.training.Doctor;
import com.training.Patient;


public class Application {

	public static void main(String[] args) 
	{
		Patient ram = new Patient(101,"ram","trichy",9865435669l);
		Patient ramesh = new Patient(102,"ramesh","chennai",8872696461l);
		Patient rahul = new Patient(103,"rahul","tanjore",9845490462l);
		HashSet<Patient> set = new HashSet<>();
		set.add(ram);
		set.add(ramesh);
		set.add(rahul);
		Doctor  doc = new Doctor(123,"suba","cardiologist",set);
		
		System.out.println(doc.getDoctorName());
		System.out.println(doc.getDoctorId());
		System.out.println(doc.getDepartment());
		for(Patient eachPatient: set)
		{
			System.out.println(eachPatient);
		}
		
		
	}

}

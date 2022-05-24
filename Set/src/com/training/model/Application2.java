package com.training.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.Doctor;
import com.training.Patient;

public class Application2 {

	public static void main(String[] args) 
	{
		
		Patient ram = new Patient(101,"ram","trichy",9865435669l);
		Patient ramesh = new Patient(102,"ramesh","chennai",8872696461l);
		
		Patient rajesh = new Patient(104,"rajesh","chennai",8272696461l);
		Patient rahul = new Patient(103,"rahul","tanjore",9845490462l);
		
        HashSet<Patient> list = new HashSet<>();
		list.add(ram);
		list.add(ramesh);
		
		HashSet<Patient> list1 = new HashSet<>();
		list1.add(rajesh);
		list1.add(rahul);
		
		Doctor doc = new Doctor(1000,"suba","cardiologist",list);
		Doctor doc1 = new  Doctor(1001,"madhes","dentist",list1);
        
		HashSet<Doctor> list2 = new HashSet<>();
		
		list2.add(doc);
		list2.add(doc1);
		
		Map<Doctor,Set<Patient>> map = new HashMap<Doctor,Set<Patient>>();
		map.put(doc,list );
		map.put(doc1, list1);
		Appointment appoint = new Appointment(map);
		for(Patient eachPatient : appoint.getPatients(doc1))
		{
			System.out.println(eachPatient);
		}
		
	}

	
}
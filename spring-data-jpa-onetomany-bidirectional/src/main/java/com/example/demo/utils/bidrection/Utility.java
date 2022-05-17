package com.example.demo.utils.bidrection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.ifaces.bidirection.DoctorRepository;
import com.example.demo.ifaces.bidirection.PatientRepository;

@Component
public class Utility
{

	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	PatientRepository patientRepo;
	
	@Autowired
	
	DoctorRepository repo;
	
	public void create()
	
	{
		doc.setPatientList(patientList);
		
		Doctor added = repo.save(doc);
		
		if(added!=null)
		{
			System.out.println("one recorded added");
		}
	}
	
	
	
	
}

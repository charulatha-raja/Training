package com.training.model;
import java.util.*;

import com.training.Doctor;
import com.training.Patient;
public class Appointment {
	private Map<Doctor,Set<Patient>> appoint;

	public Appointment()
	{
		super();
		
		

}

	public Appointment(Map<Doctor, Set<Patient>> appoint) {
		super();
		this.appoint = appoint;
	}

	public Map<Doctor, Set<Patient>> getAppoint() {
		return appoint;
	}

	public void setAppoint(Map<Doctor, Set<Patient>> appoint) {
		this.appoint = appoint;
	}

	@Override
	public String toString() {
		return "Appointment [appoint=" + appoint + "]";
	}
 public Set<Patient>getPatients(Doctor key)
 {
	 return this.appoint.get(key);
 }
	
	}
	
	
	



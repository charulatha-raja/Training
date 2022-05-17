package com.example.demo.entity.bidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="patient_111")

@Data
@NoArgsConstructor

public class Patient
{
	@Id
	@Column(name="patient_id")
	int patientId;
	
	@Column(name="patient_name")
	String patientName;
	
	
	
	@Column(name="mobile_number")

	long mobileNumber;
	
	




	public Patient(int patientId, String patientName, long mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
	}


    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "doctor_ref", referencedColumnName = "doctor_id")
	private Doctor doctor;
}

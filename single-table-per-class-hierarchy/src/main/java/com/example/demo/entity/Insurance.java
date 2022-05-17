package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Insurance_master_2001")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "insurance_type", length=10, discriminatorType = DiscriminatorType.STRING)

public class Insurance 
{

	@Id
	@Column(name="policy_number")
	private int policyNumber;
	
	@Column(name="pilicy_holder_name", length = 30, nullable = false)
	private String policyHolderName;
	
	
}

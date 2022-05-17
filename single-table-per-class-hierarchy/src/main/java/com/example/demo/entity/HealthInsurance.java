package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@DiscriminatorValue(value="HEALTH")

public class HealthInsurance  extends Insurance
{

	@Column(name = "age")
	private int age;
	
	@Column(name = "status")
	private String status;
	
	public HealthInsurance(int policyNumber, String policyHolderName, int age, String status)
	{
		super(policyNumber, policyHolderName);
		
		this.age = age;
		
		this.status = status;
	}
	
	
	
}

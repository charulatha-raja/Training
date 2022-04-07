package com.training.model;

public class HealthInsurance extends Insurance
{
	private String[] preExistingDiseases;
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases)
{
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}


	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculatePremium()
	{
	double premium =10000;
	for(String eachItem : preExistingDiseases)
	{
	 if(eachItem.equals("BP")|| eachItem.equals("sugar"))
	 {
		 premium=5000;
	 }
	
	}
		return premium;
	}

}

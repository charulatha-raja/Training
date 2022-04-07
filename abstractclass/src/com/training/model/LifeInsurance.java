package com.training.model;

public class LifeInsurance extends Insurance
{
  private int age;

public LifeInsurance() {
	super();
	// TODO Auto-generated constructor stub
}




public LifeInsurance(int policyNumber, String policyHolderName, int age) {
	super(policyNumber, policyHolderName);
	this.age = age;
}




public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public double calculatePremium() {
	// TODO Auto-generated method stub 
	double premium = 5000;
	if(age<50)
	{
		premium =10000;
	}
	return premium;
}

}

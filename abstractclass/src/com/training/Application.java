package com.training;
import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;
public class Application
{

	public static void printPremium(Insurance object) 
	{
		System.out.println(object.calculatePremium());
		}
	public static void main(String[] args)
	{
		VehicleInsurance car = new VehicleInsurance(1010,"ram","car",2019);
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(1020,"raaam",65);
		
		printPremium(life);
		
		
		String[] diseases = {"heartattack","thyroid"};
		
		HealthInsurance health = new HealthInsurance(3030,"vijai",diseases);
		
		printPremium(health);
		

	}
	

}






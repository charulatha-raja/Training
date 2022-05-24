package com.training.service;

import com.training.ifces.AgeCondition;
import com.training.ifces.Conditional;

public class StudentResultService implements Conditional<Double> , AgeCondition<Double>{

	
	@Override
	public boolean test(Double value)
	{
		
		return value>80;
	}

	@Override
	public boolean negate(Double value)
	{
		if(value>100)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}

}

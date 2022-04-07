package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;

public class CurrencyConverter implements Function, CheckCondition
{

	@Override
	public double apply(double value)
	{
		// TODO Auto-generated method stub
		return value*100 ;
	}

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return false;
	}

}

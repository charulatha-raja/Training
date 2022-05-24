package com.training.services;

import com.training.ifaces.Converter;

public class CurrencyConverter implements Converter<Double, Double> {

	@Override
	public Double Converter(Double value) 
	{
		
		return value*100.00;
	}

}

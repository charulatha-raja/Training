package com.training;

import com.training.ifaces.Converter;
import com.training.services.CurrencyConverter;

public class Application {
	public static void print(Converter<Double,Double> conv)
	{
		System.out.println(conv.Converter(300.0));
	}

	public static void main(String[] args)
	{
		Converter<Double,Double> obj=new CurrencyConverter();
		
		System.out.println(obj.Converter(20.00));
		
		Converter<Double,Double> lambda=(val)->val*200.0;
		
		print(lambda);
		
		System.out.println(lambda.Converter(20.00));
		
		Converter<String,Integer> srtLength=(str)->str.length();
		
		System.out.println(srtLength.Converter("charu"));
	}

}

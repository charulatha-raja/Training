package com.training.services;

public class ExceptionHandling
{
public void usingArrayIndexException(String[] args)
{
	try {
		System.out.println(args[0]);
	}
	catch (ArrayIndexOutOfBoundsException e) 
	{
		// TODO Auto-generated catch block
		System.out.println("Method requires three values to be passed[a,b,c]");
		e.printStackTrace();
	}
}
public void usingNumberFormatException(String value)
{
	int age=0;
	try
	{
		age = Integer.parseInt(value);
		//System.out.println(age);

	} 
	catch (NumberFormatException e) 
	{
		// TODO Auto-generated catch block
		//e.printStackTrace();
	
	System.out.println("String value cannot be wrapped");
	}
	System.out.println(age);
}
 
	// TODO Auto-generated method stub



public void usingFinallyBlock()
{
	int denominator=0;
	try
	{
		System.out.println(4/denominator);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Denominator should not be zero");
	}
	finally
	{
		System.out.println("Inside FINALLY==");
	}
	System.out.println("Thanks,bye,bye");
	//return "thanks";
}
}

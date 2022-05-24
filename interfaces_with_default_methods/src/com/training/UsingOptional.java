package com.training;

import java.util.Optional;

public class UsingOptional 
{
	
	public static Optional <String> getValue(int key)
	{
		Optional<String> response = Optional.empty();
		if(key==1)
		{
			response = Optional.empty();
		}
		return response;
	}
	
	public static Object getString(int key)
	{
		switch (key)
		{
		case 1:
			 
			return new String("chocobar");
			
		case 2:
			 return new StringBuffer("briyani");
			 
		default:
			return null;
		}
	}

	public static void main(String[] args) 
	{
		//will throw null pointer exception
       //System.out.println(getString(3).toString());
       
       //to avoid nullpointer exception and return  a default value
       
       //new features of java 8 is used optional
       
      
		Optional<Object> optional = Optional.ofNullable(getString(3));
       
      
		System.out.println(optional.orElse("vennila").toString());
		
		Optional<Object> optional2 = Optional.ofNullable(getString(3));
		
		//here we are checking if the value is present
        // if value is present it will return get method		
		if(optional2.isPresent())
		{
			System.out.println("value is present "+ optional2.get());
		}
		else
		{
			System.out.println("value is not present");
		}
		
		// using the lamda expression with optional
		
		Optional<Object> optional3 = Optional.ofNullable(getString(3));
		
		optional3.orElseThrow(()->new RuntimeException("no object for value 3 try again"));
		
		Optional<String> response = getValue(1);
		if(response.isPresent())
		{
		    System.out.println(response.get().toString());
		}
		else
		{
			System.out.println("invalid choice error");
		}
		
		
		response.orElseThrow(()-> new RuntimeException("invalid exception"));
		
		
	}
}

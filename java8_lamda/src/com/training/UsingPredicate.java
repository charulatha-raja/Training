package com.training;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class UsingPredicate 
{
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("India","cannada","indonesia","bhutan");
		
		Predicate<String> containsChar=(country)->country.toUpperCase().startsWith("I");
		
		Consumer<String> consumer=(value)->{if(containsChar.test(value)) {System.out.println("value");}};
				names.forEach(consumer);
				//names.forEach((value)->System.out.println("value"));
		
	}

}

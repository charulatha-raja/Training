package com.training;

import com.training.ifces.Conditional;
import com.training.service.StudentResultService;

public class Application {

	public static void main(String[] args)
	{
       StudentResultService service= new  StudentResultService();
       
       System.out.println("is pass:=" + service.test(50.00));
       
       System.out.println("is fail:="+service.negate(90.00));
       
       System.out.println(Conditional.getMessage());
       
      
	}

}

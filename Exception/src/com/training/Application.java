package com.training;
import java.util.*;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application
{

	public static void main(String[] args)
	{
		//Student ram = new Student(1010,"ram",-100);
		//ram.setMarkScored(6);
		
		//StudentService service = new StudentService("ram");
	   
		// TODO Auto-generated method stub
		//System.out.println(service.printDetails());
		//StudentService service2 = new StudentService("ram");
		//try 
		//{
			//System.out.println("Grade="+service2.findRank());
		//} catch (Exception e) 
		//{
			//System.err.println("Name is not passed");
		//}
		ExceptionHandling exHandling = new ExceptionHandling();
		//exHandling.usingArrayIndexException(args);
		//exHandling.usingNumberFormatException("dog");
		//System.out.println(exHandling.usingFinallyBlock());
		//since we are using try with resource -scanner will be closed
		try(Scanner scan = new Scanner(System.in))
		{
			System.out.println("Enter the Number:");
			int num =scan.nextInt();
			System.out.println(num);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}



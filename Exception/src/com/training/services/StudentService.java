package com.training.services;

import com.training.model.Student;

public class StudentService 
{
	private Student student;
	

	public StudentService()
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentService(Student student) 
	{
		super();
		this.student = student;
	}
//Applying the Handle rule of Exception handling
	
	public String printDetails()
	{
		String name = null;
		try
		{
			name = this.student.getFirstName();
		}
		catch(NullPointerException e)
		{
			System.out.println("Student object is not passed check again");
		}
		return name;
		}
      public String findRank() throws NullPointerException
      {
    	  String grade = "A";
    	  if(this.student.getMarkScored()>90)
    	  {
    		  grade = "0";
    	  }
    	  return grade;
      }

}

package com.example;

import java.util.*;
import java.sql.*;

import java.time.*;

public class WorkingWithDifferentdateClass
{

	public static void main(String[] args)
	{
   
		java.util.Date date1 = new java.util.Date();
		
		//java.util.Date date2 = new java.util.Date();
		
		System.out.println(date1);
		
		System.out.println(date1.getTime());
		
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		
		System.out.println(date2);
		
		//sql to localDate
		
		LocalDate  localDate = date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		java.sql.Date sqlDate2 =  java.sql.Date.valueOf(localDate);
		
		System.out.println("sql date 2:");
	}

}

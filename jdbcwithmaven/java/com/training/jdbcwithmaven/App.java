package com.training.jdbcwithmaven;

import java.sql.*;

import com.example.dao.ProductService;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;
public class App 
{
	public static void member()
	{
		
	}
	
	public static void product()
	{
   
		
		
		//ProductService service= new ProductService();
		
		Product toAdd = new Product(89,"ups",747.00);
		
		//int rowAdded=service.addProduct(toAdd);
		
		//System.out.println("Row Added:="+rowAdded);
		
	}
	
    public static void main( String[] args )
    {
   
    	
    	 
    	
    
    	
    	//con= DriverManager.getConnection("jdbc:Oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
    		
//    	    MemberRepository service1=new MemberRepository(con);
//    		
//    		service1.findAll().forEach(System.out::println);
//    
//    		LocalDate date=LocalDate.of(2022, 05, 05);
//    		
//    		Date sqlDate=Date.valueOf(date);
   	try
   	{
		 Connection con =ConnectionFactory.getPosgrestConnection();
   		 System.out.println(con);
     }
    	catch(Exception e)
    	{   
    		e.printStackTrace();
    	}
    }
}



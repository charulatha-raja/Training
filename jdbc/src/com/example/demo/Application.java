package com.example.demo;

import java.sql.*;
import java.util.Optional;

import com.example.entity.Product;
import com.example.service.ProductService;

public class Application {

	public static void main(String[] args) 
	{

		Connection con;
		try
		{
		 con= DriverManager.getConnection("jdbc:Oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
		 
		 ProductService service = new ProductService(con);
		 
		 Product toAdd = new Product(7654,"cake", 1747.00);
		 
		 int rowAdded = service.addProduct(toAdd);
		 
		 System.out.println("Row Added:=" +rowAdded);
		
		 
		 Optional <Product> found = service.findById(101);
		 
		 if(found.isPresent())
		 {
			 System.out.println(found.get());
		 }
		 else
		 {
			 System.out.println("product with given id not present");
		 }
		
		 service.deleteById(143);
		 
		 service.findAll().forEach(System.out::println);
		 
		 System.out.println(con);
		 
		int rowsUpdated= service.updatePriceByName("tv", 100.00);
		 
		 System.out.println("rowsUpdated:=" +rowsUpdated);

		 
		
		}
		
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		


	}
}

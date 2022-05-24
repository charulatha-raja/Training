package com.training.servie;

import java.io.File;

public class Application {

	public static void main(String[] args) {

		Book java = new Book(101,"head first java","rak",780);
		
		BookServices service = new BookServices();
		
		boolean result= service.writeToFile( new File("Books.txt"),java);
		
		if(result)
		{
			System.out.println("one record added to file");
		}
		
		service.readFromFile(new File("Books.txt")); 
	}

}

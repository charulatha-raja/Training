package com.training.servie;

import java.io.File;

public class AppForStream {

	public static void main(String[] args) 
	{
	
		Book book = new Book(101,"oracle","harish", 560);
		
		BookServices service= new BookServices();
		
		File file= new File("book.ser");
		
		int ch=2;
		
		if(ch==1) {
			boolean result = service.writeToFile(file, book);
			if(result) {
				System.out.println("one record serialized  ");
			}
		}else {
			Book fromFile= (Book)service.readFromFile(file);
			System.out.println(fromFile.getBookName());
			System.out.println(fromFile);
		}

	}
		
	}



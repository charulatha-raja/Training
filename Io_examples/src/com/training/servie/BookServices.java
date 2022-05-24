package com.training.servie;
import java.io.*;
import java.util.*;

public class BookServices {
	
	public boolean writeToStream(File file,Book book)
	{
		boolean result=false;
		
		try(ObjectOutputStream outStream= new ObjectOutputStream(new FileOutputStream(file)))
		
		{
			outStream.writeObject(book);
			result=true;
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	

	public boolean  writeToFile(File file, Book book)
	{
		boolean result=false;
		
		try(PrintWriter writer= new PrintWriter(new FileWriter(new File("Books.txt")),true);)
				{
					writer.println(book);
				}
				catch(IOException e)
		{
				e.printStackTrace();	 
		}
		 return result;
	}
	
	public List<Book> readFromFile(File file)
	{
		List<Book> bookList= new ArrayList<Book>();
		
		String line= null;
		
		try(BufferedReader reader= new BufferedReader(new FileReader(file)))
		{
			
		
		
		while((line=reader.readLine())!=null)
		{
			String[] values=line.split(",");
			
			Book book = new Book(Integer.parseInt(values[0]),values[1],values[2],Double.parseDouble(values[3]));
			
			bookList.add(book);
		}}
		
		catch(IOException e)
		
		{
			e.printStackTrace();
		}
		
		return bookList;
	}

}

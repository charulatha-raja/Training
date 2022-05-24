package com.training.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application 
{

	public static void main(String[] args) 
	{
		try
		{
			
			File myfile= new File("File.txt");
			if(myfile.createNewFile())
			{
				System.out.println("file created :"+myfile.getName());
			}
			else
			{
				System.out.println("file already exist");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
			
		

	try
	{
		FileWriter myWriter = new FileWriter("fruit.txt");
		myWriter.write("Apple is red in color, Orange is round in shape, Banana is good for health, grapes will grow as bunch, mango is a seasionalfruit");
		myWriter.close();
		System.out.println("successfully write the file");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}

package com.training;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class MyFiles
{

	public static void main(String[] args)
	{
	
		 try {
			   
			   File myFile= new File("Fruits.txt");
			   
			   if(myFile.createNewFile())
			   {
			    System.out.println("File created:"+ myFile.getName());
			   }
			   else 
				   
			   {
			      System.out.println("File Already Exists");
			   }
			   
		 }  
		      
		 catch(IOException e) 
		 {
			   e.printStackTrace();
	     }
	
			  
			  
			  try
			  
			  {
			      FileWriter myWriter = new FileWriter("Fruits.txt");
					   
			      myWriter.write("Apple is red in color, Orange is round in shape, Banana is good for health, Grapes will grow as bunch, Mango is a seasonal fruit");
			   
			      myWriter.close();
			   
			      System.out.println("Successfully Write the file");
			   
			  }
			  
			  catch(IOException e) 
			  
			  {
			     System.out.println("An error Occured");
			   
			     e.printStackTrace();
			   
			  }
			  
			  
			  
			  
			  
			  try
			  {
			  
			      File myFile= new File("Fruits.txt");
			   
			      Scanner myReader= new Scanner(myFile);
			   
			     while(myReader.hasNextLine())
			    	 
			     {  
				   
			        String data= myReader.nextLine();
			    
			        System.out.println(data);
			    
			   }
			   
			       myReader.close(); 
			   
			  }
			  
			  catch(FileNotFoundException e) 
			  
			  {
				  
			   System.out.println("An Error Occured");
			   
			   e.printStackTrace();
			   
			  }
			  
			   
			  FileInputStream instream= null;
			  
			  FileOutputStream outstream= null;
			  
		      try 
		      {
		    	  File infile= new File("Fruits.txt");
		    	  
			      File outFile=new File("myFile.txt");
			
			      instream = new FileInputStream(infile);
			      
			      outstream = new FileOutputStream(outFile);
			
			      byte[] buffer =new byte[1024];
			
			      int length;
			
			     while ((length=instream.read(buffer))>0)
			     {
			    	 
			     outstream.write(buffer,0,length);
			    }
			
			    instream.close();
			    
			    outstream.close();

		         System.out.println("File Copied Successfully");
			
		
		 }
		      catch(IOException e)
		      {
			
		    	  e.printStackTrace();
		      }
	
		
	}


	         File myFile=new File("Fruits.txt");
	         
	         {
		
			   if(myFile.delete())
				   
			  {
			     System.out.println("Deleted the file:"+ myFile.getName());
			   
			  }
			   
			  else 
			  {
			   System.out.println("Failed to delete ");
			  }
	}

}



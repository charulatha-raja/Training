package com.training;

import java.lang.*;

import java.lang.String;

public class Permutation
{

	public static void main(String[] args)
	{
		java.lang.String string = "cat";
		
		int n= string.length();
		
	 Permutation permute = new Permutation();
	 
	 Permutation.permute( string,0,n-1);
		
		
		
		

}

	private static void permute(String string, int l, int j)
	{
		if(l==j)
		{
			System.out.println(string);
		}
		
		else
		{
			for(int n=1; l<=j;l++)
			{
				
				string=swap(string,j,l);
				
				permute(string,l+1,j);
				
				string=swap(string,j,l);
				
				
			}
		}
		
	}

	private static String swap(String string, int i, int j)
	{
		
		char temp;
		
		char[] charArray = string.toCharArray();
		
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.copyValueOf(charArray);
		
		
		
		
		
	}
}

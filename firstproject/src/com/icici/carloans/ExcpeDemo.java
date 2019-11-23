package com.icici.carloans;

public class ExcpeDemo 
{

	public static void main(String[] args) 
	{
	
			int nr=100,dr=0,result=0;
			
			while (true) 
			{
				try 
				{
					result = nr / dr;
					System.out.println(result);
				} 
				   catch (ArithmeticException e) 
				{
					e.printStackTrace();
				} 
			}

		
		}

	}



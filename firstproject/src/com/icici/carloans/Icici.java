package com.icici.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args)
	{
		Icici i= new Icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() 
	{
	  System.out.println("hii iam withdrawl implmented in icici");  
		
	}

	@Override
	public void deposit()  
	{
	
		System.out.println("hii im deposit implemnetd in icici");
	}

}

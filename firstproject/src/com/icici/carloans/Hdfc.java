 package com.icici.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		
			 h.deposit();
		     h.withdrawl();

	}

	@Override
	public void withdrawl()
	{
		System.out.println("hi iam withdrawl implemented in Hdfc ");
		
	}

	@Override
	public void deposit()
	{
		System.out.println("hi iam deposit implmented in Hdfc");
		
	}

}

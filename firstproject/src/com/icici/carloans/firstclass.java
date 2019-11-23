package com.icici.carloans;

public class firstclass 
{
  int a=20,b=10,c=0;
  
   public void add() 
   {
    c=a+b;
	System.out.println("addition of a & b is"+c);
   }
	
	 public void sub() 
	 {
		c=a-b;
		System.out.println("substraction of a & b is"+c);
	}
	
	
	
	
	public static void main(String[] args) 
	{
	 System.out.println( "hi welcome to selinium");
      firstclass obj=new firstclass();
      obj.add();
      obj.sub();
       
	}

}

package com.icici.homeloans;

public class DemoClass
{
   int a=100;               //instance variable
   static float Roi=8.5f;   //static varible
    
   
     public void  m1()
     {
      int a=1000; 
      System.out.println(" hii iam m1....");
      System.out.println(this.a);
      
     }
	public static void main(String[] args) 
	{
	 	DemoClass obj=new DemoClass();
	 	obj.m1();
	}

}

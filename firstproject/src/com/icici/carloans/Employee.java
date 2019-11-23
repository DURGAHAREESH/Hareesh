package com.icici.carloans;

public class Employee 
{
   int eno;
   String ename;
   float sal;
   
	public static void main(String[] args) 
	{
     Employee e1=new Employee();
     e1.eno=1744;
     e1.ename="hareesh";
     e1.sal=8000.00f;
    
	 System.out.println(e1.eno);
	 System.out.println(e1.ename);
	 System.out.println(e1.sal);
    
	 Employee e2=new Employee();
	 e2.eno=1745;
	 e2.ename="nareesh";
	 e2.sal=80001.00f;
	 
	 System.out.println(e2.eno);
	 System.out.println(e2.ename);
	 System.out.println(e2.sal);
	}

}

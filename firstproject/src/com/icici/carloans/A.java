package com.icici.carloans;

public class A 
{
 byte b=127;
 short s=13367;
 int   i=36369;
 long  l=12456;
 
 float f=32.56f;
 double d=12.32;
 
 char c='a';
 boolean bb=true;
 
	 
	 String str="hareesh";
	 
	  public static void main(String[] args) 
		{
		  A obj=new A();
	  
	  System.out.println("byte:"+obj.b);
	  System.out.println("short:"+obj.s);
	  System.out.println("int:"+obj.i);
	  System.out.println("long:"+obj.l);
      System.out.println("float:"+obj.f);
	  System.out.println("double"+obj.d);
	 
	  System.out.println("char:"+obj.c);
	  System.out.println("boolean:"+obj.bb);
	 
	  System.out.println("string:"+obj.str);
	}

}

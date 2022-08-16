package com.src.core;

public class BasicOperation {

	public static void main(String[] args) 
	{
	System.out.println("Welcome to ATM");
	int sum= add(2,4);
	System.out.println("Value of sum " +sum); 
	}


	static int add (int a, int b)
	{
	   int d=a+b;
	   return d;  
	}

	static int add (int a, int b , int c)
	{
	   int e=a+b+c;
	   return e;  
	}

}

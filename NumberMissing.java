package com.src.core;

public class NumberMissing {

	public static void main(String[] args) 
	{
	int A[]= {1,2,4,5};
	int actualArraySize = A.length+1;
	int sum=0;
	
	int actuallArraySum =  (actualArraySize*(actualArraySize+1))/2;
	
	for(int i=0;i<A.length;i++)
	   {
		
		sum= sum+A[i];
		
	   }
	int currentArray =sum;
	int numbermissing= actuallArraySum-currentArray;
	System.out.println("Number missing " +numbermissing);
	}
}

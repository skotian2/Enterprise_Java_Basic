package com.src.core;

public class StringOperation
{
	public static void main(String[] args)
	{
		String S = new String ("Encyclopedia");
		int A = S.length();
		System.out.println("Length of String "+A);
	    Boolean out="Encyclopedia".equals("Demo");
	    Boolean in="Encyclopedia".equals("Encyclopedia");
	    System.out.println("Equality of String "+out);
	    System.out.println("Equality of String "+in);
	    String IndData = S.toUpperCase();
	    System.out.println("Value for IndData "+IndData);    
	}
}

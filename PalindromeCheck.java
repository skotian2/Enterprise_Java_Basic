package com.src.core;

import java.util.Scanner;

public class PalindromeCheck
{
  public static void main(String Args[])
  {
  String RevData="";
  System.out.println("Enter the String = ");
  Scanner Stdin = new Scanner(System.in);
  String data=Stdin.nextLine();
  System.out.println("Entered String is  = "+data);
  
  char[] chardata =data.toCharArray();
  for(int i=chardata.length-1;i>=0;i--)
    {
	 System.out.print(chardata[i]);
	 RevData = new String(chardata);
	
	}
  //System.out.println(RevData);
  if(data==RevData)
    {
	  System.out.println("String is Palindrome ");
    }
  System.out.println("String is not Palindrome ");
  }

  

}

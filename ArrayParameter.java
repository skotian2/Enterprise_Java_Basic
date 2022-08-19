package com.src.core;

public class ArrayParameter 
{
  public static void main (String Args[])
  {
  int A[]= {1,2,3,4,5};
  ArrayRev(A);
  int C[]=A;
  for(int i=0;i<C.length;i++)
    {
	  System.out.println(C[i]);
	  System.out.println("Inside return method");
    }
  

  }

  public static int[] ArrayRev(int[] A)
  {
	  for (int i=A.length-1;i>=0;i--)
      {
	    System.out.println(A[i]);
      }
	  System.out.println("Exiting Arrayrev method");
  return A;
  }



}

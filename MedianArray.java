package com.src.core;

import java.util.Arrays;

public class MedianArray {

	public static void main(String[] args)
	{
	int A[]= {1,2,3};
	int B[]= {4,5,6};// TODO Auto-generated method stub
    int A1=A.length;
    int B1=B.length;
    int C1=A1+B1;
    int C[]=new int[C1];
    
    System.arraycopy(A, 0, C,0 ,A1);
    System.arraycopy(B, 0, C,A1 ,B1);
    
    System.out.println(Arrays.toString(C));
	}

}

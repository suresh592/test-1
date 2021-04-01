package com.scjppreparation.basics.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayInitialization {

	public static void main(String[] args) {
		
		//when ever we are creating an array those are defaulty initialized with the automatic values
		
		long[] l=new long[5];
		
		//when ever we are trying to pring an array reference internally to string method will be called
		System.out.println(l);
		System.out.println("Default Values in the array");
		for(long v:l)
			System.out.println(v);
		
		l[0]=21;
		l[1]=23;
		l[02]=25;
		l[3]=27;
		l[4]=29;
		
		System.out.println("The over ridden values in the array");
		for(long v:l)
			System.out.println(v);
		
		
		//we can also declare an array like this also
		System.out.println("integer Array");
		int[] c= {21,23,24,46};
		
		//length is a final variable applicable only for array
	
		//in multi dimensional array lenght variable represents only base size but not the total array size
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
	
	}
}

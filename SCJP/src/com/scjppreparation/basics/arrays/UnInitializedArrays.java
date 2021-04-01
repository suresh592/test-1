package com.scjppreparation.basics.arrays;

public class UnInitializedArrays {
	
	int[] a;
	
	static int[]d; 
	
	public static void main(String[] args) {
		
		//this is an instance level
		UnInitializedArrays uar=new UnInitializedArrays();
		System.out.println(uar.a);
		
		//we willl get nu=ll pointer exception
	//	System.out.println(uar.a[0]);
		
		
		//sttatic level
		System.out.println(d);
		
		
		//we will get null pointer exception in static level also
		//System.out.println(d[0]);
		
		
	}

}

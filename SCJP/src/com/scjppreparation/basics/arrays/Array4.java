package com.scjppreparation.basics.arrays;

public class Array4 {
	
	int ar[]= {12,13,14,15};
	
	char ch[]= {'a','s','d','f'};
	
	public static void main(String[] args) {
		
		Array4 ar4=new Array4();
		
		System.out.println("These are the int value variables");
		for(int i=0;i<ar4.ar.length;i++)
		{
			System.out.print(ar4.ar[i]+"\t");
		}
		
	System.out.println("These are the character variables");
	
	for(char c:ar4.ch)
	{
		System.out.println(c);
	}
		
		
	}

}

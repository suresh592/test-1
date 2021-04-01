package com.scjppreparation.basics.arrays;

public class AnonymousArrays {

	
	static int add(int[] a)
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		//arrays without having a name are called anonymous arrays
		
		//at the time of anonymours array creation we cannot specify the size other wise we will get teh compile time error
		
		//new int[5] {10,20,30,40,50}
		
		int result=add(new int[] {10,20,30,40,50});
		
		System.out.println("addition of array number is "+result );
	}
}

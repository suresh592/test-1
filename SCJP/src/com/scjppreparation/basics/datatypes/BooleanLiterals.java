package com.scjppreparation.basics.datatypes;

public class BooleanLiterals {
	public static void main(String[] args) {


   //The only specified values for the boolean literals is true and false
		
		int x=10;
		//if(x=20)  Compile Time Excecption
		if(x==20)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("hii");
		}
		
		boolean b=true;
		if(b=false)//assigns b value to false
		{
			
			System.out.println("hello");
		}
		else
		{
			System.out.println("hii");
		}
		System.out.println(b);
		
		if(b==false)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("hii");
		}
		
		
		//boolean is the type returned by all relational operators
		//the outcome of the relational operator is true
		
		//this is also the returned and required by the conditional expressions
		System.out.println("10 > 9 is "+(10 > 9));
		
	}
}

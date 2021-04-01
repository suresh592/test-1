package com.scjppreparation.basics.flowcontrols;

public class IfElse {
	
	public static void main(String[] args) {
		//flow control describews  teh order in which the statements are executed
		//to control teh flow of execution to advance and branch  	based on changes to teh state of teh program
		
		//if(b)
		//action if b is true
		//else
		//action i]if b is false
		
		
		//the arguement to teh if statement is boolean type
		//if we are providing any other type than this we will get error
		
		int x=10;
		
		// in the below cases we will get the compiler error
		//if(x)
		//if(x=10)
		boolean b=false;
	//this is valid
		if( b)
		{
			System.out.println("X is equal to ten");
		}
		else
		{
			System.out.println("X is not equal to 10");
		}
		
		//this is also valid
	
		
		//here curly braces are optional 
		//without curly braces we can take only one statement 
		if( b=true)
		{
			System.out.println("X is equal to ten");
		}
		else
		{
			System.out.println("X is not equal to 10");
		}
	
		
		if( x==10)
		{
			System.out.println("X is equal to ten");
		}
		else
		{
			System.out.println("X is not equal to 10");
		}
		
	}

}

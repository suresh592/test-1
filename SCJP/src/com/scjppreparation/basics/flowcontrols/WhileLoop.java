package com.scjppreparation.basics.flowcontrols;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		
		//if we dont k now the number of iteratiosn in advance then we will go for While loop
		
		//while(it.hasnext())
		
		
		//syntax
		
		//while(b)
		//statements
		//curly brqaces are optional and without that we can execute only one statement
		//that statement should not be teh delarative statement
		
//		
//		while(true) 
//			//the single statemetn must nit be a declarative one
//			int x=10;
//			System.out.println("hello");
//		
//		while(true);
//		
	
//		final int a=10,b=20;
//		while(a<b)
//		{
//			System.out.println("Hello");
//		}
		
		//if we use final variables then it will show unreachable code
		//if we write any statements after while loop
		//System.out.println("jaii");
		
		
		// teh body of the while loop can be empty 
		//thhis is because a null statement is one that consisits of a semi colon is syntactically valid in java
		
		int i=100;int j=200;
		while(++i <--j);
		
		System.out.println("Mid Value is "+i);
		
			
	}

}

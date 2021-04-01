package com.scjppreparation.basics.operators;

public class AssignmentOp {
	public static void main(String[] args) {
		
		
		//simple assignment  =
		
		
		//we cannnot perform chained assignment at the time of declaration
		//chained assignment  a=b=c=d=20;
		
		
		//some times we can mix the assignment operator with some other operator to form compound assignment operator
		
		//&=  |= ~=
		//>>=  <<=   >>>=
	
		//compound assignment a + =b;
		
	
		  // operand name  operator = operand name or constant value
		//in compound assignments the type casting will be performed automatically
		
		byte b=1;
		
		//error
		//b=b+1
		
		b+=1;
		System.out.println(b);
		
	}

}

package com.scjppreparation.basics.typecasting;

public class AutomaticPromotions {

	public static void main(String[] args) {
		
		//compiler is responsibel to perform this type casting 
		//requires when we are assigning smaller data type values into the larger data type values
		
		//called widening or upcasting
		
		
		// first of all all the byte short char values are automatically promoted to teh int values
		
		//if one of the operand is long in the expression then all the values are automatically promotred to long
		
		//iuf one of the operands in double in teh expression tehn the expression is automatically oromoted to doublr
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		//trhe whol;e ex-ression is converted into doyubl because teh exprpessuion containd s double value
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
		
	}
}

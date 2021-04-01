package com.scjppreparation.basics.typecasting;

public class Casting {
	
	public static void main(String[] args) {
		
		
		/// programmer is responsible to perform this type casting
		//requires when we are assigning bigger data type value to the smaller data type value
		//narrowing or down casting
		byte b=20;
		
		
		//when ever we are assigning  bigger data type value to the smaller data type value 
		//tehn there is a chance for the loss of precisiion
		//the most significant bit is lost
		
		//here the eror arrises beause teh value is fit into teh byte range and 5 is int here
		//there fore we need type casting
		b=(byte) (b*5);
		System.out.println(b);
		double d=16541.215646;
		
		//when we convert or cast  float values to doubles then we will have a chance of losing the precision values
		short s=(short) d;
		System.out.println(s);
		
		
		
	}

}

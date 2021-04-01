package com.scjppreparation.basics.operators;

public class BitwiseComplement {
	
	public static void main(String[] args) {
		
		//~
		//we cannnot apply to boolean
		
		//System.out.println(~true);
		//we can apply this operator to any intergal data types
		
		System.out.println(~4);
		
		
		 //0000 0000 0000 0100  
		
		//the above is the number 4
		
		
		//first apply negation
		
		// 1111 1111 1111 1011
		
		                   //note the first sign bit that is the most significant bit
		
		//then find the twos compliment of that number
		
		//that is ones compliment + 1
		
		//ones compliment is the negation of that number
		// 1111 1111 1111 1011
		
		//this is the ones compliment
		//  000 0000 0000 0100
		
		//then add one to the above 4
		
	//the result is 5 and add teh sign of the msb that we negate
		
		System.out.println(~12);
		
		
		
 		//                   	
	}

}

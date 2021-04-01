package com.scjppreparation.basics.assertions;

public class AssertAugmented {

	
	//we can use augmented version to describe some arguement aboiut 		augmented version to teh assertion error
	
	
	public static void main(String[] args) {
		
		
		
		int x=250;
		
		assert(false):++x;
		
		System.out.println("program is termiated normally");
		System.out.println(x);
		
		//assert(e1):e2;
		//here e2 will be evaluted iff e1 is false
		
		//if e1 is true then e2 will not be evaluated
		
		
		//as e2 we can also take a method 
		
		//but void types are not allowed
		
		assert(x>436534):m1();
	}

	private static String m1() {
		// TODO Auto-generated method stub
		return "589545";
	}
	
	//if m1 return type is void then we will get error	
	
}

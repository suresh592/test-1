package com.scjppreparation.basics.assertions;

public class AssertSimple {

	
	//assert(b)     
	
	//here b should be boolean thype 
	
	//if b is true thwn our assemption is satisfied and rest of theprogram will be executed normlly
	
	//if b is false then our assertion fails the program will be termiated by raising run time exception saying
	
	//assertion error so that we can able to fix the probrlem
	
	
	public static void main(String[] args) {
		
		
		
		int x=250;
		
		assert(x>1000):"The program termiated abnormally";
		
		System.out.println("program is termiated normally");
	}
}

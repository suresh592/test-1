package com.scjppreparation.basics.assertions;

public class AssertionErro {

	
	//this is the hcild class of error and hence it i sunchecked
	
	//this is legsl to catch assertion error by using try catch but it is stupid activity
	
	
	public static void main(String[] args) {
		
		
		int x=90;
		
		try
		{
			
		assert(x>100);
		}
		catch (AssertionError e) {
			// TODO: handle exception
			System.out.println("This is the stupid activity");
		}
		
		
		
	}
}

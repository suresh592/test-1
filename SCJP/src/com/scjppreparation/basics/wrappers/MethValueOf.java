package com.scjppreparation.basics.wrappers;

public class MethValueOf {
	
	

	    //we can use valueOf method for creating wrapper object as an alternative to constructor
	
	//form 1 
	
	//every wrapper class expect character class contains a static valueOf() method fro cpnverting String to the wrapper object
	
	//public static Wrapper valueOf(String s)
	
//	Integer i=Integer.valueOf("25");
//	
//	Boolean b=Boolean.valueOf("true");
//	
//	Double d=Double.valueOf("10.5");
//	
//	Long l=Long.valueOf("13456789");
	
	
	//fomr 2
	
	//every intergal type wrapper class contains the following valueOf() method to convert specific radix String form to corresponding 
	
	//wrapper object
	
	//public static Wrapper valueOf(String s, int radix)
	
//	Integer i=Integer.valueOf("1010", 2);
//	
//	Integer ii=Integer.valueOf("1011",2);
//	
	
	
	//form 3
	
	//every wrapper calss including  character calss contains the following valueOf() to convert primitive to corresponding wrapper obejct
	
	//public static Wrapper valueOf(Primitive P)
	
		Integer i=Integer.valueOf(10);
		
		Float f=Float.valueOf(123456.456f);
		
		Character c=Character.valueOf('d');
		
		Boolean b=Boolean.valueOf(false);
		
		// the String or  the primitive data types by using the valueOf() method  we can convert them into Wrapper Object 
	
}

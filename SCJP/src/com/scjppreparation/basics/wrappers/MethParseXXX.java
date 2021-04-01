package com.scjppreparation.basics.wrappers;

public class MethParseXXX {

	//we can use parseXXX to convert String to corresponding primitive
	
	
	//form 1
	
	//every wrapper class except character class contains the following parseXXX() methods to convert String to correspoonding primitive
	
	
	//public static primitive parseXXX(String s)
	
//	int i=Integer.parseInt("String s");
//	
//	double d=Double.parseDouble("String s");
//	
//	long l=Long.parseLong("String s");
//	
//	Boolean b=Boolean.parseBoolean("String s");
	
	
	//form 2 
	
	//every integral type wrapper class contains the following parseXXX() to convert specified radix string to corresponding primitive
	
	int i=Integer.parseInt("1101", 2);
	
	short s=Short.parseShort("11011", 2);
	
	long l=Long.parseLong("110001",2);
	
	byte b=Byte.parseByte("0011",4);
	

}

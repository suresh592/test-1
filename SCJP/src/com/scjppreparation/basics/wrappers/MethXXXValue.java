package com.scjppreparation.basics.wrappers;

public class MethXXXValue {

	//we can use XXXValue to convert Wrapper object to primitive data types
	
	//Every number type wrapper class contains the following six XXXValue() methods
	
	//teh methods ARE:
	
	 //public int intValue()
	
	//public byte byteValue()
	
	//public long longValue()
	
	//public short shortValue()
	
	//public float floatValue()
	
	//public double doubleValue()
	
	
	

	
	public static void main(String[] args) {
		
		MethXXXValue mm=new MethXXXValue();
	
	
//		
		
		
		
		
		
		
		
		Double d=new Double(12345.654);
		
		System.out.println(d.byteValue());
		
		System.out.println(d.intValue());
		
		System.out.println(d.floatValue());
		
		System.out.println(d.longValue());
		
		System.out.println(d.doubleValue());
		
		System.out.println(d.shortValue());
		
		
		//character class contains a char value method  to convert charcter objec to char primitive
		
		//public char charValue()
		
		
//		Character ch=new  Character('@');
//		
//		char ch1=ch.charValue();
//		
//		System.out.println(ch + "\t"+ch1);
//		
		
		//boolean class contains the booleanValue() to find boolean primitive for the given object.
		
			//public boolean booleanValue()
		
		Boolean b=Boolean.valueOf("durga");
		
		boolean bb=b.booleanValue();
		
		System.out.println(bb);
		
		
		//total 38 xxx methods are availale which are used to convert Wrapper to primitive obejcts
	}
	
}

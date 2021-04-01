package com.scjppreparation.basics.autoboxing;

public class AutoUnBoxing {

	
	public static void main(String[] args) {
		
		
			//automatic conversion of wrapper object to theprimitive type by compiler is called 	auto unboxing
		
		//int i=new Integer(10);
		int i=new  Integer(25);
		
		//here compiler automatically converts Integer to int automatically by auto unboxing
		
		
		
		Integer ii=new Integer(456);
		
		int j=ii;
		
		//after compilation this line will become  
		
		//int j=ii.intValue();
		
		
		//auto unboxing i sinternally implemented by using xxxValue()	
		
		
		
		
		
		int ij=intt;   //auto unboxing
		
		m1(ij);   //Auto boxing
	}
	
	private static void m1(Integer ij) {
		// TODO Auto-generated method stub
		
		int k=ij;    //auto un boxing
		
		System.out.println(k);
		
	}

	static Integer intt=256;  //auto boxing
	
	
	
	//because of auto boxing and auto unboxing , from 1.5 onwards there is no difference between primitive value and wrapper object,
	
	//we can use them interchangeably
}

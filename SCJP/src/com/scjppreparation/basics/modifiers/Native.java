package com.scjppreparation.basics.modifiers;

public class Native {

	
	static
	{
		System.loadLibrary("native library");

	}
	
	
	//native methods are already implemented in some other languages
	//so me must ends the native methods with a semi colon
	public native void m1();
	{
		
	}
	
	
	//abstract native is illegal 
	//abstract does nto have any declaration
	//native mwethds are alrady implementedin some other languages
	
	public static void main(String[] args) {
		
		
		
		//applicable only for methods
		//but nt for classes and modifiers
		
		//these methods are implemented in some other languages
		
		
		Native m1=new Native();
		m1.m1();
		
	
		
		
		
		
	}
}

package com.scjppreparation.basics.varargs;

public class CasesInVargs {

	public static void m1(int x)
	{
		
		System.out.println("Normal Method");
	}
	
	//we cannot declare teh varg method and an array parameter method in a single class
	
	
	
//	public void m1(int[] x)
//	{
//		
//	}
//	
	public static void m1(int... x)
	{
		System.out.println("Var Arg Method");
	}
	
	public static void main(String[] args) {
		
		
		
		m1();//v arg method called
		m1(10);
		//normal method called
		m1(20,30); //v arg method called
		
		//in general varg method will get the least priority
		//if any other method does not matched theny only v arg method will get executed
		
		//this v arg metrhod is like a default inside a switch
		
		
	}
	
}

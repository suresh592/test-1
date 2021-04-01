package com.scjppreparation.basics.modifiers;

public class Staticc {
	
	//applicable for methods and vaariables but not for main classes
	//it is appliable for innner classes
	
	//vaslue of a variable changes from object to object tehn we will go for instance variable
	//in case of instance variable every obejct has a separate copy will be created
	
	//if the value of the variable is same for all objects then we will go for static variables
	//for stativ only one copy is created at class level
	
	
	
	//this can be accessed from both instance nad static areas

	
	int x;
	static String name;
	
	
	//for staic methods implementation is compulsory
	//but for the abstarct implementation is not needed
	
	//static sb-=abstract combi is illegal
	public static void main(String[] args) {
		
		
		Staticc ss=new Staticc();
		
		ss.x=20;
		System.out.println("X variable for ss Object");
		System.out.println(ss.x);
		ss.name="Sai";
		System.out.println(ss.name);
		Staticc ses=new Staticc();
		ses.name="vefrt";
		ses.x=450;
		System.out.println(ses.x);
		System.out.println(ses.name);
		
		
		
	}
}

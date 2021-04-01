package com.scjppreparation.basics.datatypes;

public class VariablesNonStaticInstance {
	
	//these are the variables which are declared inside a class
	
	//jvm will assign default values to the non static or instance variables
	
	//scope of the non static variables are specific to an object only
	
	
	//value of a varibel varied form object to object
	//for every object a separate copy instance variables will be maintained
	
	
	// created at the time of obecjt  creation and destroyed at teh time of object destruction
	//these are stored as part of ibjects
	
	//instance variables also known as Object level variables
	private int x=3456794;
	protected String name;
	double fee;
	public boolean isPassed;
	char ch;
	
	Integer xxx;
	
	void display()
	{
		
		System.out.println(x +"\t"+ name +"\t"+ isPassed +"\t"+fee +"\t"+"char value is  "+ ch + "  Integer Obejct value is" +xxx);		
	}
	
	void disp()
	{
		//we can access non static variables and methods directly from another non static variables and methods
		
		System.out.println(xxx +"\t"+isPassed);
		display();
	}
	
	static void m2()
	{
		
		//disp();
		
	}
	
	public static void main(String[] args) {
		
		//non static variables and methods we cannot access directly from static methods
		
		VariablesNonStaticInstance vr=new VariablesNonStaticInstance();
		
		//vr reference variable
		
		vr.x=123;
		
		vr.ch='A';
		
		vr.fee=123456.321;
		
		vr.xxx=6789;
		
		vr.isPassed=true;
		
		System.out.println("Values belongs to Vr Obejct");
		System.out.println(vr.x +"\t"+ vr.name +"\t"+ vr.isPassed +"\t"+vr.fee +"\t"+"char value is "+ vr.ch+"\t"+"Integer Variable "+vr.xxx);
		
		vr.disp();
		
		VariablesNonStaticInstance vrr=new VariablesNonStaticInstance();
		
	vrr.x=789;
		
		vrr.ch='D';
		
		vrr.fee=789465.321;
		
		vrr.xxx=678456;
		
		vrr.isPassed=false;
		
		System.out.println("Values be;ongs to VRR object");
		System.out.println(vrr.x +"\t"+ vrr.name +"\t"+ vrr.isPassed +"\t"+vrr.fee +"\t"+"char value is "+ vrr.ch+"\t"+"Integer Variable "+vrr.xxx);
		//reference variable once have null we cannot access non static variables
		
		//vr=null;
		
		vr.disp();
		
		
		//it generates null pointer exception
		
		//wants to access non static members and objects 
		//we want to create an object
		//object is an instance of a class. it means non static variables and methods comes and stores insides the class 
		//when we create the Object
	}

}

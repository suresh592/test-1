package com.scjppreparation.basics.constructors;

public class DefaultConstructor {
	
	
	
	//if we are not writing any constructor then teh compiler will always generate the default xonstructor
	
	//if we are writing atleast one constructor then compiler wont generate default constructor
	
	
	//hence a class can contain either a programmer written constructor or  compiler generated constructor
	//but not both simultaneously
	
	
	//prototuype
	//it is always no arguement constructor
	
	//teh access modifier of the counstructor is same as of the class but his rule is applicable for default and public ones only
	
	//it contains only ine line 
	//a class to its super class constructor
	
	
	public DefaultConstructor()
	{
		super();
		System.out.println("This is teh default constructor which is automatically executed when the objetc is created");
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}

}

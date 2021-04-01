package com.scjppreparation.basics.constructors;


class Super
{

	public Super() {
		super();
		// TODO Auto-generated constructor stub
	System.out.println("Super Class Constrictor");
	System.out.println("This is called automatically without calling the Object");
	}
	
	String name;

	public Super(String name) {
	this();
		this.name = name;
		
		System.out.println("This is th eparameterized constructor in sub class");
		System.out.println("name is "+name);
	}
	
	
	
	
	
}

public class KeyWrdSuperOf  extends Super{

	
	
	
	//using super() we can call super class constructor from sub class constructor
	
	//we can use superOf once we hacve the relation between two classes
	
	public KeyWrdSuperOf() {
		
		super("Yeshodamma");
		System.out.println("Sub CLass Constructor");
		// TODO Auto-generated constructor stub
	}

	//super() we can write as the first statement of the constructor other wise we will get the compile time error
	public static void main(String[] args) {
		
		KeyWrdSuperOf ks=new KeyWrdSuperOf();
		
		
		
	}
}

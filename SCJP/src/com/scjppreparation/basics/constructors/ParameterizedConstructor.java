package com.scjppreparation.basics.constructors;

public class ParameterizedConstructor {

	
	//if the constructor having parameters the it is called as a parameterized constructor
	
	//using this we can store or provide different values or same values on different objects
	
	int sno;
	String name;
	public ParameterizedConstructor(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(sno+"\t"+name);
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor pc=new ParameterizedConstructor(12345, "Yeshodamma");
		ParameterizedConstructor pc1=new ParameterizedConstructor(78945, "Sai Gangadhar");
		pc.display();
		pc1.display();
		
		
	}
}

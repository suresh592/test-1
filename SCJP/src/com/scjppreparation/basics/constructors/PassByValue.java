package com.scjppreparation.basics.constructors;

public class PassByValue {

	//primitive values passed as a corresponding pasrameter is calledd call by value/pass by value
	
	//formal parameters
	void display(int sno, String name, String address)
	{
		System.out.println("Roll Number "+sno);
		System.out.println("Name is "+name);
		System.out.println("Address is "+address);
	}
	public static void main(String[] args) {
		
		PassByValue pb=new PassByValue();
		
		//Axctual Parameters
		pb.display(123456, "Sai Gangadhar", "Narasannagari Palli");
	}
	
}

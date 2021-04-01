package com.scjppreparation.basics.cloningandcasting;

public class Student {
	
	String rollNum;
	String name;
	
	
	public Student(String rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(rollNum +"\t"+name);
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}

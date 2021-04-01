package com.scjppreparation.basics.constructors;


class Parent
{

	public Parent() throws Exception  {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
public class ConstOverload extends Parent {
	
	
	int z;
	int mm;
	
	
	//a class can contain more thatn one constructor with the sam ename
	
	//but different arguements and these constructors are called as over loaded cons=tructors

	
	
	

	//if teh parent class constructor can throw some exception '
	//compulsory the child class constructor can also throm some exce=ption
	
	
	//if parent calss constructor throws somw checked exception then compulsory child class also throws checked exception
	//or its wont compile
	public ConstOverload(int z, int mm) throws Exception {
		super();
		this.z = z;
		this.mm = mm;
	}

	public ConstOverload(double i) throws Exception {
		// TODO Auto-generated constructor stub
		
		this(10);
		System.out.println("Double arguements");
	}
	
	public ConstOverload(int i) throws Exception {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("This is used for Int Arguements");
		
	}
	
	public ConstOverload() throws Exception {
	super();
	System.out.println("Thi sis teh normal COnstructor No Args");
		// TODO Auto-generated constructor stub
	}
	
	
	//inheriatnce and over riding concept is not applicable for constructors	
	//interfaces cannot ahvwe th constructor
	public static void main(String[] args) throws Exception {
		
		
		
		ConstOverload ct=new ConstOverload();
		
		ConstOverload ctt=new ConstOverload(25.654);
		ConstOverload c=new ConstOverload(5546);
		
	}
	
	
	
	//if the parent class can contain constructor 
	//then while writing the child class xonxstructor we have to take the special care
	
	//when ever we are wrting the arguement constructor it ishighly recommended to write no arguement constructor also
	
	

}

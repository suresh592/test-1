package com.scjppreparation.basics.oops;


class parents
{
	void m1()
	{
		System.out.println("This is in the parent class");
	}
}
class Main extends parents
{
	
	void m2()
	{
		System.out.println("This is in the child class");
	}
}
public class IsARelation  {
	
	//this is also called as inheritance 
	
	//the main advanatage is the reusabiity of the code
	
	//by using extends key word we can achieve is a relationshio

	
	public static void main(String[] args) {
		
		
		
		//what ever the parent class has by default available to the child class
		//hence the child clas reference can call both theparent cnad child classes
	
		
		System.out.println("Using Child Class Object");
		Main ma=new Main();
		ma.m1();
		ma.m2();
		
		
		
		//what evr the child class has by default available to the parent class
		//hence on the parent class reference we can call on ly the paren tclass methods and we cannot call chiold class ones
		
		parents pr=new parents();
		System.out.println("Using th eparen tclass Object");
		
		//using this we can calll paren t class methods 
		//we are not able to call chld class we will get error
		//pr.m2();
		
			pr.m1();
		
			//assigning chld reference to teh parent
			
			//we can use child class refernce to teh parent class but we want to cast it
			Main mai=(Main) new parents();
			
		
			mai.m1();
			mai.m2();
			
			
			//assifnign parent reference to child
			
			//but by usnig the parent reference we can call only the parent class methods but not the child class ones
			
			parents p1=new Main();
			p1.m1();
			
			
			//every class is a child clss Of Object in Java
			//we can achieve multiple inheritance using interfaces in java
			//we can have multi level inheritanc ein java
	}
}

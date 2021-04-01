
package com.scjppreparation.basics.constructors;

class Mn
{
	
	void fun1()
	{
		System.out.println("Super class Function 1");
	}
	
	void fun2()
	{
		System.out.println("Super class Function 2");
	}
}

public class KeyWrdSuper extends Mn {

	//super is a key word which points to super class Objects from sub class
	
	//it points to super class obejctws and variables when we have sub class objects and variables
	
	
	
	//we can differentiate them with teh super key word
	
	//using super key word we can access static variables adn methods but we cannot use super key word inside the static vontext
	
	void fun1()
	{
		System.out.println("Accessing suepr class from Sub class");
		super.fun1();
		System.out.println("Sub class Fuhnction 1");
	}
	
	void fun2()
	{
		System.out.println("Accessing suepr class from Sub class");
		super.fun2();
		System.out.println("Sub class Function 2");
	}
	
	void display()
	{
		//accessing super class functions in sub class directly
		
		System.out.println("Checking whic hmwwthods are called");
		fun1();
		fun2();
	}
	public static void main(String[] args) {
		
		
		
		KeyWrdSuper kw=new KeyWrdSuper();
		
		kw.display();
		kw.fun1();
		kw.fun2();
		
		
	}
	
	
}

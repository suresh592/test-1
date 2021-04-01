package com.scjppreparation.basics.constructors;

class A
{
	void m1()
	{
		System.out.println("THis is As Class");
	}
}

class B extends A
{
	void m1()
	{
		System.out.println("This is in the class B");
	}
}

class C extends B
{
	void m1()
	{
		System.out.println("This is in the class C");
	}
}

public class TypeCasting {
	
	//parent class reference can be used to hold child class reference
	

	//similarly interface reference can be used to hold implemented class object
	
	Runnable r=new Thread();
	//A b=(c)new d;
	
	
	//A class/interface
	
	//b reference variable
	
	//c class interface
	//d object reference object
	
	
	//here
	
	// C and Type Of D must have some relationship  either parent to child or c=hild to parent
	//otherr wise we will get the error saying incompatible types
	
	public static void main(String[] args) {
		
		
		Object o=new String("Yeshodamma");
		
	
		//error           StringBuffer sb=(StringBuffer) o;
		
		
		//C must be same or derived type of A other wise 	we will get the compile time error saying  incompatible types
		
		
		//teh underlying object type of d must be eitehr same or derved type of C other wise we will get teh run time exception saying 
		//class cast exception
		
		
		//in type casting we are converting type iof
		
//		
//		A a=new A();
//		a.m1();
//		
		C c=new C();
		c.m1();
		
//		B b=new C();
//		b.m1();   //B class
//		
//		A aa=new C();
//		aa.m1();  //A class
		
		((B)c).m1();  //Cs calss
		
		
		((A)c).m1();  //Cs class
		
//		((A)((B)c)).m1();   //C class
//		
	}
}

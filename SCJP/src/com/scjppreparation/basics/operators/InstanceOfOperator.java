package com.scjppreparation.basics.operators;

interface InsOff
{

}
public class InstanceOfOperator implements InsOff {

	public static void main(String[] args) {

		//By using the instance of operator we can check an object is particular type or not

		// r instance of x(x is any class or interface)

		InstanceOfOperator ins=new InstanceOfOperator();

		EqualityOperator eq=new EqualityOperator();

		System.out.println(ins instanceof InstanceOfOperator);

		Object obj=new Object();

		//any reference operator is an instance of Class Object we will get true
		System.out.println(ins instanceof 
				Object);

		System.out.println(ins instanceof InsOff);

		Short s=121;
		boolean b=(s instanceof Number);

		Thread t=new Thread();

		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Runnable );
		System.out.println(t instanceof Object);

	//to iuse  instanc eof compiulsory there sould be relation ship betrween operand types
		//other wise we will get the compiler error
		
		//when ever we are checking parent object as Child then we will get the compiler error
		
		System.out.println(obj instanceof String);
		
		//for any class or interface null instanceof refers to ali=ways false
		
		System.out.println(null instanceof Object);
		
		
	
	}

}



package com.scjppreparation.basics.oops;


class OverRideS
{
	
	
	public static void m1()
	{
		
		System.out.println("Over ride m1");
	}
	
	void m2()
	{
		System.out.println("Over ride m2");
	}
	
}


class Dummy extends OverRideS
{
	public static void m1()
	{
		System.out.println("Dummy M1");
	}
	
	void m2()
	{
		System.out.println("Dummy m2");
	}
}
public class OverridingStatic  {

	
	//ew cannot over rride a statc method as non static
	//the below is not possibe;
	//void m1()
	
	//similarly we cannot over ride non static as a static method
	
	//if both parent and child class static memberes are staic then we wont get teh compiler error
	//its callled method hiding
	{
		
	}
	
	
	 //method hiding  vs over riding
	
	//mh both methods should be static
		
	//or both methods should be non static
	
	//mh method resolutiontakes care by hte compiler based on the reference type
	
	//or method resolution takes care by jvm based in run timw environment
	
	//mh consoder as static polymorphism  early binding
	
	//or dynamic or run time
	
	public static void main(String[] args) {
		
		OverRideS os=new OverRideS();
		
		Dummy ds=new Dummy();
		
		OverRideS oss=new Dummy();
		
		
		os.m1();  //mh  parent
		os.m2();  //or parent
		
		ds.m1();   //mh child
		ds.m2();   //or child
		
		
		oss.m1();   //mh parent
		oss.m2();   //or Child
	}
}

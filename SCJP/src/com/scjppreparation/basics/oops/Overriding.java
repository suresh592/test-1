package com.scjppreparation.basics.oops;

import java.io.IOException;

abstract class OverRide
{
	
	
	
	//conencting method call to teh method body is called binding
	public Object obj()
	{
		return null;
		
	}
	
	private int name()
	{
		return 0;
	}
	
	public void p()
	{
		
	}
	
	
	void m()
	{
		
	}
	
	abstract void ab();
	
	void excep() throws Exception
	{
		
	}
	
	
	void ioEx() throws IOException
	{
		
	}
	
	void ex() throws Exception
	{
		
	}
}

public abstract class Overriding extends OverRide {

	//two methjods having the sam esignature in duifferent class and those calsses having the relation is called Overrifing
	
	//run time polyummorhism
	//late binding 
	//dynamic polymorphism
	
	//in over riding method name and parameters must be matched
	//that is signature msut be smae
	
	
	
	//in over riding the return type must also be sam e until 1.4 
	//from 1.5 alwaysco-variant return types aee allwed
	//teh child method return type need not be same as the parent method return type
	
	
	//Object String
	//Number  All Wrappe roBjects
	
	//double  int wrong
	//String Object wrong
	
	//THese cpovariant return type is only applicable for objects but not for primitive tyeps
	public String obj()
	{
		return null;
		
	}
	
	
	//not able to over ride paren tclass final method
	//over riding concept is notapplicable for porivate methods because thise are not vidible
	
	//based on the requirement we can declare the parent class private methodin child class
	//therer is not problem
	private int name()
	{
		return 0;
	}
	
	//for parent class abstract methods we can over ride in teh child class to provided implementation
	
	//we can also over ride parent class non abstract methods inchild class to over comeits ijmplementation in teh parent class
	
	//sycnronized strrictfp native wont play anyu rolein over riding

	
	
	//abstarct to non abstarct vice versa is possible
	//above class p is declared as non abstarct
	public abstract void p();
	
	
	//final to non final wrong
	
	//non final to final possible
	final void m()
	{
		//in the parent class m is declared as non final method
		
	}
	
	
	//abstarct to non abstarct vice versa is possible
	void ab()
	{
		//in the above class ab is declared as obstract
	}
	//these synchronized and native is same as abstract
	//synchronized to non synchronized vice versa is possible
	
	
	
	
	//while over riding we cannot decrease the scope of hte modifier
	//but we can increase the scope of hte modifier
	
	//public to pulbic
	
	//protected to proitectd or public
	
	//default o tdefault protected public
	
	
	
	//if a child class method throws an exception then parent class method must throws an exception
	//other wise error will genereted
	
	void excep() throws Exception
	{
		
	}
	
	void IoEx()
	{
		
	}
	
	void ex( ) throws IOException
	{
		
	}
	
	
	
	
}

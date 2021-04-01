package com.scjppreparation.basics.generics;

public class Gen<T> {
	
	T ob;

	public Gen(T ob) {
		super();
		this.ob = ob;
	}
	public void show()
	{
		System.out.println("The type of Ob is :"+ob.getClass().getName());
		
	}
	
	public T getOb()
	{
		return ob;
	}
	
	//this code we are accessing in basics Class

}

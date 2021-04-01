package com.scjppreparation.basics.constructors;

public class SuperThis {

	
	
	//the first line inside a constructor must eb super() or this()
	
	//if we dont write anythin ginside the constructor compiler will always places super()
	
	
	//super() or this() must be the first line in teh construtor
	//other wise we will get the compoile time error
	
	public SuperThis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//with in the constructor we can use this() or super() bu t not bith simultaneously
	

	
	public SuperThis(int i) {
		super();
		//compile time error
		//this();
		// TODO Auto-generated constructor stub
	}
	
	
	//we can use super() and this() inside constructor only
	
	//if we can use any  where
	//then we will get the compile tuime error
	
	void m1()
	{
		//this();
		
	}
	
	
	//this() to call the current class constructor
	
	//super() to call parent class constructor
	
	
	//super() this() avs super and this
     //these are constructor calls
	
	//st these are key words to refer super and current class instance members
	
	//we can use only in constructors
	
	//st we can use any where except in static area
	
	
	
	



}
	
	

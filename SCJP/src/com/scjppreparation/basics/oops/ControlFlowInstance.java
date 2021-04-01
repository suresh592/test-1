package com.scjppreparation.basics.oops;


class Child
{
	
	
	//control flow from parent to child
	
	//when ever we are crearting child class object the following sequence of everns will be created
	
	//identification of instanc emembers from parent to child
	//execition of instance variable assignments and instance blocks onl yi n parent calss
	//execution ofparent class constructor
	
	//execition of instance variable assignments and instance blocks onl yi n child calss
		//execution of child class constructor
	
int x=10;
	
static
{
	System.out.println("DSB");
	new Child().m2();  //0
	  //Fsb
}
	{
		m2();
		System.out.println("First Instance Control FLow Parent");
	}

	public Child() {
	super();
	System.out.println("THis is in the constructor Parent");
	// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		System.out.println("Main");
	}
	
	void m2()
	{
		System.out.println("This isin side method Parent " +y );
	}
	{
		System.out.println("Last INstanc eBlock Parent ");
	}
	
	int y=20;
	
	
	
	
}



public class ControlFlowInstance extends Child {

	
	//when ever wee are creating a n obejct the following activities will occur
	
	////Identification of instance members from top to bottom
	
	//execution of instanc evariable assignmetns and instanc eblocks from top to bottom
	
	//execution of ocnstructors
	
	//note : static control flow is only on etime activity and it will be performed at the time of class loading
	//but the instanc econtrol flow is not one time activity
	//for every object creation it will be executed
	
	
	
	
	
	
	int x=10;
	
	{
		mq();
		System.out.println("First Instance Control FLow Child");
	}

	public ControlFlowInstance() {
	super();
	System.out.println("THis is in the constructor  CHuild");
	// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		ControlFlowInstance ct=new ControlFlowInstance();
		System.out.println("Main");
	}
	
	void mq()
	{
		System.out.println("This isin side method  Child  "+y );
	}
	{
		System.out.println("Last INstanc eBlock CHild");
	}
	
	int y=20;
	

}

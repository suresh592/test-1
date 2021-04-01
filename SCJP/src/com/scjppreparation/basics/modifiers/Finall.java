package com.scjppreparation.basics.modifiers;


class fina
{
	
	//this method is not allowed to over ride
	final void disp()
	{
		System.out.println("THis is the final method in Fina class");
	}
	
}

final class Finall extends fina {

	//final class cannot have abstract methods
	//if we declare a method as final we iwll get teh compile time error
	
	//abstract void m2();
	
	//ths modifier is applicavble for methods, classes and variables

	
	//if a class is declared as final then we cannot create the child class to that class
	//that is its not extendealbe
	
	//every method oresent inside a final class is final by default
	//but every varaible present inside a final class need not to be final
	
	//if a method is declared as final then its not allowed to override in teh child class
	//if
	
	
	
	//final variables
	
	//in general for static and instance variables we wont do any initialization jvm will assign defafult values
	//but foe the final variabels we must want to initialization
	
	
	////if the instance variable is decalred as final then jvm wont provide any dafault values
	//we must want to initilize it explicitly
	
	
	final int x;
	
	//intialization at teh time of declaration
	final int y = 24;
	
	
	final int z;
	
	
	
	
	


	//intialization in the instance block
	{
		x=20;
	}
	
	
	
	//for teh normal static variables it is not required to perform initialization'//jvm will assign teh default values
	
	//but for the final statgic variables we n=must want to perform initialization
	
	
	static final int a;
	
	//at teh timeof declaration
	static final int b =45;
	static final int c=69;;
	
	//initialization at tehtime of static blo=ck
	
	static
	{
		a=500;
	}
	
	public Finall() {
		
		//we can initialize  teh final variables in teh contructor also
				z=24;
				
				//we cannoit initialize final stativ variables inside the constructor also
                   //c=76;
				// TODO Auto-generated constructor stub
			}

	
	//we can declare the formal parameters as final
	
	//if we declare formal parameters as final then we cant change those values
	//if we try to do it then we cannot access them
	void m1(final int b,final int c,final int x)
	{
		
	}

	
	public static void main(String[] args) {
		
		
		//if we are declaring local final variables
		
		//we need not to initialize them explicitly 
		//until we are using them
		
		//teh only applicable modifier for local variables is final
		
		final int x;
		
	}
	
	
	
}

package com.scjppreparation.basics.modifiers;

abstract class Pandavas
{
	//an abstract class cannot have zero number of abstarct classes
	void numberOfPandavas()
	{
		System.out.println("Pandavas are five in teh number");
	}
}
abstract class Vehicle
{
	abstract void numOfTyres();
}

abstract class Abstrct extends Vehicle {

	
	
	
	
	////this is applicable for methods and classes
	
	//for any java class if we dont want instantiation then we have to declare that class as abstrfact
	//for abstrct classes instantiation is not possible
	
	
	//if a method is declared as abstract then ithas only declaration nut it does not have any implentation
	//
	
	////every abstract method declaration must ends with  ;
	
	
	//the child classes are responsible to implen=ment abstract class avbstract methods
	//we cannnot access teh abstract clss from another package
	//its limited to a specific pacckageinly
	
	
	//abstract modifier never talks abourt implen=mentation
	//if any modifer talks about implementaion then it is an illegal combination
	
	//illegal combinations are
	
	
	
	//we can take contructor but this w=is executed when the child class object is created
	public Abstrct() {
		super();
		// TODO Auto-generated constructor stub
	}


	//abstract final
	//abstract synchronized
	//abstract static
	//abstract native
	//abstract strictfp
	//abstract private
	public abstract void m1();
	
	
	public static void main(String[] args) {
		
	
		
		//abstract class vs abstract method
		
		//Ac- if a class contains atleast one abstract method then it must declared as abstract class
		//other wise we will get teh compiler error
			//because teh implementation is not completet and we cannot create the object
		
		//ever though  a class does not contain an abstract method still we can declare that class as an abstract class
		//an abstract class can contain zero number of abstracct classes
	}
	
	
	//abstract vs final
	
	//final class cannot have abstract methods
	//but the abstract class can contain final methods with implementation
	
	final void m2()
	{
		System.out.println("This is the final method in the abstarct class");
	}
}

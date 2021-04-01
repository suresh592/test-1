package com.scjppreparation.basics.interfaces;

public interface Atm {
	
	//ijmplements vs extends
	
	//a class can extends only one class at a time
	//a class can implement any numbe rof interfaces at a time
	//a class can extend a class and can implement any number of interfaces
	

}

class b
{

	
	//if two interfaces can contain same method name with sam e signature and same return type
	//we can provideimplementation fo ronly oine  method
	
	
}
interface d 
{
	//an interface cannoti extends or implements a class
	
	//an interface can contain variables
	//he main purpose of this varaibles is to specify constants at requirement level
	//every interface variable is by default public static final whether we aredeclaring or not
	
	//static without existing object also the implementation class can access this varaible
	//final implementation class can access the variable but cannot modify it
	
	
	//for teh interface variable compulsory we should perform initialization at the decalration only o ther wise we will get the 
	//compile time error
	
	int x=20;

	
}
interface c extends d,Atm
{
	
	//whether we are delcaring or not every interface method by default should be public and  abstracct
	//why htis are poublic
	//to make it available to every implemented class it is stated as public
	//why it is abstract
	//because this method does not have any implementation
	
	
	//teh following modifiers are not applicable for interface methods
	
	// final  private protected  default   native synchronized static strictfp
	
	
}



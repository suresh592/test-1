package com.scjppreparation.basics.constructors;

class X
{
	static int i=Y.j;
}
class Y
{
	static int j=Z.m1();
}

class Z
{
	static int m1()
	{
		return Coupling.g;
	}
	
}
public class Coupling {

	public static int g;

	
	//teh above components are said to be tightly coupled with each other
	
	//it is not recommended because ti has several serious disadvanatages
	
	//without affecting another component we cannot modify a component
	
	//hence enhancement will become very difficulkt
	
	//hence it is highly recommended to maintain loose coupling and dependency between teh componenets should be as less as possible
	
	
	//cohesion
	
	//for  evry component a clear and welll defined  functionality we have ot define such type of component is said to have high cohesion
	
	//high cohesion is always a good programming practise
	
	//without affecting other componenets we can modify any component hence any component will become very easy
	
	//it improves maintainability of teh application
	
	//it promotes reuability of teh code
	
	
	//loose coupling and high cohesion are good programming examples
}

package com.scjppreparation.basics.interfaces;


interface i
{
	
	int x=999;
	//by default all methodsin an interface are public abstract
	void m1();
	//teh full method name is public abstarct void m1();
	
	int left(int zz);
	
}

interface z
{
	int x=888;
	void m1();
	void left();
	
}
public class Basics implements i,z {

	public static void main(String[] args) {
		revist();
		
		//an interface is a specification if set of members, methids and objects
		//from client point of view an interface defines the set of services whatis exoecting
		//from teh service provider point of view the interface defines teh set of services what he is offering
		//hence the interface cinsidered as contract between 
		
		//ex bank ATm Screen
		
		//within the interface we cannot write any implementation because it does not have any method implementations
		//it has just teh method declaration adn does not implement in the interface
		
		
		//interface is an 100 percent pure abstract class
		//we are acheieveing security because we are not implementing here /
		//enhancement will become very easy because without affteting the external entities we are 
		
		//teiio different systems can communicate via an interface
		
		
	}

	
	//if a class implements an interface then compulsory we should provide implementation of the methods in the interface
	//other wise we have to declare that class as an abstract class
	
	
	
	
	
	
	//if two interfaces can contain same method name with sam e signature and same return type
	//we can provideimplementation fo ronly oine  method
	
	
	//teh above twi interfaces can haveone method with sam esignature and same method name
	//we can provide impolementatiojn fo ronly one method
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	
	 //if an interface contans two methods with the same name and differemt return tu=ype then we have to provide ijmplementation 
		//for both the methods

	//teh below two mwthods are over loaded methods
	

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
		
		
	}


	@Override
	public int left(int zz) {
		// TODO Auto-generated method stub
		return 0;
	}

  
	
	//if an interface having two methods with the same signature and different return types
	//then it is unable to implement those methods
	//get teh compile time error
	//we cannnot write any java class by implementing both the interfaces
	
	
	
	

	static void revist()
	{
		//there may be a chance of two inetrfaces contains the sam e variable name and a class that oikmplements
		//both the interfaces
		
		//we will get compile time error
		//field x is ambiguous
		//System.out.println(x);
		
		//we can resolve the above conflicts using interface names
		System.out.println(z.x);
		System.out.println(i.x);
	}
}






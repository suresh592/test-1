package com.scjppreparation.basics.oops;


class Dumm
{

	//what evr the parent class has by default available to the child. if the child is not satisfied with teh parent class implementation
	
		//then the chld is allowed to redefine its implementation	in its own way. This is called over riding
	
	//the parent class method which is over ridden is called Over riden method and child class method which is over riding
	
	//is called  	oevr riding method
	
	public void properity()
	{
		System.out.println("Gold + cash +Land");
		
	}
	
	public void marry()
	{
		
		System.out.println("Vr");
		
	}
	
	void fun()
	{
		System.out.println("Dumm Class");
	}
	
}


class DunDum extends Dumm
{
	
	void fun()
	{
		System.out.println("Dum DUm Class");
	}
}

public class OvderRiding extends Dumm {
	
	
	public void marry()
	{
		
		System.out.println("Kajal");
		
	}
	
	
	//in over ridinf the method resolution always takes care by JVM based on the run time object and in 	over riding refernce
	
	//type never plays any role
	
	public static void main(String[] args) {
		
		
		Dumm d=new Dumm();
		
		DunDum dd=new DunDum();
		
	d.fun();//Dumm
	
	dd.fun();//DunDUm
		
	Dumm ddd=new DunDum();
	
	
	//using the parent class reference variable we can acess the over riden methods of the child class thats enough
	ddd.fun();//Dumm
	
	
	//when ever we assign child class refernce to parent we will get class cast exception
//	DunDum de=(DunDum) new Dumm();
//	
//	de.fun();//class cast exception
//	
	
	
	}

}

package com.scjppreparation.basics.innerclasses;


class PopCorn
{
	
	public void taste() {
		
		System.out.println("Salty");
	}
	
	
}

public class AnonymousInnerCls {

	//some times we can declare a class without name alsoo. such types of name less inner classes are called anonymous inner classes
	
	
	//these types of inner classes are most commonly used inner classes and these are of 3 types
	
	//Anonymous inner classes that extends a class
	
	//Anonymousinner classes that implement an nterface
	
	//anoymous inner classes that defined inside method arguement
	
	
	void m1()
	{
		System.out.println("This is the normal method");
	}
	
public static void main(String[] args) {
	
	
	//Anonymousinner class that extends a class
	
	PopCorn p=new PopCorn()
			{
		@Override
		public void taste() {
			// TODO Auto-generated method stub
			System.out.println("UsingAnonymousr Objects");
			System.out.println("Sweety");
		}
		
			};
			
			p.taste();
			
			
			
			PopCorn p1=new PopCorn();
			System.out.println("Usign NOrmlma Object");
			p1.taste();
			
			
			
			Thread t=new Thread()
					{
				//we can access normal methods herre also  no problem
				
				public void run() {
				AnonymousInnerCls als=new AnonymousInnerCls();
				
				als.m1();
				
					for(int i=0;i<5;i++)
					{
						System.out.println("Child Thread "+i);
					}
				}
				
				
					};
					
					t.start();
					
					for(int i=0;i<5;i++)
					{
						System.out.println("Main Thread "+i);
					}
					
					//in these threads bith the main and chidl threads are executed simultaneousy and we cannot expect teh exact output
			
	
}
	
//parent class referencce can be used to hold child class object but by using that reference we can call only the methods in parent  class

//and we cannot call child class specific methods

//in the anonymous inner classes also we can define the new methods but we cannot call these methods from outside of the class because

//we are depending on the parent reference .these methods are just for iinternal purpose only


//herre just we are creating an object of pop corn class
PopCorn p=new PopCorn();


PopCorn pp=new PopCorn() {
	
	////here we are creating child class forpop corn class and for that child cclass we are assign ing the parent class reference
};
}

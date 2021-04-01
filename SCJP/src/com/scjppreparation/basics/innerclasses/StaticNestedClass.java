package com.scjppreparation.basics.innerclasses;

public class StaticNestedClass {

	//some times we can decalre inner classes with the static modifier such type of inner classes arecalled static nested classes
	
	//in the normal inner classes inner class object always associated with outer class object that is without the existance of the 
	
	//outer class obejct there is no chance of existing inner class object
	
	//but the static nested class obejct isnot associated with the outer class object that iswithout existing the outer class object 
	
	//there may be a chance of existing static nested class
	
	
	static String name="Sai- Gangadhar";
	
	static class Nested
	{
		
		void m1()
		{
			System.out.println("This is static nested class method");
		}
		
		
		//with in the static nested class we can declare static members also that is we can declare the main method als0. henc eit possible
		
		//to im=nvoke the nested class directly with out the existanc e of outer class obejct
		
		
		
		//From teh normla inenr class we can access both instance and static members dorectly but form 
		
		//the static nested class we can access only the static memebrs of outside class directly
		public static void main(String[] args) {
			
			String name="Leaderer";
			//from here I can execute main method from the two classes with the same arguement
			System.out.println(name);
			System.out.println("This is the inner class main method");
		}
	}
	
	public static void main(String[] args) {
		
			Nested nn=new Nested();
			
			nn.m1();
			
			//here is another way
			
			StaticNestedClass.Nested n=new StaticNestedClass.Nested();
			
			n.m1();
			
			String [] s=new String[10];
			n.main(s);
	}
	
	
	
	///Difference between the normal inner class and the Static nested class
	
	//Ic  -- inner class object is always associated with the outer class obejct that is without existing outer class object there is
	
	//no chance of existing the inner class obecjt
	
	//Snc- static nested class is not assocaited with teh outer class object that is without the existance of outer class =pbject we
	
	//can create the nested class obejct
	
	//ic   ---  inside normal classes we cannot declare static members
	
	//snc   ----- inside the static nested classes we can declare static members
	
	//ic--       inside the normal inner classes we cnnot declare main method ang=d hwnce it is not possible to invoke main method directly
	
	//inside static nested classes we can declare the main method and hence we can invoke them directly
	
}

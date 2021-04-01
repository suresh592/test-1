package com.scjppreparation.basics.enumerationenum;

import java.util.Scanner;

public class Basics {
	
	
	//we can use enum to define a group of named coantants
	
	//enum Month{ Jan, Feb, Mar, April }
	
	//enum Lakes{ Ganga, Yamuna, Saraswathi, Tapati  }
	
	//using enum we can define our own data types
	
	//introduced in 1.5//when compared to old languages javas enum is more powerful
	
	
	//Internal Implementation of Enum
	
	////this concept is inetrnally implemented by using classes
	
	//every enum contant is a refernce variable to enum type object
	
	//every enum constant is poublic staic final by default
	
	
	
	
	//enum Month   {  Jan, feb, Mar, April .....}
	
	//class Month
//	{
//		public static final Jan,
//		
//		pupblic static final Feb
//		
//		public staic final Mar
//		\
//	}
	
	
	 
	
	//we can delcare enum with in the class
	
	//if we are decalring enum with in the class the appliacble modifeirs are public, default, strictFp, private protected static
	
	enum Juices
	{
		Banana, Mojito, PineApple, Mango, Orange, WaterMelon;
		
		void mwlody()
		{
			
		}
		
		private static int primenum()
		{
			return 0;
			
		}
	}
	
	
	
	
	//ENum Vs Switch
	
	//until 1.4 the applicable data types for switch are byte short char int
	
	//but form jdk 1.5 in addition to those the wrapper classes Byte, Short, Character, Integer and enum is also considered	

	public static void main(String[] args) {
		
		

		//we can use values() method to list out all the values in an enum


		//with in the enum 	the order of constants is important. we can specify itws order by using the ordinal values
		
		//we can find the ordinal value by using ordinal merthod
		
		//public int ordinal()    ordinal value is Zero based
		
		
		Juices[] j=Juices.values();
		
		for(Juices jj:j)
		{
			System.out.println(jj +"\t"+jj.ordinal());
		}
		
		
		Scanner sc=new Scanner(System.in);
	Juices jj=Juices.Orange;
	//String str=sc.next();
		switch (jj) {
		case Orange:
			System.out.println("This is the Orange");
			break;

		case PineApple:
			
			System.out.println("This isunder the pine Apple");
			break;
		default:
			System.out.println("This is the default case");
			break;
		}
		
	}
	
	//if we are passing as enum type as an arguement to switch statement every case label should be a valid enum constant
	
	//other wise we will get compile time error	
	
	
	
	//Enum vs Inheritance
	
	//every enum in java is the direct child class of Java lang ENum
	
	//as every enum is extending jav alang enum there is no chance of extending every other enum
	
	//as every enum is always final implicitly we cannot create child classes fro enum
	//because of the above reason we can conclude inheritance concepti snot applicable for enum
	
	//but enum an implement any number of interfaces at a time
	

	//Every enum is java is always the direct child class of java.lang.Enum	
	
	//teh power of enum is inheriting from this class only to our enum classes 
	
	//java.langf.enum is an abstract class direct child class of abstract class
	
	//this clas simplements comparable and serializabel interfaces. hence every enum in java by default serializable an dcomparable
	

}


package com.scjppreparation.basics.enumerationenum;

enum Color
{
	
	Blue, Red
	{
		public void info()
		{
			System.out.println("Dangerous Color");
		}
	},Greeen;
	
	
	public void info()
	{
		System.out.println("Universal Color");
	}
}
public class Test {

	
	public static void main(String[] args) {
		
		Color[] c=Color.values();
		
		
		for(Color c1:c)
		{
			c1.info();;
		}
		
	}
	
	
	
	//enum vs Enum  vs Enumeration
	
	
	//enum a key word used to ddefine the a group of named constants
	
	//Enum it is a class present in Java.lang package which acts as a base class for all java enums	
	
	//Enumeration this is an interface present in jaav.util pacjkage which can be used for retrieving objects from collection one by one
}

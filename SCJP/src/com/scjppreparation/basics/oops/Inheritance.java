package com.scjppreparation.basics.oops;


class A
{
	
}

class B
{
	
}

//single level inheritance

//one class extends another class

//class A extends Class B

class Parentt
{
	
}

//hMulti level inheritance

//one class extends another class in a hierarchical manner

//class A extends class B

//class Parent extends class A


class Childd
{
	
	//Hierarchical inheritance
	
	//2 classes extending hte properities of a single class
	
	//class B extends A
	//class Parent extends A
	
	
	
}

//Multiple and cyclic inheritance is not possiblr in Java

//by using the interfaces we can achieve multiple interiance in Java

//class A impements interface A,B

//the advantages is code reusability


class Teacher
{
	String name;
	String designation="Teacher";
	String collegeName="Annamacharya Institute Of Tecnology And Sciences";
}
public class Inheritance extends Teacher {
	
	String mainSubject="Physics";
	
	public static void main(String[] args) {
		
		Inheritance in=new Inheritance();
		
	  in.name="Le@der";
	  
	  System.out.println(in.mainSubject);
	  System.out.println("Techaed By");
	  System.out.println(in.name);
	  System.out.println("Has A Designation Of");
	  System.out.println(in.designation);
	  System.out.println("in College");
	  System.out.println(in.collegeName);
		
		
	}

	
	//inheriting parent class properities into the child class by making a relationship between two classes .
	
	//using extends key word we can make a relationship between two classes
	
	//getting the properities of one object of a class to another object of another class is called Inheritance
	
	
}

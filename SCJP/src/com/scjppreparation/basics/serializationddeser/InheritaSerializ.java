package com.scjppreparation.basics.serializationddeser;

import java.io.Serializable;

class Animal implements Serializable
{
	
	
	
}

class Peacock extends Animal
{
	
	
	
}
public class InheritaSerializ {

	
	public static void main(String[] args) {
		//if the parent class implements serializable then every child class is bydefault serializable
		
		//that is serializable nature is inheriting from parent to child
		
	//	we can serialialize dog object even though dog class does not implement serializable interface explicitly because its parent class
		
		//animal is serializable
	}
	
	
	
	//even though parent class  does not implemenrts serializable 	 and if thecild class is serializable  then we can serialize child class
	
	//obejtc 
	
	//at teh time of serialization jvm ignores th eorigrinal values of instance variable s which are coming from non serializable parent
	
	//and stores teh defualt values
	
	//at teh time of desrialixation jvm checks is any parent class is non serializablel ornot, jvm creates a separate object for every non
	
	//serializable parent and shares its instance varibles to current object
	
	//for this jvm always calls no arguemetn constructor of the non serializavle part
	
	//if the non serializable parent does not have an no arguement constructor  rthen we will gwt run tim exception
	
	
	
	//implemenr a program forthis
}

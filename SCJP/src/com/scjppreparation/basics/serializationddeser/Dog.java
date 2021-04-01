package com.scjppreparation.basics.serializationddeser;

import java.io.Serializable;




public class Dog implements Serializable {

	String name;
	
	String color;
	
	 int age;
	 
	 static String quality;

	
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	 
	 //if we pllace traanscien tlkey word in front of any variabel data type then those variable is not perform any serialization


	 
	

}

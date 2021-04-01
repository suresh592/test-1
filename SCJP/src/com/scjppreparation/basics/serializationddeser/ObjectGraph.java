package com.scjppreparation.basics.serializationddeser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rat implements Serializable
{
	
	Cat c=new Cat();

	@Override
	public String toString() {
		return "Rat [c=" + c + "]";
	}
	
	
	
}

class Cat implements Serializable
{
	
	Bat b=new Bat();

	@Override
	public String toString() {
		return "Cat [b=" + b + "]";
	}
	
	
}

class 	Bat implements Serializable
{
	
	String name="Comes out only at night times";

	@Override
	public String toString() {
		return "Bat [name=" + name + "]";
	}
	
	
}
public class ObjectGraph {

	
	//when ever we are trying to serialize an object the set of all objects which are reachable form that obejct will be serialized automatically 
	
	//this group of objects is called "Object graph"
	
	//in object grapgh every object should be serializable other wise we will ge tnot serializabl exeception
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		
		Rat r=new Rat();
		
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\SerialObject.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(r);
		
		oos.close();
		fos.close();
		
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\SerialObject.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		r=(Rat) ois.readObject();
		
		System.out.println(r);
		
		ois.close();
		fis.close();
		
		//in teh above program when ever we are serializing a bat object automatically cat and rat objects will be serialized 
		
		//because these are part of object grapgh of dog 		  	
		
		//among those three classes if one class is not serializable we will get not serializable excpetion
		
	}   
}

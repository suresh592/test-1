package com.scjppreparation.basics.serializationddeser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serialization {
	
	
	public static void main(String[] args) throws IOException {
		
		
			//the process of writing stat eof an object into a file is called serialization
		
		//but strictly it is a process of vconverting an object fromjava supported form either to file supported form or network supported form
		
		//by using file output stream and object output stream we can achieve serialization
	
	
	FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Serialize.txt");
	
	ObjectOutputStream ois=new ObjectOutputStream(fos);
	
	Dog d=new Dog("Puppu", "Black", 12);
	
	ois.writeObject(d);
	
	
	ois.close();
	
	fos.close();
	
	
	//we can performserialix=zation only for serializable objects
	
	//an object is said to be serializat=ble if teh corresponding classs implements serializable interface
	
	//serializable is a marker interface and does not contain any methods and classes hence it is a marker interface
	
	//if we are trying to serialize a non serializable object we will get run time exception saying not serializable excpetion
	
	
	//transcient 
	
	//at the time of serialization if we dont want to serialize  the value of a particular variable to meet teh security 
	
	//constraint we have to declare those variables with transcient key word
	
	//at the time of serialization jvm ignores the original value of transcient variable and saves the dedfault value
	
	
	
	//transcient vs static
	
	//static variables are not part of the object hence they wont participate in serialization
	
	//due to this declaring the static vairalbe as transcient there is no impact
	
	//transcient vs final
	
	
	//final variables will be participated into serialization directly by their values hence declaring a final variable with transcient 
	
	//is no impact	
	
	
	//if we place final before transcient variable that variables participate in serialization no proble is there
	}
}

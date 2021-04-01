package com.scjppreparation.basics.serializationddeser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	//the process of reading teh state of an object from a file is called deserialization
	
	//but strictly speaking , it is the process of converting an object from either network support stream or file support form int o java
	
	//java support form
	
	//by using the file input stream and object input stream  we can acheive deserialization
	
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		
		
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Serialize.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d=(Dog) ois.readObject();
		
		System.out.println(d);
		
		ois.close();
		fis.close();
		
	}
	
}

package com.scjppreparation.basics.serializationddeser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String userName="Sai Gangadhar";
	
	transient String password="Gang@dhar2205";

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password + "]";
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		
		oos.defaultWriteObject();
		
		
	}
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		
		String wpwd=(String) ois.readObject();
		
		password=wpwd.substring(3);
		
	}
	
	
	
	
}
public class CustomizedSerialization {

	
	//in the default serialization there may be a chance of loss of information befcause of transcient key word
	
	
	//if we palce transcient key word before any variable those objects are not serialized 
	
	//but after deserialization the default values are produced 
	
	//hence during defualt serialization there may be a chance of loss of infromation due to transcient key word
	
	//we cna revcover this loss of infromation using 	customized serialization by using the following two methids
	
	//private void writeObject(oos) throws exception  
	//this method will be executed eautomatically at the time  of serialization it isa call back method
	
	//private void readObject(oos) throws excpetion
	
	//this method will be executed automatically at the time of deserialization it is a call back method
	
	
	//teh above two methods we have to define the class of corresponding serializable class
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Account ac=new Account();
		
		
FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Acc.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(ac);
		
		oos.close();
		fos.close();
		
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Acc.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Account acc=(Account) ois.readObject();
		
		System.out.println(acc);
		
	
		System.out.println(acc.password+"\t"+acc.userName);
		//using this code we will loss some informatink
		
		
		//toover ride that write the writeObject and readObject methods inaccoutn class
		
	}
		
}

package com.scjppreparation.basics.exceptionhandling;

public class Basics {

	//an unwanted unexpected event that disturbs the normal flow of the program and causes teh program to terminate abnormally
	
	//ex : sleeping exception tyre punchered exception  file not found exception
	
	//it is high ly recommended to handl eexceptions
	
	//teh main objective of exception  handling is graceful termination of teh program
	
	//exception handling does not mean repairing an exception . we have to define an alternative way to continue the rest of the
	
	//program normally is called 	"Exception Handling"
	
	//ex if our programmer requirement is toread data froma file locating at londin aand at run time that file is not available 
	
	//to our program , then the program should not terminate abnormally
	
	//we hae to provide a local file to continue the rest of the program normally
	
	//this is nothing biut exception handling
	
	//try  {  read data fron the local file    }
	
	//catch(File Not Found Exception e)   {  use local file and continue the rest of the program normally    }
	
	public static void main(String[] args) {
		
		System.out.println("hello World");
		System.out.println("Jai Exception Handling");
	}
}

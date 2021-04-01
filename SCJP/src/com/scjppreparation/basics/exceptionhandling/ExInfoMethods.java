package com.scjppreparation.basics.exceptionhandling;

public class ExInfoMethods {

	//there are various methods to print excpetion information
	
	//the throwable class defines the following mehthods
	
	//printStackTrace() 
	//this methods print the exception information in following format 
	
	//Name of the exception  : description
	//stack trace
	
	//toString()
	
	//this prints exception information in the foloowinf format
	
	//Name od the excpetion : description\
	
	//getMessage()
	
	//this method prints only the description of the excpetion
	
	public static void main(String[] args) {
		

		System.out.println("State 1");
		
		try
		{
			System.out.println(10/0);
			System.out.println("These does not eexecuted I Thinks");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			System.out.println("TO String");
			System.out.println(e.toString());
			
			
			System.out.println("Get Message Method");
			
			System.out.println(e.getMessage());
		}
	}
	
	
	//The default exception handler defaultly uses printsStackTrace method
}

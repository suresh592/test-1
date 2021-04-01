package com.scjppreparation.basics.exceptionhandling;

public class DefaultExcepHandi {

	//if any exception raised then the method in which it is raissed is responsible to create teh exception object 
	
	//by including the followinginformation
	
	//Name of the exception
	
	//description of the exception
	
	//Stack Trace (Locationn of the exception)
	
	//after creating exception object method hand overs the exception object to jvm
	
	//jvm checks whether the that method contains nay exception handling code or not
	
	//if the method contains nay exception handling code then it will be executed and continue the rest of the program normally
	
	////if it does not contains handling code then jvm terminates that method abnormallyand delets that method from stack
	
	//jvm identifies the caller method and contains any handling code or not, if the caller method does not contain any handling code
	
	//then jvm terminates the caller method abnormally and removes the corresponding entry from stack 
	
	//this process will continue until main() and if the main does not contain any handling code then jvm terminates the main method also 
	
	//abnormally and removes the corresponding enry form teh stack
	
	//just before terminating the program abnormally jvm hand overs the responsibilityof exception handling to the default exception handler
	
	//default exception handler just prints teh exception information to teh console in the following dormat
	
	//Name of the exceptiona and the Stack Trace(Location of the exceptionm)
	
	public static void main(String[] args) {
		
doStuff();
		
	}

	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		
		System.out.println("This method wont be called");
		
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
	}
	
	//here the doMoreStuff() method creates the exception object with Name, Description adn Stack Trace of Exception
	
	//then it hand overs to teh JVM 
	
	//tehn JVM checks that the method has teh corresponding handling code or not
	
	//these method does not have any handling code then jvm termiates the method abnormally and removes the method from stack
	
	//then jvm goes for the caller method doStuff()
	
	//jvm checks that this method have any exception handling code , if it is there it can handle
	
	//other wise jvm terminates this methoid also abnormally and removes its entry from stack
	
	//this provcess continues unitl main method
	
	//the main method also does not contain nay excption handling code then JVM handles that exception object
	
	//to the default  exception handler which prints tjhe excpetion name and stack trace and terminatres the program abnormally
}

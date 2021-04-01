package com.scjppreparation.basics.exceptionhandling;

public class Top10Exceptions {
	
	
	
	//The exxceptions which are raised automatically by the JVM who ever a particular event 0ccurs 	are ccaled JVM exceptions
	
	//The exceptions which are raised explicitly automatically by the programmer or by the API developer is called programmatic exceptions
	
	
	//Array IOUBEX
	
	//Child class of run time excpetion and hence it is unchecked 	
	
	//raised automatically by the JVM, when ever we are trying to access 	array element with out of range
	
	//int[] a=new [5];    osut(a[[100]];
	
	
	
	//NUll Poiunter wexception
	
	//Child class of run time excpetion and hence it is unchecked 	
	
	//raised automatically by the JVM, when ever we are trying to perform any operation on null
	
	//String s=null;    sout(s.length());
	
		
	//stack over flow error
	
    //Child class of error and hence it is unchecked 	
	
	//raised automatically by the JVM, when ever we are tryign to perform recursive method invokation
	
	//  if we call m2 from m1 and m1 from m2
	
	
	//NoClassDefFoundError
	
	//Child class of error and hence it is unchecked 	
	
		//raised automatically by the JVM, when ever jvm unable to find required classes
	
	
	//Class cast exception

	
	//Child class of run time excpetion and hence it is unchecked 	
	
		//raised automatically by the JVM,when ever we are trying to type cast parent to child
	
	//Object oo;     String s=oo;
	
	
	
	//EXception InInitializer Error
	
	//Child class of error and hence it is unchecked 	
	
			//raised automatically by the JVM, if any exception occurs while performing initialization for static variables and sttaic bloxks
	
	//static in ti-=10/0;
	
	//sttaic  {   string s=null;   sout(s.length())
	
	
	
	//Illegal Arguement Excpetion
	
	//Child class of run time excpetion and hence it is unchecked 	
	
			//raised explicitly by the programmer that a method has been invoked by illegal arguemetn
	
	//t.setPriority(200);
	
	
	//NUmnber fromat exception
	
	//Child class of run time excpetion and hence it is unchecked 	
	
	//raised explicitly by the programmer that we are converting the Stirng to numberr type but the String is not properly formatted
	
	//Integer i=Integer.parseInt("Sai");
	
	
	
	//Illegal State Excpetion
	
	//Child class of run time excpetion and hence it is unchecked 	
	
	//raised explicitly by the programmer  to indicate that a method has been invoked at wrong time
	
	//t.start();
	
	//t.stafrt();
	
	//after starting a thread we are not allowed to start the same thread
	
	
	
	//Assertion Error
	
	//this is the child class of error and hence it is unchecked
	
	//raised explicitly by the programmer to indicate that the 	assert statement is false

}

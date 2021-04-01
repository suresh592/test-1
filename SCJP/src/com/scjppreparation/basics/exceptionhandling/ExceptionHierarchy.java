package com.scjppreparation.basics.exceptionhandling;

public class ExceptionHierarchy {

	
	//Throwable acts as teh root class for the entire java excpetion hierarchy
	
	//it has two chld classes  
	
	//Exception adn Error
	
	//Most of the cases exceptions are caused by our programmers and these are recoverable
	
	//most of the cases errors are not caused by our programmers ans these are due to lack of system resources and these are not recoverable
	
	//Checked us unchecked exceptions
	
	////teh exceptions which are checked by the compiler at compile time for the smooth execution of program at teh run time are called c.e
	
	//example  File Not Found
	
	//Ex	cpetions which are not checked by the compiler are called unchecked excpetions
	
	//Ex Arithmetic Excpetion	
	
	//whether exception is checked or unchecked compulsory it should be run time only there is not chance of it to occur at compile time
	
	//Erros, runtime exception and its child classes are come under unchecked excpetions and remaining all are checked exceptions
	
	
	
	//Partially checked vs Fully checked
	
	//A checked exception is said to be fully checked if all of its child classes are checked
	
	//A checked exception is said to be partially checked if some of its child cclasses are unchecked
	
	//in java the only partially checked exceptions are : Exception and Throwable
	
	
	
	                                                   //Throwable--Partially checked
	                                                   
	           //Exception--Partially checked                                                                Unchecked--//Error
	
	//Run Time Exception--Unchecked  Exceptions
	//these r.t.ex. and child classes are also unchecked ex.
	//Arithmetic Excpetion
	//Null Pointer Exception                                                                      //stack over flow error
	//Class Cast Excpetion                                                                        //out of memory error
	//Illegal Arguement Excpetion
	           //Number Format EXcpetion
	//Illegal State Exception
	          //Illegal Thread State Excpetion
	          //Illegal Monitor state exception
	//Index out of bounds excpeiton
	         //Array Index out of Bounds
	         //String undex out of bounds
	
	
	//IO Exception --Fully Checked
	
	    //File Not Found
	    //End of the File
    	//Interrupted Ex
	
	//Servlet Excpetion
	
	//Sql EXcpetion
	
	//Interrupted EXcpetion
	
	
	
	
}

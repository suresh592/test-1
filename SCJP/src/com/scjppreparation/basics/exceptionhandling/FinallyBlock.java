package com.scjppreparation.basics.exceptionhandling;

import java.io.FileNotFoundException;

public class FinallyBlock {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//it is never recommended to define clean up code with in the try block because there is no guarantee for the exccution of
		
		//every statemet in try block
		
		//it is never recommended to define clean up code with in the catch block because it wont be executed of there is no exception
		
		//we required a place to define the clean up code which should be executed always irrespective of whether excpetion raised or not
		
		//and whether handled or not such type of place is nothing but finally block
		
		//hence th emain purpose of finall yblock is to maintain the clean up code which should always be executed
		
//		
//		try {
//			
//			//risky code
//		} catch (Exception e) {
//			//exception handle code	
//		}
//		finally {
//			//clean up code
//		}
		
		
		
		
		

		//Finally vs return
		
		//finally block dominates return statemetn also. henc eif there is any return statement present inside try or 
		//catch block then first dinally willl be executed anf 	then return statemet will be consdered
		
		
		//there is only one way the finally statement wont be executde when ever jv shut downs that is when ever we are using
		
		//system.exit(0)
		
		
		try {
			
			System.out.println("try");
		//	System.exit(0);
			
			//if we place system.exit thenfinally wint be executed
			
			//if weplace system.exit after the error code it wonrt be executed and finally executed
			System.out.println(10/0);
			
			
			return;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Catch");
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Finally");
			
		}
		
		
	  //Difference between final, finally and finalize
		
		//Final
		
		//a modifer applicable for classes, methods and variables
		
		//if a declared is decalred as final then we canot create child classes that is we cannot wxtends that class
		
		///if a method is declared as final then we canot over ride it
		
		
		//if a variable is declared as a contant then reassignment is not possible and hence final variabel is constant
		
		
		//Finally
		
		//it is a block always associated with try catch block to maintain the clean up code which sould be executed always 
		
		//irrespective of whether 	exception raised or not and whether handled or not
		
		//Finalize
		
		////A method which should be always executed by GC before destroyign any object to perform clean up activities
		
		
		//NOte  :
		
		//when compared with finalize it is high ly recommendedd to use finally block to  maintain clean up code because we 
		
		//cannot expect  the behaviour of the garbage collector
	}
}

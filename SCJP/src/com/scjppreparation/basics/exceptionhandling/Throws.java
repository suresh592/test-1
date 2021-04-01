
package com.scjppreparation.basics.exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Throws {

	
	//in our program id htere is nay chance of raising checked exceptioncmpulsory we should handle handle it
	
	//other wise we will gte compile time error saying //unreported exception must be caught or declared to be thrown"
	
	public static void main(String[] args) throws InterruptedException,ArrayIndexOutOfBoundsException {
		
		
		
		
//		File f=new File("SAi.txt");
//		
//		try {
//			FileWriter fr=new FileWriter(f);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//we can handle these kinds of exceptions using tgwo ways
		
			//by using try catch
		
		//by using throws	
		
		
		
		
		//we can use the throws key word to delegeate the responsibility of throws to the caller method
		Thread.sleep(2500);
		
		//hence the main responsibility of the throws key word is delegate responsibility of exception handling to the caller methods
		
		//in case of checked exception
		
		//iin the case of unchedkd excpetions it isnot required to use throws key word
		
		
		
		
		
	doStuff();	
		
	}

	private static void doStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		
		doMoreStuff();
		
	}

	private static void doMoreStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2500);
	}
	
	
	//in teh above program if we remove throws declaration for any one of the program then we will get compile time error
	
	
	
	//we can use throws only for throwable types other wise we will ge tcompile time error
	private void mamm() throws Exception {
		// TODO Auto-generated method stub

		//as this exception is checked we should handle it either by try catch or declared to be thrown
		//throw new Exception();
		
		
		//as error is unchekced it isnot required to handle by try catch or by throws
		throw new Error();
	}
}

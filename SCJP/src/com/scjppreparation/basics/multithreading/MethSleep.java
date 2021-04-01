package com.scjppreparation.basics.multithreading;

public class MethSleep {

	//if a thread dont want to perform any operation for a particular amount of time(Just Pausing)  then we should go for sleep
	
	//public static void sleep(long ms)
	
	//public static void sleep(long ms,int ns) throws interrupteed Exception
	
	//when ever we are using sleep method compulsory we should handle interrupted exception other wise we will get compile time error
	
	//if a thread calls sleep method then those thread enters into the sleeping state then again it enters execution or running 
	
	//state after the time expires or if the sleeping thread got interrupted
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.out.println("Saai Gangadhar");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Kotte Kodandagari");
		
		Thread.sleep(2000);
		System.out.println("Narasannagari Palli");
		
		
	}
}

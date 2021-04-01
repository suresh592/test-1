package com.scjppreparation.basics.exceptionhandling;

public class RunTimStack {

	//for every java program jvm will create a run time stack
	
	//all the method call performed by the thread will be stored in run time stack
	
	//each entry in the satck is called activation record or stack frame
	
	//after comlpleting every method call jvm deletes teh corresponding entry from teh stack
	
	//after completing all method calls just before terminating the thread jvm deletes or destroys the stack
	
	
	public static void main(String[] args) {
		
		//Here first the stack is created and then
		
		//the main thread calls main method from stack
		
		//again the thread calls doStuff() from stack
		
		//again the thread calls doMoreStuff() from stack
		
		//then after executing that method thread removes doMoreStuff() from stack
		
		//afterr doStuff() executes  the thread deletes it from stack
		
		//then after main() execution completes this also deleted by stack
		
		//at last before going to terminate the thread  JVM is going to delete stack
		doStuff();
		
	}

	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("DOnt sleep");
	}
}

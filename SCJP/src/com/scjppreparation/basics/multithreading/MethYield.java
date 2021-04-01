package com.scjppreparation.basics.multithreading;

public class MethYield  implements Runnable{

	

	//there are some methods to prevent thread execution
	
	//yield()
	
	//join()
	
	//sleep()
	
	//   **************   yield()
	
	//this yield method causes to pause the current executing thread for giving chance to remaining waiting threads of same priority
	
	//if there are no waiting threads or all waiting threads have low priority 	then the same thread will continue its execution again
	
	
	//signature
	
	//public static native void yield()
	
	//teh thread which is yielded when it will get chance once again for execution is decided by thread sccheduler and we cannot 
	
	//expect output exactly
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			
			//if we comment the yiled method then two threads can execute simultaneously 
			//if we does not comment the yield emthod the chance of completing main thread is high first because child thread always calls yield method
			
			Thread.yield();
			System.out.println("Child Thread "+i);
		}
	}
	
	public static void main(String[] args) {
		
		MethYield y=new MethYield();
		
		Thread t=new Thread(y);
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread "+i);
		}
		
	}

	
}

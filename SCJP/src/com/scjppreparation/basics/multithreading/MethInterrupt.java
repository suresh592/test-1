package com.scjppreparation.basics.multithreading;

public class MethInterrupt implements Runnable {
	
	//A thread can interrupt another sleeping thread or waiting thread
	
	//the thread class defines the interrupt method
	
	//public void interrupt()
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Lazy Thread "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		
		MethInterrupt mi=new MethInterrupt();
		
		Thread t=new Thread(mi);
		
		t.start();
		
		//here the main thread interruptsteh child thread  by raising the interrupted exception
		 
		t.interrupt();
		System.out.println("End of the main");
		
	}
	
	//we may not see the impact of interrupt call immediately.
	
	//when ever we are calling interrupt method if the target thread is not in sleeping state or in waiting state then there is
	
	
	//noimpact immediately. Interrupt call will wait until target thread entered into sleeping or waiting state. Once target thread entered
	
	//into sleeping or waiting state the interrupt call will impacat the target thread
	
	
	
	//Comparision for yield join sleep
	
	//Y to pass current executing thread  to give chance for the remaining threads of same priority
	
	//j if a thread want to wait until completing some other thread then we should go for join
	
	//s if a thread dont want to perform any operation for a particular amount of time then go for sleep
	
	//Static  
	
	//y is static
	
	//j is non static
	
	//s is static
	
	//Is it Over Loaded
	
	////y is not over loaded
	
	
	////j  we can over load it no problem
	
	//s  we can over load sleep no problem
	
	//Final 
	
	//y is not final
	
	//j is final
	
	//s is not final
	
	//Throws Interrupted Excpetion
	
	// Y  does not throws
		
	//j throws
	
	//sleep throws
	
	//Native Method
	
	// y is native
	
	//j is non native
	
	//s(long ms) is native
	
	//s(long ms, int ns) is non native
	
	
}

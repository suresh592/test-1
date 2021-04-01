package com.scjppreparation.basics.multithreading;

public class MethJoin implements Runnable {

	//if a thread wants to wait until completing another thread  then we should go for join method
	
	//examples 
	
	//Thread 1 Venue Fixing
	
	//Thread 2  Cards Printing
	
	//if the thread t1 executes t2.join() then t1 thread will entered into waiting state until t2 completes
	
	//once t2 completes then t1 will continue its execution
	
	//Thread 3 Cards Distributing
	
	
//		public final void join() throws InterruptedException
//		
//		public final void join(long ms) throws InterruptedException
//		
//		public final void join(long ms, int ns) throws InterruptedException
	
	//join method is over loaded and every join() throws interrupted exception. Hence when ever we are using join() compulsary
	
	//we should handle interruptedException either by try catch or by throws declaration other wise we  will get compile time error
	
	//if we use join method on any thread then  that thread enters into waiting state  and it is blocked for joining
	
	//again these thread enters into running state it the another thread completes or the given time expires or the waiting
	
	//thread got interrupted
	
	
	
	
	
	public static void main(String[] args) {
		
		
		MethJoin mj=new MethJoin();
		
		Thread t=new Thread(mj);
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Anjaneya Thread "+i);
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Rama Thread "+i);
		}
		
	}
}

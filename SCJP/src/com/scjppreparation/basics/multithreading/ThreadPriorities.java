package com.scjppreparation.basics.multithreading;

public class ThreadPriorities implements Runnable {

	//Every thread in jav ahas som epriorities but the eange of priorities is between 1 to 10
	
	//Thread class ddefines the following constants  to defines some standard priorities
	
	//thread.MIN_PRIORITY 1
	
	//Thread.NORM_PRIORITY  5
	
	//Thread.MAX_PRIORITY  10
	
	//Thread scheduler will use these thread priorities while allocating CPU
	
	//the thread which is having the highest priority will get the chance first
	
	//if the two threads will having the same priority then we cannot expect the exact execution order, it depends on the thread scheduler
	
	//default priority
	
	//the default priority only for the main thread is 5.but for all the remaining threads it will be inheriting from 
	
	//the parent i.e.., what ever the priority has the same priority will be inheriting to teh child
	
	//thread class defines the following two methods to get and set the priority of a thread
	
	//public final int getPriority()
	
	//public final void setPriority(int p)
	
	//the allowed values are 1 to 10 other wise we will get Illegal Arguement Exception
	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread "+i);
		}
	}
	
	public static void main(String[] args) {
		
		
		ThreadPriorities tp=new ThreadPriorities();
		
		Thread t=new Thread(tp);
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread "+i);
		}
		
		
	}
}

package com.scjppreparation.basics.multithreading;


class MyThrd extends Thread implements Runnable
{
	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Lazy Thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Normal HTrread");
	}
	
	
}

public class DaemonThreads {

	//thre threads which are running in the background are called Daemon threads
	
	//Garbage Collector
	
	//teh main advantage of daemon threads is to provide support for non daemon threads
	
	//we can check whether the thread isdaemon or not nby using   "isDaemon()" method
	
	
	//public final boolean isDaemon();
	
	//we can change the daemon nature of the thread by using setDaemon() method 
	
	//public final void setDaemon(boolean b)
	
	//we can change the daemon nature of a thread before starting only. if we are trying to change after starting a thread 
	//we will get run time exception saying Illegal Thread State Exception
	
	//main thread is always non daemon and its not possible to change its daemon nature
	
	
	//by default main thread is always non daemon but for alll the remaining threads Daemon nature will be inheriting from parent
	
	//to child
	
	//if the parent is daemon the child will be daemon and the 	if teh parent is non daemon then the child will nen non daemon
	
	//when ever the last non daemon thread terminates all the non daemon threads will be terminated automatically
	
	
	public static void main(String[] args) {
		
		
		MyThrd mt=new MyThrd();
		
		
		//if we are commenting this line then both teh main and child threads are non daemon and hence both will be executed until 
		
		//their completion
		mt.setDaemon(true);
		
		
		//if we ar enot commneitn then above line the main thread is non daemon adn the child thread is daemon. hence hen ever main thread
		
		//terminates automatically teh child thread terminates
		System.out.println(mt.isDaemon());
		
		mt.start();
		System.out.println("End of the Main");
		
		
		
		
		//How ot kill a thread  
		
		//a thread ccan stop or kill another thread by using stop method theen automatically runnning thread will enter into Dead state
		
		//this method is depricatesd and not recommeded to use	 	
		
		//public void stop()
		
		// A thread can suspend another thread  by using suspend() method
		
		//a thread can resume another thread by using resume() method
		
		//but these methods are depricates and not recommeddd to sue  
	}
}

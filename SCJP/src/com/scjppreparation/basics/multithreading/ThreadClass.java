package com.scjppreparation.basics.multithreading;

public class ThreadClass extends Thread {
	
	
	//  ************* Case 1
	  
	//   *************    Thread Scheduler
	
	//when ever multiple threads are waiting to get chance for execution which thread will get chance first is decided by
	
	//thread scheduler whose behavioiur is JVM vendor dependant
	
	//Hence we cannot expect exact execution order and hence exact output
	
	//thread scheduler is the part of JVM . Due to this unpredictable behaviour of thread scheduler we cannot expect the output for
	
	//the above program . There are various possibilities 		
	
	//what ever the situation comes to mnulti threading  the guarantee in behaviour is very less. we can tell possible output
	
	//but not the exact output
	
	
	//         **************  Case 2
	
	//difference between t.start() and t.run()
	
	//in the ccase of t.start() a new thread will be created  and that thread is responsible to execute run()
	
	//but in the case of t.run() no new thread will be created and the run method isjust executes as normal method call
	
	////in the below program if we are replacing t.start() wiht t.run() wecan simply predict the output
	
	
	//        ***************  case 3
	
	//importance of thread class start method
	
	//to start a thread the required mandatory activities like..
	
	//registering a thread with teh thread scheduler ...
	
	//will be automatically performed by the thread class start method
	
	//because of htis facility the programmer is not responsible to perform this activity and he is just responsible to define the 
	
	//job of the thread
	
	//hence thread class start plays the very important role and without executing that method there is no chance of starting a thread
	
	
//	class Thread
//	{
//		Start()
//		{
//			
//			//1.register the thread with the thread scheduler and perform other initialization activities
//			
//			//2.run
//		}
//	}
	
	
	//       *************** Case 4
	
	//if we ar enot over riding run() method	
	
	//if we are not over riding run method then thread class run() will be executed which has empty implementation and hence 
	
	//we cannot get any output
	
//	class MyThread extends Thread
//	{
//		ThreadClass t=new ThreadClass();
//		t.start();
//		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("Main Thread "+i);
//		}
//	}
//	
	//No Output
	
	//it is highly recommended to over ride run method to define our own implementation
	
	
	//   ***********************    case 5
	
	// Over loading of Run()
	
	//over loading of run is possible but 	thread class start will call no arguement run only but the other 
	
	//run method we have to call it explicitly just like a normal method	
	
	
//	public void run()
//	{
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("Child Thread "+i);
//		}
//		
//	}
//	
//	public void run(int i)
//	{
//
//		for(int j=0;j<10;j++)
//		{
//			System.out.println("Over loaded Run Method"+i);
//		}
//		
//	}
	//if we call t.start() then run() method will be called
	
	//case 6  ***********   Over riding of the start method
	
	//if we over ride start then start will be executed just like a normal method call no new thread will be created
	
	//run method does not executed if we over ride the start method
	
	
	//in this case if you want to start the thread tehn call the super.start()
	
	//this will create teh new thread and execute that thread
//	
//	public void start()
//	{
//			super.start();
//		System.out.println("Start is Over ridden");
//			
//	}
//	
	
	//case 7 ********************** Life Cycyle OF a thread
	
	
	//once we create a thread obejct then it is said to be in 	new state or born state
	
	//if we call start method then the thread will entered into teh ready or runnable state	
	
	//if thread scheduler allocates the cpu then it will enter into the running state
	
	//if run method completes then the thread will enter into 	Dead state
	
	//case 8  ***************************
	//after starting a thread we are not allowed to restart the same thread again
	
	//other wose we will get compile time error saying illegalThreadStateException
	
	//Thread t=nrw Thread()
	
	//t.start()
	
	//t.start()
	
	//if we call the same thread again then we will get illegal thread state exception
	
			//with in the run method if we call super.start() we will get the same exception
			
			//its never recommended to over ride the start, n=but it is highly recommended to 0verride the run method
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread "+i);
		}
		
	}
	
//	public void run(int i)
//	{
//
//		for(int j=0;j<10;j++)
//		{
//			System.out.println("Over loaded Run Method"+i);
//		}
//		
//	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Main Thread ");
		
		ThreadClass t=new ThreadClass();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread "+i);
		}
		
		
		//if we call the same thread again then we will get illegal thread state exception
		
		//with in the run method if we call super.start() we will get the same exception
		
		//its never recommended to over ride the start, n=but it is highly recommended to 0verride the run method
		//t.start();
		
	}
	

}

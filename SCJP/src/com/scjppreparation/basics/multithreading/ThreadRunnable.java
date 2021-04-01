package com.scjppreparation.basics.multithreading;

public class ThreadRunnable implements Runnable {

	
	//we can define a thread by implementin runnable interface also
	
	//Runnabl ewinterface present in 	Java.lang package and contains only one method run() in it
	
	
	// ***********8 Case Study        *************
	
	
	//  MyRunnable r =new MyRunnable()
	
	//Thread t1=new Thread()
	
	//Thread t2=new Thread(r)
	
	//t1.start()  A new thread will be created which is responsible for thread class method
	
	//t1.run()   no new thread will be created 	and thread class run() method will be executed just like a normal method
	
	//t2.start() new thread will be created which is responsible for execution of MyRiunnable run() method
	
	//t2.run()   no new thread will be creted and MyRunnable runm() method will be executed just like as a normal method
	
	//r.sstart()    we will get compile time error saying start() is not available in MyRunnable class
	
	//r.run()    no new thread will be created and myRunnable() run will be executed just like a normal method
	
	
	
	//best approach to define a thread
	
	//among the two ways of defining a Thread implements Runnable mechanism is recommended to use
	
	
	//in the first approach our class always extending Thread class and hence there is no chance of extending any other class.
	
	//but in this program approach we can extends some other class also while implementing the runnable interface 
	
	//hence implemments Runnable approach is recommended to use
	
	
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<8;i++)
		{
			System.out.println("Child Thread "+i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadRunnable tr=new ThreadRunnable();
		
		Thread t=new Thread(tr);
		
		t.start();
		for(int i=0;i<8;i++)
		{
			System.out.println("Main Thread " + i);
		}
	}

}

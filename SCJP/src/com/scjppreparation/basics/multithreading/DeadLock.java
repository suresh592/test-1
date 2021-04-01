package com.scjppreparation.basics.multithreading;

class A
{
	
	public synchronized void fun(B b)
	{
		
		System.out.println("Thread 1 starts Fun Method Started in Class A");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread 1 trying to call last method in CLass B");
		
		b.last();
	}
	
	
	public synchronized void last()
	{
		System.out.println("This is the last metojd in Class A");
	}
	
	
}

class B
{

	public synchronized void fun1(A a)
	{
		
		System.out.println("Thread 2 starts Fun1 Method Started in Class B");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread 2 trying to call last method in CLass A");
		
		a.last();
	}
	
	public synchronized void last() {
		// TODO Auto-generated method stub
		System.out.println("This is the last method in B");
	}
	
	
}

public class DeadLock extends Thread{
	
	
	A a=new A();
	
	B b=new B();

	public DeadLock() {
		
		this.start();
		
		a.fun(b); 
		// TODO Auto-generated constructor stub
	}
	
	public void run()
	{
		
		b.fun1(a);
	}
	
	public static void main(String[] args) {
		
		
		new DeadLock();
	}

	//If two thtreads are waiting for each other such type of situation is called dead lock	
	
	//there are no resolution techniques for dead lock but there are some prevention techniques that are possible
	
	//synchronized key word is the only one reason for deadlock hence while using dead lock we have to take very much care
	
	
	//Dead lock vs starvation
	
	//In the case of dead lock 	waiting never ends
	
	//A long waiting of the threads which ends at teh certain point of time called Starvation
	
	//Least priority thread has to wait until completing all the threads but this long waiting should end at certain point oftime
	
	//Hence a long waiting thread which never ends called Dead lock where as the long waiting thread which ends at certain point 
	
	//of time called Staravtion
	
	
}

package com.scjppreparation.basics.multithreading;

public class ThreadConstructors extends Thread {

	
	//Thread class Oncstructord
	
	//Thread t=new Thread()
	
	//Thread t=new Thread(Runnable r)
	
	//Thread t=new Thread(String name)
	
	//Thread t=new Thread(Runnable r, String name)
	
	//Thread t=new Thread(ThreadGroup g, String name)
	
	//Thread t=new Thread(ThreadGroup g, Runnable r)
	
	//Thread t=new Thread(ThreadGroup g, Runnable r, String name)
	
	//Thread t=new Thread(threadgroup g, Runnable r ,String name, long stackSize)
	
	//Durgas waay to implement thread
	public void run()
	{
		System.out.println("Run Method");
	}
	
	public static void main(String[] args) {
		
		ThreadConstructors tr=new ThreadConstructors();
		
		Thread t=new Thread(tr);
		t.start();
		System.out.println("Mian Thread");
		
	}
}

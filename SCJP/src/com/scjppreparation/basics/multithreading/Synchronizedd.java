package com.scjppreparation.basics.multithreading;

class Display
{
	//to differentiate the program with class level and obejtc lock put static here
	
	//if we place static then it is class levle lock
	
	//if we dies not place static then it is objec levle lock
	
	//static
	public  synchronized void wish(String name)
	{
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Good Morning"+"\t"+name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}


class MyThread implements Runnable
{
	
	Display d;
	
	String name;
	
	

	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		d.wish(name);
	}
	
	
}

public class Synchronizedd {

	//the modifier applicable only for methods and blocks and we cannot apply for classes and interfaces adm variables
	
	//if a method or block declared as synchronized then at a time only one thread is allowed
	
	//if a method or block declared as synchronized then at a time only one thread is allowed to execute on that method on the given Object
	
	//teh main advantage of synchronized key word is we can resolve data inconsistency problems
	
	//the main limitation of snchronized key word is it increases the waiting time of threads and effects the
	
	//performance of the sysyem
	
	//hence if there is no specific requirement it is not recommended to  use Synchronized key word
	
	//Every object in java has a unique lock. Synchronization concept internally implemented by using this lock concept.
	
	//when ever we are using synchronization then only lock concept will come into the picture
	
	//if a thread wants to execute any synchronized method on the given object first it has to get the lock of that object
	
	//once a thread got the lock of that object then it allowed to execute any synchronized method
	
	//once the synchronized method completes then automatically the lock will be released
	
	//while a thread executing any synchronized method on teh Object the remaining threds are not allowed to execute any that
	
	//synchronized method on the given object simultaneously
	
	//but the remaining threads are allowed to executed any ni nsynchronized method(lock concept is implemented based in teh lcass
	
	//but not based on teh method
	
	
	//Lock is an object associated with every object
	
	public static void main(String[] args) {
		
		
		Display d1=new Display();
		
		//Display d2=new Display();
		
		MyThread m1=new MyThread(d1, "Dhoni");
		
		MyThread m2=new MyThread(d1, "Ananyaa");
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.start();
		
		t2.start();
		
		//if we does not declare the wish  method as synchronized then we wont get the exact outpur order. Hence irregular output is 
		//generated
		
		
		//if we decalre wish mehtod as synchronized then threads will execute one by one so that we will get the regular output	 
		
		
//		
//Display d1=new Display();
//		
//		//Display d2=d1;
//		
//		MyThread m1=new MyThread(d1, "Dhoni");
//		
//		MyThread m2=new MyThread(d2, "Ananyaa");
		
		
		//in this case even though wish methosd is synchronized then we will get irregular output. because the threads are
		
		//operating on different objects
		
		//when ever multiple threads are operating on the same obejct then only the synchronization plays the role
		
		//if multiple threads are operating on the multiple objects then there is no impact on synchronization
		
		
		
		
	}
}

package com.scjppreparation.basics.multithreading;

public class InterThreadCommu extends Thread {


	//two threads will communicate with each other by using wait, notify, notifyAll methods

	//the thread which requires updation it has to calll wait method

	//the thread which is responsibel to update has to calll notify method

	//these wait notify and notifyAll methods are available in obejct class but not in the thread cclass because threads are required

	//to call these methods on any shared objects

	//if a thread want to call wait, notify adn notifyAll obejct then compoulsory the thread should be the owner of the obejct

	//that is the thread has to get the clok of the object  that is the thread should be in the synchronized area

	//hence we can calll wait notify and notifyAll methods only form synchronized aarea other wise we will get 

	//compile time exception saying IllegalMonitorStateException

	//if a thread calls wait method then it releases the lock immediatelyh and enters into the waiting state

	//that thread releases the lock of the current object but not all the cloks

	//after calling notify and notify All methods the thread releases the lock but may not immediately

	//excepth these methods therre is no other eay that the thread releases the lock


	//public final void wait() throws InterruptedException

	//public final void wait(long ms)   throws InterruptedException

	//	//public final void wait(long ms, int ns)   throws InterruptedException

	//public final native void notify()

	//public final native void notifyAll()


	//if a thread enters into waiting state due to the following reasons :

	//when it calls any of the above wait methods

	//From waiting state it enters into   Waiting State which aquires lock

	//if waiting thread got notification
	//if time expires
	//if waiting thread got interruptde

	//then it enters into the ready/ /runnalble state 

	//when the thread acquires teh lock of the current object


	public static void main(String[] args) throws InterruptedException {

		ThreadB tb =new ThreadB();

		tb.start();

		synchronized (tb) {

			System.out.println("Main thread calling to wait");
			tb.wait(2000);

			System.out.println("Main Thread got Notified");

			System.out.println(tb.total);
		}





	}

}

class ThreadB extends InterThreadCommu
{

	int total =0;
	public void run()
	{
		synchronized (this) {

			System.out.println("Child thread got notified");

			for(int i=0;i<=100;i++)
			{
				total += i;
			}

			System.out.println("This child thread trying to give notification");

			this.notify();

		}
	}
}

package com.scjppreparation.basics.multithreading;

public class SynchronizedBlock {

	
	//if a very few lines of code requires synchronization then it is never reommended to declare that method as 
	
	//synchronized  we have to declare those few lines of code inside synchronized block
	
	//the main advantage of over synchronized block over synchronized method is over it reduces the waiting tie mof
	
	//threads and improves the performance of the system
	
	//we can decalre synchronized block to egt current object lock as follows
	
	//synchronized(this)   { .............   }
	
	//if a thread got lock of current object then onnly it is allowed to execute this bloxk
	
	//to get a lock of particular obejct b we candeclare synchronized block as follows
	
	//synchronized(b)      {      .................    }
	
	//if thread got lock of b then only it is allowed to execute that block
	
	//to get the class level lock we can declare synchronized bloxk as
	
	//  synchronized(Class_Name.class)	{ ................   }
	
	//if a thread got class level lock of class Name  then only it is alowed to execute that block
	
	//synchronized bloxk concept is only allowed for classes and objects but not for primitives other wise we will get the compile time error
	
	//every obejct in java has a unique lock but a thread can acquire more than one lock at a time(of course from differenrt obejcts)
	
	
	
}

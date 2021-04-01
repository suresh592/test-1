package com.scjppreparation.basics.multithreading;

public class ProducerConsumer {
	
	//Consumer ahs to consume items form the queue
	
	//if queue is empty then it has to call wait method
	
	//produver has to produce items into the queue
	
	//after producing the items he has to call the otify method so that all the waiting customers got the notification
	
	
	//we can use notify to notify only one waiting thread 	but which waiting thread got notified we cannot expect exactly.
	
	//all remaining threads ahs to wait for further notification
	
	//but in the case of notifyAll all the waiting threads got notified but the threads will execute one by one

}

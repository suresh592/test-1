package com.scjppreparation.basics.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQue {

	//the data structure used to hold a group of individual obejcts  prior to processing according to some priority

	//this can be default natural sorting order or  customized sorting order

	//if we are depending on default natural sorting order compulsory objects should be homogenious  and comparable other woise

	//we will get class cast exception

	//If we are defining our own customized sorting order then objects need not to be himiogenious and comparable

	//duplicate objects are not allpwed

	//insertion order is not preserved

	//null insertion is not possible even as first element also

	//constructors

	//PriorityQueue p=new PriorityQueue()

	//creates an empty priority queue with default initial capacity  11 and order si default natural sorting order

	//PriorityQueue p=new PriorityQueue(int initialCapacity)

	//PriorityQueue p=new PriorityQueue(int initialCapacity, Comparator C)

	//PriorityQueue p=new PriorityQueue(Collecion c)

	//PriorityQueue p=new PriorityQueue(SOrtedSet s)


	public static void main(String[] args) {


		PriorityQueue q=new PriorityQueue();

		//System.out.println(q.element());

		for(int i=0;i<=10;i++)
		{
			q.offer(i);

		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);


		
		PriorityQueue pp=new PriorityQueue(new MyComparator());
		
		pp.offer("A");

		pp.offer("Z");
		
		pp.offer("K");
		pp.offer("D");
		
		pp.offer("R");
		
		System.out.println(pp);
	}
}
class MyComparator implements Comparator
{
	
	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1=(String) o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}
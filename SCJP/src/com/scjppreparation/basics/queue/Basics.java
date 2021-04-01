package com.scjppreparation.basics.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Basics implements Queue {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//this is thre child inyterface of collection
	
	//if we want to replace a group of individual objects prior to processing  then we shoi=uld go for queue
	
	
	//2 types of Queues
	
	//Priority Queue
	
	//Blocking Queue
	
	   //Priority Blocking Queue
	
	   //Linked Blocking Queue
	
	//usually queue follows FIFO order , based on our requiremetn we can change the order
	
	//from 1.5 version onwards linked list implements queue interface
	
	//linked list based implementation of queue always follows FIFO
	
	//booelan offer(Obejct o) to add an object into teh queue
	
	//Object peek() to return head element of teh queue. if the head is empty then it returns null.
	
	//object element() to return head element of the queue. if queue is empty then we will get run time exception saying 
	
	//NoSuchElementException
	
	//Object poll() to return and remove the head element of the queue. if teh queue is empty then this method returns null.
	
	//Object remove() to remove and return teh head element of the 	Queue. OF the queue is empty then we will get
	
	//run time exception saying NoSuchElementExcpetion
	
	
}

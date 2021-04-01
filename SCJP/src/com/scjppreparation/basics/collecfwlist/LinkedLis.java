package com.scjppreparation.basics.collecfwlist;

import java.util.LinkedList;

public class LinkedLis {

	//the underlying data strructure is doubly linked list
	
	//insertion order isporeserved
	//duplicates are alloweed
	//heterogenious objects are allowed
	//null insertion is possible
	
	//implements serializable and cloneable inetrfaces but not random accesss interfaces
	
	//best suaitable if our operation  is insertion or deletion
	
	//worst choice if out frequent operation is retrieval
	
	//construtors
	
	//LinkedList l=new LinkedList();
	
	//LinkedList l=new LinkedList(Collection C);
	
	//usually we can use linked list to implement stack and queue
	
	//to support this linked list defines the following methods
	
	
	//void addFirst()   addLast()
	
	//void removeFirst()    removeLast()
	
	
	//void getFirst()    getLast()
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add(null);
		l.add("Sai Gangadhar");
		l.add(25);
		l.add(null);
		System.out.println(l);
		l.addFirst("Yeshoidamma");
		l.addLast("Vidya Redyy");
		System.out.println(l);
		l.removeLast();
		
		l.set(2, "Maha Vishnu");
		System.out.println(l.size());
		System.out.println(l);
	}
}

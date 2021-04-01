package com.scjppreparation.basics.collecfwlist;

import java.util.Vector;

public class Vectorr {
	
	//teh underlying data structure is growable or resizabel array
	
	//insertion order is preserved
	//null insertion is possibler
	//duplicates are allowed
	
	//heteroh=geniuos objects are allowed
	
	//implements serializable, cloneable and random access interfaces
	
	//best choice if our frequent operation is retrieval
	
	//worst if out=r frequesn toperation isinsertion in the iddle or deletion
	
	//every method in the vector object is synchronized  hence vector objects are thread safe
	
	//constructors
	
	//Vector v=new Vector();
	
	//rceates an empty vector of initial capacity 10
	
	//once the vector object reaches its maximum mcapacity then new vector object will be created with double ccapcaity
	
	//new capcacity =2*current capacity
	
	//Vector v=new Vector(int intital capcacity);
	
	//Vector v=new Vector(int initialCapacity, in t incrementalCapacity);
	
	//Vector v=new Vector(Colelction C);
	
	//Vector specific methods
	
	//addElement(Object Obj)
	
	//removeElement(object o)
	
	//removeElementAt(int index)
	
	//removeAllElements()
	
	//firstElement()
	
	//lastElement()
	
	//elementAt(int index)	
	
	// Enumeration elements
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		System.out.println(v.capacity());
		
		for(int i=0;i<12;i++)
		{
			v.addElement("Sai "+i);
		}
		
		System.out.println(v);
		System.out.println(v.firstElement());
		
		System.out.println(v.elementAt(10));
		
		v.addElement("Mahabharatham");
		System.out.println(v);
		System.out.println(v.capacity());
	}
	

}

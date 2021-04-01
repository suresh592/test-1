package com.scjppreparation.basics.collecfwlist;

import java.util.Enumeration;
import java.util.Vector;

public class CursorEnumeration {
	
	//if we want to get objects one by one from collection
	//compulsory we we should go for cursors
	
	//Enumeration
	
	//ListIterator
	
	//Iterator
	
	
	//A cursor to retrieve objects one by one from the colelction
	
	//applicable for legacy classes
	
	//we can create enumeration objects by using e;emen
	
	//public Enumeration elements
	
	//Enumeration e=v.elements()
	
	//Enumeration interface defines the following two methods
	
	//public boolean hasMoreElements
	
	//public Object nextElement()

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
		
		
		System.out.println("Iteration using Enumerator");
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
		//Limitations of enumeraiton
		
		//This concept is only applicable for legaacy classes and hence it is not an universal cursor
		
		
		//by using enumeration we can get only the read access
		//but we did not get any remove operations
		
		//to vercome this iterator is used
	}
	
}

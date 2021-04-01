package com.scjppreparation.basics.collecfwlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLis {
	
	//teh underlying data structure for array list is resizable array o rgrowable array
	
	//insertion order is preserrved
	//duplicatesa are nit allowed
	//heterogeniuos objects are allowed 
	//null insertion is possible
	
	
	//constructors
	
//	ArrayList al=new ArrayList();
	
	//creates an empty array list with default initial capacity 10 and once the array list
	//reches it maximum capacity then a new array list object willl be  created with
	
	
	//new capacity  = current capacity + 3/2 *1
	
	
	//ArrayList al=new ArrayList(int initialcapacity)
	//creates an empty array list objec with teh specified initial capacity
	
	
	//ArrayList al=new ArrayList(Collection C)
	
	//creates an equivalent al obkject for given collection objects
	
	//this is for changing between constructor objetcs
	
	public static void main(String[] args) {
		
	
		ArrayList al=new ArrayList();
		
		al.add(null);
		al.add("Sai Gangadahra");
		al.add(10);
		al.add('c');
		al.add(null);
		al.add("Yeshodamma");
        al.add(10);		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		al.add(1, 25);
		al.add("Number");
		
		System.out.println(al.size());
		al.add(null);
		System.out.println(al);
		
		System.out.println();
		
		
		//in everu collection class to String method isover ridden to return its content directly in 
		//teh for mat of  [obj1, obj2, obj3]
		
		//usually we can use collections to store and transfer objects
		
		//every collection class implements serializable and cloneable interface
		
		//ArrayList and vector can implement random access interface so that ay element can be accessed with teh sam espeed
		
		//hence if our frequent operation is retrieving then teh best suaitable operation is ArrayList
		
		//if out frequent operation is insertion or deletion in the middle then array list is hte worsts choice because it 
		//requires several shift operators
		
		
		//Difference betwen al and Vector
		
		//al - no method is synchronized
		
		//v - all methods are synchronized
		
		//al -multiple threads can accesss on array list object at a time. hence it is not thread safe
		
		//v- at any poin tonly one thresad is allowed to access on vector  henc eit is thread safe
		
		
		//threads are not required to wait perfromance is high  --al
		
		//increases waitintg time of thread performance is low  -v
		
		
		//synchronized version of array list
		
		//using collections class synchronizedList method
		
		
		//syntax  public static  list  synchronizedList(list l)
		
		//similar;y. we can get teh synchronized version of set and map using
		
		//public static set synchronizedSet(Set s)
		//public static Map synchronizedMap(map m)
		
		List l1=Collections.synchronizedList(al);
		
		
	}
	

}

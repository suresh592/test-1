package com.scjppreparation.basics.collecfwlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class CursorListIterator {
	
	
	//this is the child interface of iterator
	
	//while iterating obejcts by list iterator we can move either to the forward
	
	//or to the backward direction
	
	//that it is a bidorectional cursor
	
	//while iterating by list iterator we can perform replacement and addition of new objects also in addition to read and remove
	//operations
	
	//we can create list iterator obejct by using listIterator of list interface
	
	//listIterator li=lsitObject.listIterator()
	
	//public boolean hasNext()
	
	//public boolean next()
	
	//public int nextIndex()
	
	//public boolean hasPrevious()
	
	//public boolean previous()
	
	//public int prevviousIndex()
	
	//public void remove()
	
	//public void set(Obejct o)
	
	//public void add(Obejct o)
	public static void main(String[] args) {
		
		
		LinkedList<String > list=new LinkedList<String>();
		
		list.add("Yeshodamma");
		list.add("Vidya Reddy");
		list.add("Leadder");
		list.add("Saai");
		list.addLast("Ranith");
		ListIterator l=list.listIterator();
		
		System.out.println(list);
		while(l.hasNext())
		{
			
			String name=(String) l.next();
			System.out.println(name);
			System.out.println("Name is "+name);
			if(name.equals("Saai"))
			{
				l.remove();
			}
			
		}
		System.out.println(list);
		
	}

}

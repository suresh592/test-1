package com.scjppreparation.basics.collecfwset;

import java.util.TreeSet;



public class NavigablSet {

	//this is the child interface of Sorted Set
	
	//this defines several methods to support for navigation for tree set object
	
	//list of methods are :
	
	//ceiling(e) returns the lowest element which is greater than or equal to e  >=
	
	//higher(e)   returnd tehe lowest element whichis greater that e  >e
	
	//floor(e)  returns the highest element which is less than or equal to e <=e
	
	//lower(e) returns the highest element which is less than e <e
	
	//pollFirst()   returns and removes the   		first elememt
	
	//pollLast() returns adn removes the last element
	
	//descendingSet() returns the navigable set in reverse order
	
	
	public static void main(String[] args) {
		
		
		TreeSet tr=new TreeSet();
		
		tr.add(100);
		
		tr.add(200);
		tr.add(300);
		tr.add(400);
		tr.add(450);
		tr.add(500);
		tr.add(500);
		tr.add(600);
		tr.add(700);
		tr.add(800);
		tr.add(900);
		tr.add(10000);
		
		System.out.println(tr);
		System.out.println("Celiing "+tr.ceiling(600));
		System.out.println(tr.floor(400) + "Floor");
		System.out.println(tr.higher(500)+ "higher");
		System.out.println(tr.lower(900)+ "lower");
		System.out.println("Poll First" +tr.pollFirst());
		System.out.println("Poll Last "+tr.pollLast());
		
		System.out.println(tr.descendingSet() + "Descending Set");
		System.out.println(tr);
		
		
	}
}

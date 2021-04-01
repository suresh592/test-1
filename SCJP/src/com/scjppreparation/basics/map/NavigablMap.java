package com.scjppreparation.basics.map;

import java.util.TreeMap;

public class NavigablMap {
	
	//this is teh child interface off Navigable map to define the several methods for navigation purpose
	
	//teh list of methods present in navigable map
	

	//ceilingKey(e) returns the lowest element which is greater than or equal to e  >=
	
	//higherkey(e)   returnd tehe lowest element whichis greater that e  >e
	
	//floorKey(e)  returns the highest element which is less than or equal to e <=e
	
	//lowerKey(e) returns the highest element which is less than e <e
	
	//pollFirstEntry()   returns and removes the   		first elememt
	
	//pollLastEntry() returns adn removes the last element
	
	//descendingMap() returns the navigable set in reverse order
	
	public static void main(String[] args) {
		
		TreeMap<String, String> tm=new TreeMap<String, String>();
		
		tm.put("b", "banana");
		tm.put("c", "Cat");
		
		tm.put("e", "Elephant");
		tm.put("d", "Dog");
		tm.put("a", "amma");
		tm.put("l", "leader");
		
		System.out.println(tm);
		
		System.out.println(tm.ceilingKey("d")+ " Ceiling key");
		System.out.println(tm.floorKey("l") +" Floor Key");
		System.out.println("Lower "+tm.lowerKey("c"));

		System.out.println("Higher "+tm.higherKey("e"));
		System.out.println("Poll Firsy "+tm.pollFirstEntry());
		
		System.out.println("Poll Last "+tm.pollLastEntry());
		
		System.out.println(tm.descendingMap());
	}

}

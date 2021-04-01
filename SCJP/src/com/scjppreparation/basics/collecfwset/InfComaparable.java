package com.scjppreparation.basics.collecfwset;

import java.util.TreeSet;

public class InfComaparable {

	
	//this interface present in Java.lang package and contains only one methods  comapreTo()
	
	//public int xompareTo(Object obj1)
	
	//obj1.compareTo(obj2)
	
	//returns -ve if the object has come before obj2
	
	//returns +ve if the object has to come after object 2
	
	//returns 0 if the object 1 and object 2 are equal
	
	public static void main(String[] args) {
		
		
		System.out.println("A".compareTo("Z"));
		
		System.out.println("D".compareTo("A"));
		
		System.out.println("C".compareTo("C"));
		
		
		
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("S");
		
		t.add("A");   //s.compareTo(A)     returns +ve
		
		t.add("M");   //A.compareTo(M)     returns -ve
		
		t.add("J");   //J.compareTo(M)     returns -ve
		
		t.add("V");   //M.compareTo(V)      returns -ve
		
		t.add("S");   //S.compareTo("S)      returns 0
		
		
		//if we are not satisfied with the natural sorting order
		
		//or teh default sorting order is aleady available then we can define our own sorting order using comparator interface
		
		//comparable meant for natural sorting order
		
		//comparator meant for customized sorting order
		
		
	}
	
	
	//then we are depending on natural sorting order inetrnally JVM calls compareTo() method
	
	//based on the return type JVm identifies the location of the element in the sorting order
	
	
	//obj1.comapreTo(obj2);
	
	//Here Obj2 is already existing object in TreeSet
	
	//obj1 is which object we are trying to add
	
	
	//returns -ve iff obj1 has to come before object2
	
	//returns + ve if obj1 has to come after object 2
	
	//returns 0 if object1 and object2 are equal
}

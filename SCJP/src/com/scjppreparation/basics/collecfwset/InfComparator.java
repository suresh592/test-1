package com.scjppreparation.basics.collecfwset;

import java.util.Comparator;
import java.util.TreeSet;

public class InfComparator {

	////thisis present inside the java.util package adn 	defines the follwoing two methods
	
	//public int compare(Object o1, Object oo2)
	
	//returns -ve if obj1 has to come before object 2
	
	//returns +ve if obj1 has to come after obj2
	
	//returns 0 if both are equal
	
	//obj1 the object we are trying to add
	
	//obj2 already existing obejct
	
	//public boolean equals
	
	//when ever we are providing implementation for comparator interface compulsory we should provide implementation for 
	
	//compare() second method equals() implementation is optional because it is already available for our class from 
	//object class through interface
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(20);
	
		t.add(0);             //compare(0,20)    +ve
		
		
		t.add(15);           //compare(15,0)   -ve
		
		t.add(5);             //compare(5,15)    -ve
		
		
		t.add(10);            //compare(10,5)      -ve
		
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
	
		
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
//		if(i1<i2)
//		{
//			return  +100;
//		}
//		else if(i1>i2)
//		{
//				return -1000;
//		}
//		else
//		{
//			return 0;
//		//((i1>i2)?+1:((i2>i1)?-1:0));
//		}
		
		
		//If we are not passing comparator object at line 1 then internally jvm takes compareTo method
		
		//which is meant fro default nati=ural sorting order
		
		
		//Other implemenatations of ocmpare to are:
		
		//
	
	
	
	//return i1.compareTo(i2);  //Ascending order
	
	//return i2.compareTo(i1);   //descending order
		
		return -i1.compareTo(i2);   //descending order
	}
	
}

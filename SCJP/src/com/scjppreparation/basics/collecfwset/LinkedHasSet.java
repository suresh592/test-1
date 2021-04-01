package com.scjppreparation.basics.collecfwset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet {

	//It is the child class of Hash Set
	
	//this is exactlhy same as 	Hash Set exactly same as teh following differences
	
	
	//the underlying data structure is combination of Hash table and Linked List
	
	//Insertion Order is preserved
	
	//the important application sof Li ked Hash Set and Linked HashMap is implementing  cache applications 
	
	//whereas duplicates are not alloweed and insertion order is not preserved.
	
	public static void main(String[] args) {
		
		
		
LinkedHashSet hs=new LinkedHashSet();
		
		hs.add("Yeshoda");
		
		hs.add("Leader");
		
		hs.add("Saai");
		
		hs.add(null);
		
		hs.add("Yeshoda");
		
		hs.add("Sethupati");
		
		hs.add(null);
		
		System.out.println(hs.add("Shree Vatsav"));     //result is true
		
		Iterator it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

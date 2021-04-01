package com.scjppreparation.basics.collecfwset;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
	
	//the underlying data structure is Hash Table
	
	//duplicates are not allowed
	
	//if we are trying toadd duplicates then we wont get  nay compile time error
	
	//insertion order is not preserved and all the objetcs are inserted according to the hash code of the objects
	
	//heterogenious objects are allowed
	
	//null insertion is possible only once because duplicates are not allowed	
	
	//constructor
	
	//HashSet h=new HashSet();
	
	//creates an empty hash set with default initial capacity 16 and default fill ration 0.75 percent
	
	//HashSet hh=new HashSet(int initialCapacity)
	
	//creates an empty hash set with teh specified initial capacity and the default fill ratio 0.75 percent
	
	//hashSet h=new HashSet(int initialCapacity, float fillRation)
	
	//HashSet h=new HashSet(Collection C)
	
	
	//Fill Ratio
	
	//after completing the specified ration tehn only a new hash set object will be created that particular
	//ratio is called FILL RATIO  or load factor
	
	//teh default fill ration is 0.75 oercent but we can customize this value
	
	public static void main(String[] args) {
		
		
		
		HashSet hs=new HashSet();
		
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

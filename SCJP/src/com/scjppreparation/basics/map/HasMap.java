package com.scjppreparation.basics.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMap {
	
	
	//the underfrlying data structure is Hash table
	
	//heterogenious objects are allowed for both keys and values
	
	//duplicat3e keys are not allowed but duplicate values area allowed
	
	//insertion order is not preserved because it is based on  hash codeof Keys
	
	//null key is allowed only once
	
	//null values are zllowed any number of times
	
	
	//Differences between HashMap hm and Hashtable ht
	
	//hm  no method is synchronized
	
	//ht every method is synchronized
	
	//hm multiple threads can operate simultaneously hence mh is not thread safe
	
	//ht  multiple threads cannot operate on teh same thread simultaneously hence ht is thread safe
	
	//hm threads are not required to wait and hence relatively performance i shigh
	
	//ht  it increases the waiting time of the threads hence performance ios relatively low
	
	//null is allowed fro  both key and value
	
	//null is not allowed for both key and value hence if we use null hten we will get null pointer exception
	
	
	//How to get the synchronized version of the Hash map
	
	//using Collections.synchronizedMap(HashMap);	
	
	//constructors
	
	
	//HashMap hm=new HashMap()
	
	//creates an empty hash map with intial capacity 16 and default fill ratio 0.75
	
	//HashMap hm=new HashMap(int initial capacity)
	
	//HashMap hm=new HashMap(int initialCapcity, float fill ratio)
	
	//HashMap hm=new HashMap(Map m)
	
	
	

	public static void main(String[] args) {
		
	
		HashMap hm=new HashMap();
		
		hm.put("Saai", "571");
		hm.put("5A0", "Leader");
		hm.put("Amma", "0000");
		
		hm.put(567, "Ranith");
		
		System.out.println(hm.put("Saai", "15701A0571"));
		
		System.out.println(hm);
		hm.put(null, "Null Value");
		System.out.println(hm);
		
		System.out.println(hm.put(567, "Ranith Raju"));
		System.out.println(hm);
		
		Set s=hm.keySet();
		
		System.out.println(s);
		
		Collection c=hm.values();
		System.out.println(c);
		
		Set s1=hm.entrySet();
		
		Iterator it=s1.iterator();
		
		while(it.hasNext())
		{
			Map.Entry m1=(Entry) it.next();
			
			System.out.println(m1.getKey()+"\t"+m1.getValue());
			
			//here we are getting null pointer exception if we insert null into the hash map
//			if(m1.getKey().equals("Amma"))
//				m1.setValue("Yeshodamma");
			
			
		}
		System.out.println(hm);
	}
}

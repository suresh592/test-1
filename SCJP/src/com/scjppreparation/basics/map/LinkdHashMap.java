package com.scjppreparation.basics.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkdHashMap {

	//This is hte child class Of HashMap
	
		//It is exactly same as Hash Map except the following differences
	
	//hm the underlying data structure is Hash table
	
	//lhm the underlying data structure is hash table  + linked list	
	
	//hm insertion order is not preserved
	
	//lhm 	insertion order is preserved
	
	
	
	public static void main(String[] args) {

		
		//The main applications of LinkedHashMap and the LinkedHashSet are cashe applications where duplication is not allowed and 

		//insertion order is preserved
	
LinkedHashMap hm=new LinkedHashMap();
		
		hm.put("Saai", "571");
		hm.put("5A0", "Leader");
		hm.put("Amma", "0000");
		hm.put("Saai", "15701A0571");
		
		System.out.println(hm.put("Saai", "15701A0571"));
		hm.put(567, "Ranith");
		
		System.out.println(hm);
		hm.put(null, "Null Value");
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
			
			////here we are getting null pointer exception if we insert null into the hash map
//			if(m1.getKey().equals("5A0"))
//				m1.setValue("Yeshodamma");
			
			
		}
		System.out.println(hm);
	}
	}


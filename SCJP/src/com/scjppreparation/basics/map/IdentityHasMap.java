package com.scjppreparation.basics.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHasMap {
	
	//this is exactly same as the hashMap except teh following differences
	
		//in the case of Hash Map to identify duplicate keys JVM always uses .equals() which is mostly meant for comparision\
	
	//if we want to use == operator instead of .equals to identify duplicate keys we have to use identity hash Ma[p

	
	public static void main(String[] args) {
		
		
		
		HashMap hm=new HashMap();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		hm.put(i1, "Amma");
		hm.put(i2, "Ranganadham");
		
		System.out.println(hm);
		System.out.println("References "+i1.hashCode()+"\t"+i2.hashCode());
		
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(i1, "Sai Gangadhar");
		ihm.put(i2, "Leader");
		System.out.println(ihm);
	}
}

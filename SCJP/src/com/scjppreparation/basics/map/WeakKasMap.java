package com.scjppreparation.basics.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakKasMap {

	//it is exactly same as the hash map exccept the following dofferences
	
	//in the case of Hash map the object is not eligible for gc even though it does not have any external references
	
	//if it associated with hash map that is hash map dominates garbage collector
	
	//but in the case of weak hash map even though obejct is associated with the weak hash map, it is eligible for gc
	
	//it does not have any external references, that is garbage collector dominates weask hash map
	
	public static void main(String[] args) {
		
		
		
		HashMap hs=new HashMap();
		
hs.put(new Temp(5), "A");
		
		hs.put(new Temp(2), "b");
		hs.put(new Temp(6), "c");
		hs.put(new Temp(15), "d");
		hs.put(new Temp(23), "e");
		hs.put(new Temp(16), "f");
		hs.put(new Temp(9), "g");
		hs.put(new Temp(7), "h");
		
		System.out.println(hs);
		
		hs=null;
		
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(hs);
		
		
		WeakHashMap whs=new WeakHashMap();
		
whs.put(new Temp(5), "A");
		
		whs.put(new Temp(2), "b");
		whs.put(new Temp(6), "c");
		whs.put(new Temp(15), "d");
		whs.put(new Temp(23), "e");
		whs.put(new Temp(16), "f");
		whs.put(new Temp(9), "g");
		whs.put(new Temp(7), "h");
		
		System.out.println(whs);
		
		whs=null;
		System.gc();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(whs);
		
		
	}
}

package com.scjppreparation.basics.collectionsarrays;

import java.util.Arrays;

public class ArraysSearch {
	
	////teh arrays class defines the dollowing search methods for  searching the array elements
	
	//public static int binarySearch(Priomitive [] p, orimitive key);
	
	//public static int binarySearch(Object[] o,Object key)
	
//	/public static int binarySearch(Obejct[] o, Object key , COmparator c)
	
	//all the rules of the binary search are exactly same as the Collections class binary searcch
	
	public static void main(String[] args) {
		
		

		int[] a= {12,6,017,9,161,205,144};
		
		
		Arrays.sort(a);
		
		System.out.println(Arrays.binarySearch(a, 017)+"The Index of the searched element is");
	
String[] s= {"Sai","HImanush","Harika And hjassine","Dev","Root","Vishnu","Cheri"};
		
	
		Arrays.sort(s);
		
		System.out.println("Index of Obejct search Sarrays is "+Arrays.binarySearch(s, "Root"));
		
		
		Arrays.sort(s,new MyComparator());
		
		System.out.println("INdex using comparator search is "+Arrays.binarySearch(s, "Root", new MyComparator()));
		
	}

}

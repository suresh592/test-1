package com.scjppreparation.basics.collectionsarrays;

import java.util.Arrays;

public class ArraysCollections {

	//this is an utility class present in collections package, to define several utility methods for Ararys for both 
	
	//primitive type arrays and object types
	
	//methods are  :
	
	//	public static void sort(primitivi[] p)	  to sort elements of primitive array according to some sorting order
	
	//public static void sort(obejct[] o)  to sort elements of obejct array according to some sorting order
	
	//in this case sompulsory the elements should be homogenious and comparable.\
	
	//other wise we will get class cast exception
	
	//public static void sort(Obejct [] a, comparator c)
	
	//to sort elements of Object[] according to customised sorting order
	
	//Primitive arrays can be only sorted by using the natural sorting order  where as object arrays can be sorted by using either 
	//natural sorting order or customized sorting order
	public static void main(String[] args) {
		
		
		int[] a= {12,6,017,9,161,205,144};
		
		System.out.println("Elements in teh array before Sorting are :");
		
		for(int a1:a) {
			System.out.println(a1);
		}
		
		Arrays.sort(a);
		System.out.println("Array Elements after sorting are");
		
		for(int a1:a) {
			System.out.println(a1);
		}
		
		
		System.out.println("Belongs to Object array");
		
		String[] s= {"Sai","HImanush","Harika And hjassine","Dev","Root","Vishnu","Cheri"};
		
		System.out.println("Elements in te=he array before sorting");
		for(String ss:s)
		{
			System.out.println(ss);
		}
	
		Arrays.sort(s);
		System.out.println("Elememts in the array after Obejct sorting are :");
	
		for(String a1:s) {
			System.out.println(a1);
		}
		
		
		System.out.println("Obejct array elements after sorting using comparator are :");
		Arrays.sort(s,new MyComparator());
		for(String a1:s) {
			System.out.println(a1);
		}
	}
	
}

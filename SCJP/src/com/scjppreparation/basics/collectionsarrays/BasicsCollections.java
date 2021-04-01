package com.scjppreparation.basics.collectionsarrays;

import java.util.ArrayList;
import java.util.Collections;

public class BasicsCollections {

	
	//this is an utility class present in Java.lang package
	
	//this ddefines several utility methods for collection implemented class Objects
	
	//  *********     Sorting the elements of a list               ***************
	
	//public static void sort(List l)
	
	//we can use this method to sort according to some natural sorting order
	
	//in this case elements should be homogenious and comparable other wise we will get class cast exception
	
	//list should not contain null other wise we will get class cast exception
	
	//public static void sort(List l, Comparator C)
	
	//to sort elements of a list according to customized sorting order
	
	//Searching the elements of a List	
	
	//Collections class defines the following method to search the elements of the list
	
	//public static int binarySearch(List l,Object obj)	
	
	//if the list sorted acording to some natural sorting orderthen we have to use this method
	
	//public static int binarySearch(List l,Object key,Comparator c)
	
	//if the list is sorted according to comparator then we have to use this method
	
	//Colelctions class defines the following reverse method for this
	
	//Public static void reverse(List l)
	
	//Conclusion
	
	//internally binary search uses binnary search algorithm.
	
	//before calling n=binary search() method compulsory the list should be sorted other wise we will get unpredicted results
	
	//successful search returns index
	
	//unsuccessful search retunrns insertion point
	
	//insertion point is hte location where we can place the element in the list
	
	//if thelist is sorted according to comparator  then at the time of search also we should pass the same comparator
	
	//other wise we will get unpredictable results
	
	
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Sai");
		
		al.add("Gangadhar");
		
		al.add("Subham");
		
		al.add("Sangharsanalu");
		
		al.add("Leader");
		
		al.add("Muncipality");
		
		System.out.println(al);
		
		//sort  natural sorting order
		Collections.sort(al);
		System.out.println(al);
		
		
		//reverse teh list
		
		Collections.reverse(al);
		System.out.println(al);
		
		//use the binary search
		System.out.println(Collections.binarySearch(al, "Leader"));
		
		
		
		
	}
	
	
	//reverse() vs reverseOrder()
	
	//we can use the reverse emthod to reverse the elements of a list and this method contains List arguement
	
	//Colelctions class defines reverseOrder() mwethod also to return the comparator obejct for reversing original sorting order
	
	//Comparator c1=Colletions.reverseOrder(Comparator C)
	
	//c1 for descending order              c fro ascending order
	
	//reverseOrder() method contains 	comparator arguement where as reverse contains List arguement
}

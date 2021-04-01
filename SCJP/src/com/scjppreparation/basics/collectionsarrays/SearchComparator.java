package com.scjppreparation.basics.collectionsarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
public class SearchComparator {
	
	public static void main(String[] args) {
		
ArrayList al=new ArrayList();
		
		al.add("Sai");
		
		al.add("Gangadhar");
		
		al.add("Subham");
		
		al.add("Sangharsanalu");
		
		al.add("Leader");
		
		al.add("Muncipality");
		
		System.out.println(al);
		
		Collections.sort(al,new MyComparator());
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, "Leader",new MyComparator()));
	}
	
	
	//for the list contains n elements the range of successful search
	
	//range of successful search  :  o to n-1
	
	//range of unsuccessful search   :   -(n+1) to -1
	
	//total range  :  -(n+1) to n-1

}

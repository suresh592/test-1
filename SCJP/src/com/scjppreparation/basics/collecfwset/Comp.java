package com.scjppreparation.basics.collecfwset;

import java.util.Comparator;

public class Comp implements Comparator {

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		
//		String s1=(String) o1;
//		String s2=o2.toString();
//		return -s1.compareTo(s2);
//	}
//	
	//the above considers to first names in the String

	
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1=(String) o1;
		String s2=o2.toString();
	
		
		int l1=s1.length();
		
		int l2=s2.length();
		
		if(l1<l2)
		{
			return -1;
		}
		else if(l1>l2)
		{
			return 1;
			
		}
		else
		{
			return s1.compareTo(s2);
		}
	}
	
	//the above one comes to the tr tree set in the list
	
	
	

}

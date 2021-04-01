package com.scjppreparation.basics.collecfwset;

import java.util.Comparator;
import java.util.TreeSet;

class Com implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
	
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
	
}

public class InfStringBuff {

	
	public static void main(String[] args) {
		
		
		//with respect to insert string bug=ffer objects into teh treeset  where teh sorting order is the alphabetocal order
		
		TreeSet< StringBuffer> sb=new TreeSet<StringBuffer>(new Com());
		
		sb.add(new StringBuffer("A"));
		
		sb.add(new StringBuffer("M"));
		sb.add(new StringBuffer("D"));
		
		sb.add(new StringBuffer("a"));
		System.out.println(sb);
		
		
	}
}

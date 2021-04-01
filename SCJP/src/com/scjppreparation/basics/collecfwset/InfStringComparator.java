package com.scjppreparation.basics.collecfwset;

import java.util.TreeSet;

public class InfStringComparator {

	public static void main(String[] args) {
		
		
		//with respect ot Strings
		TreeSet< String> names=new TreeSet<String>(new Comp());
		
		
		names.add("Sai");
		names.add("Amma");
		names.add("Thammudu");
		names.add("Leader");
		names.add("HimayathNagar");
		names.add("Surya Peta");
		
		System.out.println(names);
		
		
		
		
		//with respect to teh string and string buffer objects in to the tree set where the sorting order increases lenght order
		
		//if the two objects having the same lenght then consider their alphabetical order
		
		
		
		TreeSet tr=new TreeSet(new Comp());

		
	}
}

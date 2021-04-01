package com.scjppreparation.basics.collecfwset;

import java.util.TreeSet;

public class TreeSett {
	
	//teh underlying data structure isbalanced tree
	
	//duplicates are not allowed
	
	//insertion order is not preserved because objects will inserted according to some sorting order
	
	//Heterogenious objects are not allowed because
	//we will getteh class cast exception
	
	
	//Treeset tr=new TreeSet()
	
	//creates an empty tree set Object where the sorting order is default natural sorting order
	
	//TreeSet tr=new TreeSet(Comparator c)
	
	//creates an empty tree set object where the sorting order is customised sorting order specified by comparator obejct
	
	//treeset t=new treeset(Collection c)
	
	//TreeSet t=new TreeSet(SortedSet s)
	
	public static void main(String[] args) {
		
		
		TreeSet tr=new TreeSet();
		
		//if we are depending on teh natural sorting order compulsory objects should be homogenious and comparable other wise
		
		//we will get class cast exception
		
		//An obejct is said to be comparable if the comparable class implements Comparable interface
		
		//String cclass and all wrapper classes already implements comparabel interface
		
		//where as String Buffer does not implemment comparable interface
		
		tr.add(105);
		tr.add(115);
		tr.add(125);
		
		tr.add(135);
		tr.add(145);
		tr.add(155);
		tr.add(165);
		
		//if you are trying to add null then wyou willget null pointer exceptionn
		//tr.add(null);    NUll Pointer Exception
		
		
		System.out.println(tr);
		System.out.println(tr.first());
		
		
		System.out.println(tr.last());
		System.out.println(tr.headSet(135));
		System.out.println(tr.tailSet(145));
		System.out.println(tr.subSet(105	, 155));
		System.out.println(tr.comparator());
		
		tr.add(234);

		
		//For th eempty tree set if we are trying to add null then it is always possible
		
		//afterr that if we adda ny e;lement then we will get exception
		
		//for the non empty tree set if we will add then it will generates null pointer excpetion

		TreeSet trr=new TreeSet();
		tr.add(null);
		System.out.println(trr);
		
		
	}
	
	

}

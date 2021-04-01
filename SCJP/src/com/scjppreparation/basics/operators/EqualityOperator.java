package com.scjppreparation.basics.operators;

public class EqualityOperator {
	public static void main(String[] args) {
		
		// == !=
		//we can apply these operators to every primitive type including boolean
		
		System.out.println(true==false);
		//we can apply this for object rerference also 
		//but this operator checks for teh reference on;ly but not foir teh Object content
		
		
		//to apply equality operators between object references  ompulsory there should be the relatioship between tehm
		//that is parent to child or Child to parent or of same type	
		
		String s=new String();
		Object oo=new Object();
		
		System.out.println(s==oo);
		System.out.println(null==null);
		
		//for any object reference 
		//if we compare it with null then it is always false
		System.out.println(s==null);
	}

}

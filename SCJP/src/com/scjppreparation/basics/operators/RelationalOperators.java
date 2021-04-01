package com.scjppreparation.basics.operators;

public class RelationalOperators {
	public static void main(String[] args) {
		
		//> < >= <=
		
		//we can apply relational operators to every primitive data type except boolean
		//we cannot apply relational operators for Object data types
		
		//nesting of relational operators are also n ot allowed
		
		//we willl get compiler error
		//System.out.println(10<20<30);
		//System.out.println(true>false);
		System.out.println(true);
		System.out.println(2);System.out.println(56.8);
		System.out.println();
		
		
		String s=new String("Sai");
		String ss=new String("Sai");
		
		System.out.println(s==ss);//check s for reference
		
		System.out.println(s.equals(ss));//checks for content
	}

}

package com.scjppreparation.basics.wrappers;

public class MethToString {

	//we can use toString to convert Wrapper or primitive to String
	
	//form 1
	
	//every wrapper class contains the following toString() method to convert wrapper object to String Type
	
	//public String toString();
	
	//This is the over riding version of object class toString() method
	
	
	public static void main(String[] args) {
		
		
		Integer i=new Integer(100);
		
		
		System.out.println(i.toString());
		
		Character character=new Character('v');
		
		System.out.println(character.toString());
		
		Boolean b=new Boolean("True");
		
		System.out.println(b.toString());
		
		
		
		//form 2
		
		//every wrapper class contains a static toString() method to convert primitive to string from
		
		String s=Integer.toString(1234560);
		
		String ss=Boolean.toString(false);
		
		System.out.println(s + "\t"+ss);
		
		
		//form 3 
		
		//integer and long classes contains toString() to convert primitive to specified radix from String
		
		
		//public static String toString(primitive p, int radix)
		
		
		String sss=Integer.toString(15,2);
		System.out.println(sss);
		
		//from 4
		
		
		//integer and long classes contains the following toXXXStrings() 
		
		//public static String toBinaryString(primitive p)
		
		//public staticc String toOctalString(primitive p)
		
		//public static String toHexString(primitive p)
		
		
		
		String hex=Integer.toHexString(12345);
		
		String octal=Integer.toOctalString(45678);
		
		String binary=Integer.toBinaryString(4662);
		
		System.out.println(hex+"\t"+octal+"\t"+binary);
		
		
	}
}

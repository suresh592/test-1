package com.scjppreparation.basics.stringnsbuffer;

public class StringConstructors {
	

	
	
	public static void main(String[] args) {
		

//		String s=new String();
//		
//		String s=new String(String constant);
//		
//		String s=new String(StringBuffer buffer);
//		
//		String s=new String(char[] ch);
		
	//	String s=new String(byte[] ch);
		
		char[] ch= {'a','e','i','o','u'};
		
		String s=new String(ch);
		System.out.println(s);
		
		
		byte[]  bb= {101,102,103,103,104,105,106,107,108,109};
		
		String sb=new String(bb);
		System.out.println(sb);
		
	}

}

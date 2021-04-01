package com.scjppreparation.basics.stringnsbuffer;

public class StringEqquals {
	
	
	public static void main(String[] args) {
		
		
		String s=new String("You cant change me");
		
		String ss=new String("You cant change me");
		
		System.out.println(s==ss);
		
		String s1="You cant change me";
		
		String ss1="You cant change me";
		
		System.out.println(s1==ss1);
		
		System.out.println( " S and S1" +  s==s1);
		
		System.out.println(" s and ss1 " +s==ss1);
		
		
		String s2="You cant "+"change me";
		
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		
		String s3="You cant ";
		
		String s4=s3+"change me";
		
		System.out.println(s1==s4);
		
		
		final String s6="You cant ";
		
		String s7=s6+"change me";
		
		System.out.println(s1==s7);
		
		
		
		
	}

}

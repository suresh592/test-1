package com.scjppreparation.basics.regularexpressions;

import java.util.StringTokenizer;

public class StringTokenize {

	//the class used to divide teh target strign into  streasms of tokens according to teh given regular expression
	
	//here the default regular expression is space
	
	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("Mahidhar Kotte Kodandagari");
		
		while(st.hasMoreTokens())
			
		{
			
			System.out.println(st.nextToken());
		}
		
		
StringTokenizer sst=new StringTokenizer("5,6,47,8921,455",",");
		
		while(sst.hasMoreTokens())
			
		{
			
			System.out.println(sst.nextToken());
		}

		
		//we can use any element teh String no problem occurs as an regular expression
StringTokenizer ss=new StringTokenizer("123#456#789$35443","#");
		
		while(ss.hasMoreTokens())
			
		{
			
			System.out.println(ss.nextToken());
		}
		
		
		
StringTokenizer a=new StringTokenizer("abcdaerfghamnop","a");
		
		while(a.hasMoreTokens())
			
		{
			
			System.out.println(a.nextToken());
		}


		
		//we can use Enumeration herre noproblema rises here
//		while(st.hasMoreElements())
//		{
//			
//			System.out.println(st.nextElement());
//		}
	
		
	}
	
}

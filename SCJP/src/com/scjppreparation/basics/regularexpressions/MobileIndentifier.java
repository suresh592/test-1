package com.scjppreparation.basics.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileIndentifier {
	public static void main(String[] args) {
		
		
		
Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		String ss=s.next();
		
		Pattern p=Pattern.compile("[6-9]\\d{9}");
		
		//any thing is valid
		Pattern pp=Pattern.compile("[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		while(ss!=null)
		{
			Matcher m=p.matcher(ss);
			
			if(m.find()&&m.group().equals(ss))
			{
				System.out.println("Valid Identifier ");
			}
			else
			{
				System.out.println("Invalid Identifier");
			}
			
		}
	}

}

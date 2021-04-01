package com.scjppreparation.basics.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIdentifiers {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String ss=s.next();
		
		Pattern p=Pattern.compile("[a-zA-Z$._][a-zA-Z0-9$._]+");
		
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

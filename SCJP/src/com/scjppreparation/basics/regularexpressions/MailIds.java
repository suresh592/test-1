package com.scjppreparation.basics.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIds {
	
	
	public static void main(String[] args) {
		System.out.println("Enter the mail Id");
		
		
		Scanner sc=new Scanner(System.in);
		
		String mailId=sc.next();
		
		//own one
		//Pattern p=Pattern.compile("[a-z][a-zA-Z0-9]*@gmail.com");
		
		
		Pattern p=Pattern.compile("[a-z][a-zA-Z0-9]*@[a-zA-Z]+([.][a-z]+)+");

		Matcher m=p.matcher(mailId);
		
		if(m.find()&&m.group().equals(mailId))
		{
			System.out.println("Vlaid Identifier");
		}
		else
		{
			System.out.println( "Invalid Identifier");
		}
		
		
		
		
		
	}

}

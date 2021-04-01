package com.scjppreparation.basics.regularexpressions;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNames {

	
	public static void main(String[] args) {
		
		
		int count=0;
		
		
		//own implementation
		//Pattern p=Pattern.compile("\\w+[.]txt");
		
		Pattern p=Pattern.compile("[a-zA-Z0-9_.]+[.]txt");
		File f=new File("S:\\College Programs\\571\\571");
		
		String[] s=f.list();
		//System.out.println(s);
		
		for(String s1:s)
		{
			
			Matcher m=p.matcher(s1);
			if(m.find()&&m.group().equals(s1))
			{
				count++;
				System.out.println(s1);
			}
			else
			{
				System.out.println(count);
			}
		}
	}
}

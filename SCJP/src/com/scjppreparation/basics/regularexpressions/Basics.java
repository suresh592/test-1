package com.scjppreparation.basics.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {
	
	
	//Any group of strings acording to particular pattern is called regular expresiion
	
	//we can write a regular expression to represent all valid mailids and by using that regular expression we can validate whether
	
	//the given mail id is valild or not
	
	//we can write a regular expression to represent all java identifoers
	
	//the main application areas of regular expressions are
	
	//we can implement validation mechanisms
	
	//we can develop pattern matching applicatiosn
	
	//we can develop translations interpreters like compilers etx..
	
	//used fro designing digital circuits	
	
	//used to ddveop communication protocols like TCp, Ip etx...
	
	
	
	
	
	public static void main(String[] args) {
	
		
		
		//Pattern Class
		
		//A pattern obejct represent a compiled version of  regular expression 
		
		//we can create a pattern object by using compile() method of pattern class
		
		//Pattern p=Pattern.compile(String regualrExression)	
		
		
		//Matcher CLass
		
		//A matcher object can be used to match character sequence against a regular expression.
		
		//we can create a matcher using matcher() of Matcher class
		
//		Matcher m=pattern.matcher(String regex);
		
		
		
		//Important methods of matcher class
		
	
		//boolean find()
		
		//it attempts to find next match and if it is available returns true other wise false
		
		//int start ()   returns the start indexd  of the match
		
		//int end() returns the end indexof the math
		
		//String group() returns the matched pattern
		
		//Character classes
		
		//[A-Z]    any upper case alphabet symbol
		
		//[a-z]   anu lower case alphabet symbol
		
		//[a-zA-z]    any alphabet symbol
		
		//[0-9] any digit from 0-9
		
		//[abc] either a or b or c
		
		//[^abc]   except a or b or c
		
		//[0-9A-Za-z]  any alpha umeric characcter
		
		
		
		
		
		Pattern p=Pattern.compile("ab");
		
		String x="\\W";
		Pattern p1=Pattern.compile(x);
		Matcher m=p.matcher("abababbacbadsdgdgababcdfer");
		
		Matcher m1=p1.matcher("a3zbc@c4z#");
		
//		while(m.find())
//		{
//			System.out.println(m.start() + "\t"+m.end()+"\t"+m.group());
//		}


//		while(m1.find())
//		{
//			System.out.println(m1.start() + "\t"+m1.end()+"\t"+m1.group());
//		}



	
	
	// There are some pre defined character classes
	
	//space character   \s
	
	//[0-9]     \d
	
	//[0-9A-Za-z]   \w
	
	//[any secial character]    \W
	
	//Anychatracter    .
	
	
	//we can also use quantifiers to specify number of characters to match
	
	//a  exactly uone a
	
	//a+    atleast one a
	
	//a*     any number of as
	
	//a? atmost one a
		
		
		String x1="a";
		Pattern p2=Pattern.compile(x1);
		Matcher m2=p2.matcher("ababaabbaaaacba");
		
		while(m2.find())
		{
			System.out.println(m2.start()+"\t"+m2.end()+"\t"+m2.group());
		}

		//pattern class contains split method to split the pattern according to a regular expression
		
		Pattern pp=p.compile("\\s");
		String[] mm=pp.split("Sai6 Gangadhar7 Kotte");
		
//		for(String s1:mm)
//		{
//			System.out.println(s1);
//		}
//		
		
		
		Pattern ppp=p.compile("\\.");
		String[] mmm=ppp.split("com.citibank.co.in");
		
//		for(String s1:mmm)
//		{
//			System.out.println(s1)
//			;
//		}
		
		
		
		//String class also contains a split method to split the gien string against the regular expression
		
		String ser="com.citibank.co.in";
		
		String[] ar=ser.split("\\.");
		for(String a:ar)
		{
			System.out.println(a);
		}
	
	
	//Pattern class String can take String as an arguement while the String class split can take regex as an arguement
	
	
	}
	
	
	
}

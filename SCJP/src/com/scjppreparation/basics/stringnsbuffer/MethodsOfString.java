package com.scjppreparation.basics.stringnsbuffer;

public class MethodsOfString {

	
	public static void main(String[] args) {
		
		
			//public char charAt(int index)
		
		String s="Saai, ";
		
		System.out.println(s.charAt(2));
		
		//System.out.println(s.charAt(45));    Strintg index out of bounds
		
		//public String concat(String s)
		
		s=s.concat("Pret is lost");
		
		System.out.println(s);
		
		
		//public boolean equals(String s)  //always meant for content cpmparision wheere case is also imporrtant
		
		//public boolean equalsIgnoreCase(String s);   meant for content comparision where the case is not important
		
		String ss="Java";
		
		String sss="JaVa";
		
		System.out.println(ss.equalsIgnoreCase(sss));
		
		//in general fro the vlaidation of user name we have to go for equals ignore case method where the case is nort important
		
		
		//public String subString(int indecx)   returns the sub strign from begin to end of string
		
		//public String subString(inrt start, int end)
		
		//retuns thestrign from start to end-1  here end index is exclusive
		
		String sbstr="abcdef";
		
		System.out.println(sbstr.substring(2));
		
		System.out.println(sbstr.substring(1, 5));
		
		
		//public int length();
		
		System.out.println(sbstr.length());
		
		
		//length variable applicable for array swhere ad lenght() is applicable for String objects
		
		//public String repalce(char old, char new)
		
		String rep="aabbbcccddd";
		
		System.out.println(rep.replace('b', 'a'));
		
		
		//public String toLowerCase()
		
		System.out.println(s.toLowerCase());
		
	    //public String toUpperCase()
		
		System.out.println(s.toUpperCase());
		
		
		//publi String trim()   to remove the blcank spavces [present at eh beginning and at teh end of eh String
		
		//but not the blank spaces present at the middle of the String
		
		String space="      vbsk          ";
		
		System.out.println(space);
		
		System.out.println(space.trim());
		
		
		//pubic int indexOf(char ch)   returns teh index of first occuran ce of the character
		
		System.out.println(s.indexOf('e'));
		
		//public int lastIdexOf(char ch)  returns the last index of the occuranc eof the soecified character
		
		
		
		
	}
}

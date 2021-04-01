package com.scjppreparation.basics.datatypes;

public class IntegerLiterals {
	public static void main(String[] args) {
		
		
		//uses 0-9 for integer literals
		int x=1234567690;
		
		
		//octal literals
		//uses 0-7 and these octal numbers are prefixed by 0(Zero)
		
		int ox=01234;
		//if we can use other than those we will get the compilation error
		//int owx=07658;
		
		//the allowed values are 0-9 a to f and A to F
		int hl=0xADCF;
		
		//if we use other than those values we will get compilation error
		//int wrhx=0Xader;
		
		System.out.println(x);
		System.out.println(ox);
		System.out.println(hl);
		
		//we can specify the integer literal using binary using prefix 0b or 0B
		
		int bin=0B110101001;
		
		int binn=0b1101_1011_1001;

		System.out.println(bin+"\t"+binn);
		//we can use underscores while represeting the literals
		
		int udlit=123_345_567;
		System.out.println(udlit);
		
	}

}

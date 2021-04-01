package com.scjppreparation.basics.operators;

public class Ternary {
public static void main(String[] args) {
	
	
	//teh only conditional or ternary operator available in jabv is ?:
	
	int a=100,b=200;
	
	int result=(a>b)?a:b;
	System.out.println(result);
	
	//nesting of conditional operator is possible
	
	//done programs in this Pc
	//please check them for reference
	
	int rresult=(a<50)?666:(b>100)?263:277;
	System.out.println(rresult);
	
}
}

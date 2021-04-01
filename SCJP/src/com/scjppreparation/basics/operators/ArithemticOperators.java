package com.scjppreparation.basics.operators;

public class ArithemticOperators {
	
	public static void main(String[] args) {
		System.out.println("Operators are + - * / % ");
		
		//if we are performing any arithmetic operation between two variables the result type suhould be
		//max(int, type of a ,type of b)	
		
		//there is no way to represent infinity in case of arithemtic operations we wil get compiler time error
			//System.out.println(10/0);
		
		//but in teh case of floating points we can representinfinity
		//positive -int=finity=infinity
		//negative-infinity=infinity
		System.out.println(10.0/0);	
		
		//in an integral arithmetic there is way to represent the Not A Number
		
		
		//if the result is undefined tehn we will Arithmetic Exception 
		//System.out.println(0/0);
		
		
		//but in the case of float and double representation there is a waY TO represent the undefined results using not a number nan
		System.out.println(0.0/0);
		System.out.println(Math.sqrt(-4));
		
		
		System.out.println(10>Float.NaN);
		
		//any operation with respect to float.NAN will gives false
		//except != operator which always gives true
		System.out.println(10<Double.NaN);
		System.out.println(10==Float.NaN);
		System.out.println(10!=Float.NaN);
		System.out.println(Float.NaN!=Float.NaN);
		
		//in integral airthmetic only we will get teh Arithmetic exception but not in float and double
		
	}

}

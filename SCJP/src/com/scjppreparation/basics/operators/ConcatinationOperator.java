package com.scjppreparation.basics.operators;

public class ConcatinationOperator {
	public static void main(String[] args) {

		//THe only overloaded operator in java is +
		//some time sit acts as arithmetic addition operator and dome times it acts as String arithmetic operator or
		//String COncatination OPerator


		int a=10,b=10,c=10;
		String name="Sai Gangadhar";
		
		System.out.println(a+b+c+name);

		System.out.println(a+b+name+c);

		System.out.println(a+name+b+c
				);

		System.out.println(name+a+b+c);
		
		//if atleast one operand is String then + acts as teh concatination operator
		//other wise it acts as airthmetic operator
		
		String ad;
		ad=name+20;
		System.out.println(ad);

	
		//compiler error
		//b=name+20;
		//name=a+b+c;
	}

}

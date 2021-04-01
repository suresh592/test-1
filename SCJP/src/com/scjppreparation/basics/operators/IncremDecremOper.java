package com.scjppreparation.basics.operators;

public class IncremDecremOper {
	public static void main(String[] args) {
		
		
		
		
		
		int x=1,y=1;
		System.out.println("X Preincrement "+ (++x));   ///here first the value is incremented and then the operation is done
		System.out.println("Y PostIncrement " + (y++));  //here after the operation the value is incremented
		
		
		int z=2,w=2;
		
		System.out.println( "Pre Decrement of Z "+  --z);  //here z value first decrements and then the operation is executed
		System.out.println("Post Decrement of W "+ w--);   //here first teh operation is executed and then the value is decremented
		
		//we can apply increment and deccrement only for variables but not foir constants
		
	//	System.out.println(++4);
		
		//nesting of increment and decrement operators is not allowed
		
		//System.out.println((++(++y)));
		
		//we cannot apply increment and decrement for  final variables
		//wew ill get compile time error
		
		//we can apply increment and decrement for every primitive dqta type variables except for boolean
		
		double d=12.5;
		char c='X';
		
		System.out.println(++d);
		System.out.println(++c);
		
		
		byte b=1;
		
		//when ever we are performing any arithemetic operation bertween two variables in java
		//max(int,type of a,type of b)
		
		//in teh below line we found that (max(int,byte,int)   
		//here as a result variable we want int 
		//thats whhy we will get the compiler error
		b=  (byte) (b+1);
		
		//ubt in teh case of increment and dercrement operators type casting will be automatically performed by the compiler
		//that is automatic conversions or internal type casting
		System.out.println(b++);
		
	}

}

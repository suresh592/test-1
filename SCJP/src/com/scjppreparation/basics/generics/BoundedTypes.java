package com.scjppreparation.basics.generics;

public class BoundedTypes {

	//we can boudn the type parameter  for a particular range by using th eextends key word
	
//	class Test<T>
//	{
//		
//	}
	
	//as the type of parameter we can pass any type hence it is an unbounded type
//	
//	Test<String> t1=new Test<String>();
//	Test<integer> t2=new Test<Integer>();
	
	
	
//	class Test<T extends Number>
//	{
//		
//	}
//	
//	As the parameter type we can pass either the number type or its child type called bounded type
//	
//	Test<String> t1=new Test<String>();    compiler error generates
//	Test<integer> t2=new Test<Integer>();   true
	
	
	//we cannot boudn type parameter by using implements and super key word
	
//	class Test<t implements Runnable>
//	{
//	     we can survive here by using extends key word only	
//	}
//	
//	class Testt<T super integer>
//	{
//		
//	}
	
	
//	class Testt<T extends X>
//	{
//		here x may be a class or an interface
	
	//if x is a class then as a type parameter we can provide either  x type of its child cclasses
	//if x is an inteface then 	as the type parameter we can provide either x type or it=s  impolemented classes
//	}
	
	
//	class Test<T extends Runnable>
//	{
//	Test<Runnable> t1=new Test<Runnable>();
//	Test<Thread> t2=new Test<Runnable>();
//	Test<String> t1=new Test<String>();   false errpr
//	Test<integer> t2=new Test<Integer>();  error  false	
	
	
	//we can bound the parameter even in the combination also
//	class Test<T extends Runnable&Numberr>
	
	//as the type parameter we can pass anhy type which is  the child class of Number and implements runnable interface
	
	////	class Test<T extends Runnable&Comparable>
	//\\//	class Test<T extends Runnable&Comparable&Number>
	
	////	class Test<T extends Number&Thread>   //error here
	//because we can extends only one class at a time
	
	////	class Test<T extends Runnable&Number>   //error herre 
	//because first we have to take the class ands then the interface
	
//		
//	}
}

package com.scjppreparation.basics.generics;

import java.util.ArrayList;

//Declaring type parameter at class level


class Test<T>
{
	
	
	T ob;
	
	public T get()
	{
		return ob;
	}
	
	
	
	//Declaring type parameter at method level
	
	
	public <M> void m1( )
	{
		
	}
	
	//T extends Number
	
	//T extends Runnable
	
	//T extends Number& Runnable
	
	//T extends Number & Runnable & Comparable
	
	//T extends Number & Thread false
	
	
}

public class GenericMethods {

	//m1(ArrayList<String> l)  this method is applicable for ArrayList<String> array list of only string type
	
	
	//with in teh method we can add String typep of objects and null to the list if we are trying to add any other type we will ge t
	//compile time error
	
	//m1(ArrayList<   ? extends X l)
	
	//we can call this method by passing array list of any type but with in the method we cannot add any type except null
	
	//because we dont kn ow the type exactly
	
	//m1(ArrayList<?> l)
	//l.add(null)  true;
	
	//l.addd("A");  error
	
	//l.add(10   error
	
	//m1(ArrayList<   ? extends X l)
	
	//if X is  a classs then we can call this methiod by passing  arrayList of either X or its child classes
	
	//if x is an interface we can call this method by passing arrayList of X or its chld classes
	
	//in this case also we can cant addd any type of elements except null
	
	////m1(ArrayList<   ? super X l)
	
	//if x is a class then this method is applicable for arralList of either x or its super class 
	
	//if x is an interface then this method is applicable for arraylist of either of X type of super class es of implementaion ofX
	
	
	//with in the method we can add only x type objects and null to the list
	
	//we can define the type parameter either at class level or at method level
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}

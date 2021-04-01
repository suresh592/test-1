package com.scjppreparation.basics.generics;

import java.util.ArrayList;

public class NonGenerics {

		//to provide compatability with the old version sun people introduced teh concept of generics in very few areas
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		
		
		al.add("Sai");
		
		//al.add(256);   //in this generiac are we got exception if we are trying toadd real numbers to String
		
		m1(al);
		System.out.println(al);
	}

	private static void m1(ArrayList al) {
		// TODO Auto-generated method stub
		
		
		//this is the non generic are
		
		//if we are trying to add anythong here we will get no error and compilation is successful
		
		al.add(1567);
		al.add(2564.456);
		al.add(true);
		
		
		//These generics concepts are avialable ay only at compile time to provide type asfety adn to resolve type casting problems
		
		//at teh run time there is no such type of concept
		
		//Hence the dollowing decalrations are equal
		
		//Al a=new Al<>()
		//Al a=new Al<String>()
		//Al aa=new Al<Integer>()
		
		//The following two declarations are equal and there is no  difference
		
		
//		
//		Al<String> l=new Al<String>();
//				Al <Strign> l=new Al();
		
		
		
	}
}

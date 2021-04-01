package com.scjppreparation.basics.collecfwlist;

import java.util.Stack;

public class Stackk {
	
	
	//this is the child class of vector which contains only one constructor
	
	//stack s=new stack()
	
	
	//specific methods in Stacck are
	
	//  Object push(Object o)   to insert an object into teh stack
	
	//Object  pop    //to remove and returns the top of the stack
	
	//boolean isEmpty()   returns true when the stack is empty
	
	//int search(Object o) return teh offset from the top of teh stack if th eobject available else returns -1
	
	
	public static void main(String[] args) {
	
		
		Stack s=new Stack();
		s.add("Yeshodamma");
		s.add("Sai Gangadhar");
		System.out.println(s);
		s.push("Vr");
		s.push("Leader");
		System.out.println(s);
		s.push("Mahidhar");
		System.out.println(s.search("Leader"));
		
	}

}

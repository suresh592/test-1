package com.scjppreparation.basics.constructors;

public class KeyWrdThisOf {
	
	
	//using thisOf we can call one constructor from another constructor woith in the class.we can write this() as the first
	//statement of the constructor other wise we will get teh compile time error
	
	
	//by using this we can execute all the objects using teh same object
	
	public KeyWrdThisOf() {
		// TODO Auto-generated constructor stub
		
		System.out.println("This is the default constructor");
	}
	
	int i;
	
	
	public KeyWrdThisOf(int i) {
		this();
		System.out.println(i);
		this.i = i;
	}
	String name;
	
	
	


	public KeyWrdThisOf(int i, String name) {
		this(250);
		this.i = i;
		this.name = name;
		
		System.out.println(i+"\t"+name);
	}





	public static void main(String[] args) {
		
		KeyWrdThisOf kt=new KeyWrdThisOf(25,"Saai");
		
	}

}

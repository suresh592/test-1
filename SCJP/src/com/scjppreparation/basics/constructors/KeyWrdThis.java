package com.scjppreparation.basics.constructors;

public class KeyWrdThis {
	
	//this key word points to current object
	
	//it points to non static variables and methods, static variables and methods
	
	
	//we can use this key word to differentiate from non static variables fromlocal variables 
	//when they are same
	
	
	
	//we cannot use this key word inside the static methods
	
	int i=1000;
	
	int j=999;
	static int k=12000;
	
	void display(int i)
	{
		System.out.println("Before using this key word");
		System.out.println(i + "\t"+j +"\t"+ k);
		
		
		//using this key word the local and non static variabels are differentiated
		
		//if we use this it takes non static variabels instead of local varaibles
		System.out.println("After using this key word");
		System.out.println(this.i + "\t"+j +"\t"+ k);
	}
	
public static void main(String[] args) {
	
	KeyWrdThis kt=new KeyWrdThis();
	kt.display(200);
}

}

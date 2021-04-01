package com.scjppreparation.basics.mainandcmdargs;

class A
{
	public static void main(String[] args) {
		
		
		System.out.println("This is in the class A");
	}
}
public class MethodHiding extends A{

	
	//we think that over riding concept is also applicalbe for static methods
	//this concept is not called as Over riding but it is called as Method hiding
	
	
	//over loading concept is also applicalble for main also
	//but the JVM  always calls String  arguement method omnly
	//other methods we have to call explicitly
	public static void main(String[] args) {
		
		System.out.println("This is in teh class Method Hiding");
		int[] ars= {0,0};
		main(ars);
		
	}
	
	
	public static void main(int[] args) {
		
		System.out.println("This isin the Int Args Main Method");
	}
}

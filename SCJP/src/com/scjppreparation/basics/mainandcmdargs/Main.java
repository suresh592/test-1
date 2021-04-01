package com.scjppreparation.basics.mainandcmdargs;

public class Main {
	
	///its the responsibility of JvM to check that the main method is there or not
	//its not the responsibility of the compiler
	
	
	//if we does not have m ain then JVM will throw NoSuchMethodError
	

	
	//JVM  always searches for the following signature
	
	//public --to be called by jvm from anywhere
	//static -- without existing object also we can call this method
	//void -- main method wont return anything
	//main -- name oif the default method which is configured inside the JVM
	//String[] args  -- command line arguments
	
	
	//if we are perrforming any changes to the below method then we will get no such method error
	//we an change public static ------ static public
	//string[] args   ------ string []args -----------   string args[]             -------------   string... args
	
	//instead of args we can take any valid java identifier
	//instead of string array we can take the var args method
	
	
	//teh main metrhod can be declared with following modifiers also
	
	//final
	
	//public final static void main(String[] args) {
	
	
	//synchronized
	
	//public synchronized static void main(String[] args) {

	
	//strictfp
	//public strictfp static void main(String[] args) {
	
	
	//this is valid
	
	
public strictfp final synchronized static void main(String... args) {
	
	System.out.println("main");
	
	
	
	
}
}

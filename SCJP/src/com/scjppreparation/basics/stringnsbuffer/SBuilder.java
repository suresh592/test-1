package com.scjppreparation.basics.stringnsbuffer;

public class SBuilder {

	
	//every method present in String buffer is synchronized hence at a time only opne thread is allowed to access StringBuffer object
	
	//it increases teh waiting time of threads and effects performance of the system
	
	//to resolve this problem sujn people introduced String BUilder in 1.5
	
	//Strni buildee r is exactl ysame as strign buffer (including the methods and cocnstriuctors) except the fiollowinf differences
	
	//differences between string buffer and string builder
	
	//sbuff ---  Every method is synchronized
	
	//sbuid   ----   no method is synchronized
	
	//sbuff  ----  these objects are thread safef befcause at a time inly one thread is allowed to access this obejct	
	
	//sbuid   ---- these are not thread safe because  it can be accessed by mmultiple threads simultaneously
	
	//sbuff   ---- relatively performance is low    1.1	
	
	//sbuild    ----- relatively poefromance id high  1.5
	
	
	
	
	//String vs StringBUffer   vs StrignBuilder
	
	//if the content will not change freauently then we will go for String 
	
	//if the content will change freauently and thread safety is required then we will go for string buffer
	
	//if teh content will change frequentluy and thread safety is not required then we will go string builder
	
	
	
	//Method Chaining
	
	//for most of the methods in string, string buffer and stritng builder the return type is the same only
	
	//hence after applyign a method on the reslut  we can call another method with forms caclled method chaining
	
	//sb.m1.m2.m3.......
	
	
	
	//in the method chaining all methods will be executed form left to right 	
	
	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("Saai Ganagdahaar").insert(4, " Kotte ").reverse().append("com.solutions");
		System.out.println(sb);
	
	
	
		
		//final vs immutable
		
		//ifa a final variable is declared then we cannot reassign that variable to some other obejct
		
		final StringBuilder s=new  StringBuilder("Saaai");
		//s=new StringBuilder("Himanush");
		
		
		//so declaring a variable as final we eont get any immutability nature , in teh corresponding obejct  we
		//can perfrom any type of changes		
		//even though teh variable is declared as final
		
		s.append("  S aai");
		
		System.out.println(s);
		
		//hence final and immutable bith concepts are different	
	}
	
	
	
	
	
	
	
	
}

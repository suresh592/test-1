package com.scjppreparation.basics.stringnsbuffer;

public class Internn {

	
//	Java String intern() method is used for getting the string from the memory if it is already present. This method ensures that 
//	all the same strings share the same memory. For example, creating a string “hello” 10 times using intern() method would ensure 
//	that there will be only one instance of “Hello” in the memory and all the 10 references point to the same instance
	
	public static void main(String[] args) {
		
		
		
		String str1 = "beginnersbook";    
		
		/* The Java String intern() method searches the string "beginnersbook"  
		 * in the memory pool and returns the reference of it.
		 */
		String str2 = new String("beginnersbook").intern();
		
		System.out.println(str1==str2);
		
		
		//When we create Strings using string literals instead of creating them using new keyword then the java automatically interns String them
		
		
		
		
		//Durga Sir
		
		//by using hte heap object reference if you want to egt correspoding scp obejct reference  then we shpould gofor intern
		
		System.out.println("Intern by Dirga");
		String s1=new String("Durga");
		
		String s2=s1.intern();
		System.out.println(s1==s2);
		
		String s3="Durga";
		
		System.out.println(s2==s3);
		
		
		//if the corresponding object not avaiable in scp tehn intern creates a new object and gives it back to you
		
		String s4=s1.concat(" Sai");
		String s7=s4.intern();
		
		String s5="Durga Sai";
		
			System.out.println(s4==s7
					);
	}
	
	
	//
}

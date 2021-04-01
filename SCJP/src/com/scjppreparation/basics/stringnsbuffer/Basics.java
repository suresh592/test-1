package com.scjppreparation.basics.stringnsbuffer;

public class Basics {
	
	////once we create a strign object we cannot perfrom any changes in the exisintg object. If we are trying to perform any changes 
//	
//	String s=new String("Duraha");
//	s.concatinate("Sai");
	
	
	//with those changes anew object will be created this behaviour is nothing but immutability of the String
	
	
	//once we create a StrignBufefr we can perfrom any changes in teh exisint objec. this behaviour is nothing but mutability of 
	
//
//	StringBuffer s=new StringBuffer("Duraha");
//	s.append("Sai");
	//string buffer object
	
	
	public static void main(String[] args) {
		
		
		

		//in teh string class .equals() method is over ridden for content comparision  Hence .equals() method return true
		
		
		String s=new String("Duraha");
		
		System.out.println("Concatingation with new "+s.concat(" Sai"));
		s.concat(" Sai");
		System.out.println(s);
		String ss=new  String("Duraha");
		
		System.out.println(s.equals(ss));
		System.out.println(s==ss);
		
		
		//in string buffer .equals() method is not over ridden for content comparision hence Object class equals method will be executed 
		
		//which ismeant for reference comparision. due to this equals() method returns false even though content is same if objects are different
		
		
		
		//Difference between  String s=new String("Sai"); and Stirng s="Sai";
		
		// in the first case two objects will be created ine isin heap  and the other is in String constant pool area 
		
		//and then s is always pointing to heap object
		
		//in the second case without new only one object will be created in String constant pool adn that is pointg ti it
		
		
		
		//Note :
		
		//GC i snot allowed to access in scp area hence even though object does not have any reference variable still it is not eligible
		
		//for gc if it is present in string constant pool area
		
		//all objects present in the scp area will be destroyed automaticaly at the time of JVM shut down
		
		//object creation is scp is always optional. First jvm check if any object present in scp area with required content or not.
		
		//if it is already avaialableit will reuse existing object instead of creating new object. if it is not available then only a new 
		
		//object will be created. Hence there is no chance of 	two objecs with teh same content in scp thta is duplicate objects are 
		
		//not allowed in scp
		
		
		
		System.out.println("With out usingnew ");
		String s3="Durga";
		
		String s4="Durga";
		
		
		System.out.println(s3==s4);
		
		
		System.out.println("Concatinating s4 wihtout New "+s4.concat(" Sai"));
		
		s4=s4.concat(" Sai");
		System.out.println(s4);
		
		StringBuffer sb=new StringBuffer("Sai gangadhar");
		
		StringBuffer sbb=new StringBuffer("Sai gangadhar");
		
		System.out.println(sbb.equals(sb));
		System.out.println(sb==sbb);
		
		
		
		//For every string constant one object will be created in scp area
		
		//because of some tun time operation if an object is required to create the object should be created only on heap but not inscp
		
		String str="Sai "+new String("Gangadhar");
		System.out.println(str);
		
		
		
	}
	

}

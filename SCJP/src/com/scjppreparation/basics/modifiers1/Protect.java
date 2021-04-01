package com.scjppreparation.basics.modifiers1;

import com.scjppreparation.basics.modifiers.Protectd;
import com.scjppreparation.basics.modifiers.ProtectdExt;

public class Protect  extends Protectd{
	
	//in another package we want to access with parent class reference then we will get the compile time error
	
	
	
	public static void main(String[] args) {
		
		//check here with teh oarent reference we cannot access the values
		
		Protectd pc=new Protectd();
		
		//lets try with teh child reference
		
		Protect proc=new Protect();
		
		//we can access the method using the child reference no problem is there
		proc.m2();
	}
	

}

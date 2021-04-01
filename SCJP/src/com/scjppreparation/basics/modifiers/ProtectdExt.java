package com.scjppreparation.basics.modifiers;

public class ProtectdExt extends Protectd{
	
public static void main(String[] args) {
	
	
	//withi in the current package we can access them by using child or parent reference
	
	Protectd proc=new Protectd();
	System.out.println("using the child class reference");
	proc.m2();
	
	ProtectdExt pext=new ProtectdExt();
	
	System.out.println("This is hte parent class reference");
	pext.m2();
	
}

}

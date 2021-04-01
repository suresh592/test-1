package com.scjppreparation.basics.mainandcmdargs;

import java.util.Scanner;

import java.lang.Math.*;
public class StaticUnstaticImp {
	
	public static void main(String[] args) {
		
		//without static import
		System.out.println(Math.sqrt(22));
		System.out.println(Math.max(25, 36));

		Scanner sc=new Scanner(System.in);
		
		//without static import
		
		//System.out.println(sqrt(22))
		
		
		//packages
		
		//to resolve naming comflicyts
		//to provide security to teh classes and interfaces so that outside person cannot access them directly
		//it improves modularity of the application
		
		
		//com.icicibank.loan.housingloan.account
		//reverse domain name--com.icicibank
		//loan ---  module name
		//housing..  ---- sub module name
		//account  ---c class
		
		//in any java class therre is only one package
		//if there is more than one then we iwll get teh compiler error
		
		//in any java ogm the first non comment statement shoukd be package statement
		
		
		//java src file structure
		//package ...
		//import  ...
		//class /interface// enum
		
		
	}

}

package com.scjppreparation.basics.modifiers;

import com.scjppreparation.basics.modifiers1.Publicc;

public class Modifiers {
	
	String name;
	String adress;
	
	
	
	//teh only applicable modifiers fo rtoplevel classes are
//	public
//	default
//	final 
//	abstract 
//	strictfp
	
	//if we are uysing any modiofer than above we will get teh compile time error
	
	
	//but for the inncer classes the following modifers are applicable
	
	//public
	//default
	//private
	//protected
	//static
	//final
	//abstract 
	//strictfppublic 
	
	
	
	
	
	protected Modifiers(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	
	//its not reaulable if we declare a pprivate constructor
	//defayult and protected is declaerd and isusuabel with in that package
	

//	private Modifiers(String name, String adress) {
//		super();
//		this.name = name;
//		this.adress = adress;
//	}


	public static void main(String[] args) {
		
		//public 
		//if a class is declared as public we can access that class from anywhere
		
		//we can access public class in another package
		
		Publicc pc=new Publicc();
		
		//if we does not declare that class as public we will get the compile time error
		
		
		for(int y=0;y<3;y++)
		{
			System.out.println(y+3);
		}
		
	
		
		//accessing default class here
		//outside the package we cannot access them
		Default dd=new Default();
		dd.display();
		
		
	}

}

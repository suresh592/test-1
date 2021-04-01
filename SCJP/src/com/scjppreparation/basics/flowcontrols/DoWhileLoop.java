package com.scjppreparation.basics.flowcontrols;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		
		
		//if we wan trto execute loop bidy atleast once then we will =go for do while loop
		
//		do
//			System.out.println("Hiii");
//		while(true);
		//unreachable code
		//-System.out.println("jaiii");
		
		
		
		//this is a valid java statement
//		do;
//			while(true);
		
		
		//this is invalid because we cannot declare teh declarative inside the loop
//		do
//			int x=10;
//		while(true);

		//this is the valid java statements
		
//		do 
//			while(true)
//			System.out.println("HEllo");
//		while(false);
		//this is the unreachabel code
//			System.out.println("HEo");
		
		
		
		//compiler will check for unreachable code onl yin loops but not in the  If Else Blocks
		
		int x=0;
		do
		{
			x++;
			System.out.println(x);
				continue;
				
				//unreachable code
//				x++;
//				System.out.println(x);
			
		}while(++x<10);
		
	}

}

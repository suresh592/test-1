package com.scjppreparation.basics.modifiers;

public class Protectd {
	
	//if a memebr is declared as protected teh nwe can access those method anywhere in teh same package
		//in other classe if you want to access tehn we want to delcare that as teh child class
		
		
		//prpotected== defautl +kids or childs of another package
		
		//withi in the current package we can access them by using child or parent reference
		//but form outside the package we can access then=m by using parent reference only
		
		protected void m2()
		{
			System.out.println("This is the misunderstad modifier");
		}

		public static void main(String[] args) {
			
			
			Modifiers modi=new Modifiers("Sai","Le@der");
			
			
			
		}

}

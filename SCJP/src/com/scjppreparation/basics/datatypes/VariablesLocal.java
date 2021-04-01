package com.scjppreparation.basics.datatypes;



public class VariablesLocal {
	
	
	void display()
	{
		int x=20;
		String name="Yeshoda";
		double fee=250.56;
		boolean isPassed=true;
		
	}
	
//	void disp()
//	{
//		System.out.println(x);
//	}
	
	
	public static void main(String[] args) {
		
		//if we declare a variable inside a method is called local variables
		
		//jvm will not assign default values to the local variables we want to assign them externally
		
		//scope is when the jvm enters into the method 
		
		// their life time ends when the jvm comes out of the method
		
		
		//local variables also known as stack or temporary variables
		
		//these are stored inside the stack area
		
		
		//the only applicable modifier for local variables is final
		
		//if we are using any the modifier we will get teh compile time error
		
//		
//		private int x;
//		protected int y;
//		static int z;
//		int fer;
//		System.out.println(fer);
		int x=20;
		String name="Yeshoda";
		double fee=250.56;
		boolean isPassed=true;
		System.out.println(x +"\t"+ name +"\t"+ isPassed +"\t"+fee);
		
	}

}

package com.scjppreparation.basics.varargs;

public class Basics {
	
	//until 1.4 we cannot declare a method with variable number of arguements
	//if there is a change in the number of arguements tehn we want to declare new mwthods
	
	//thisi increases teh length of the code anf dreduces the reqadability
	
	// to resolve this sun people introduced the var args methods
	//we can decalre a method with variable number odf arguements
	//these methods are called varargs methods
	
	
	//syntax 
	//method_name(type... variable_name)
	
	
	


	static void m1(int... x)
	{
		System.out.println("Variable Number Of Arguements");
	}
	

	
	static void sum(int... x)
	{
		System.out.println("Variable Number Of Arguements");
		
		int total=0;
		for(int y:x)
		{
			total=total+y;
		}
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		
		//ex
		//m1(int... x)
		
		///m1(int ...x) 
		
		//we can invoke the method using
		
		
		//we can invoke this method by passing any number of arguements including zero also
		//m1()
		//m1(20,30)
		//m1(20,30,40)
		//m1(20,30,49,50)
		

		
		m1();
				m1(20,30);
				m1(20,30,40);
				m1(20,30,49,50);
				
				
				sum();
				sum(20,30);
			sum(20,30,40);
				sum(20,30,49,50);
				
				//internally var atrgs are implemented using single diment=sional array
				//hence we can differentiate arguements using index
				
		
				
				//we can mix varargs parameters with teh normal parameters
				
				//m1(int x,String... y)
				
				//if we are mixing var args parameter with the normal parameters the var args should be the last one
				
				//in a method we can take only one var arg paramerter
	}

}

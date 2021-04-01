package com.scjppreparation.basics.innerclasses;



public class MethodInnerClasses {

	//some times we can declare a class inside a method, such types of classes is called method local inner classes
	
	//the main purpose of method local inner classes is to define method special functionality
	
	//the scope of method local inner classes is the method in which we declared it that is form outside of m ethod we cannot access 
	//that class
	
	
	//as this scope is very lesss this type od inner classes are most rarely used
	
	
	
	void m1()
	{
		
		
		class Test
		{
			
			public void sum(int x,int y)
			{
				System.out.println("sun is "+(x+y));
			}
		}
		 Test t=new Test();
		 t.sum(10, 20);
		 
		 
	}
	
	public static void main(String[] args) {
		
		
		
		class Norm
		{
			
		}
		new MethodInnerClasses().m1();
		
	}
	
	//we can decalre inner classes either in instance or in static methods
	
	//if we decalre inner classes in instance methods then we can access both the static and non static variables of outer class f=directly
	
	//from this inner class
	
	//if we decalre inner class in the static method then we can access only the static members of the outer class
   
	int x=10;
	
	static int y=30;
	
	
	void acce()
	{
		
		// from teh method in which we declared teh inner classs we ac nnot access the local varaibles of that method into the
		
		//inner class directly. But if we declared them as final then we can access it.
		
		int local=500;
		
		class Acce
		{
			
			
			
			void m2()
			{
				//these local variable is not accessible
				//local=300;
				x=65;
				
				y=105;
				
				
			}
			
			
			
		}
		
		
	}
	
	
}

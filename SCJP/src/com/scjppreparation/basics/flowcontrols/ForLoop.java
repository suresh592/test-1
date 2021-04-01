package com.scjppreparation.basics.flowcontrols;

public class ForLoop {
	
	public static void main(String[] args) {
		
		//this is the most commonly used loop
		
		//syntax
//		for(intitalizarion section; consitional expression;increment/decrement)
//		{
//			
//		}
		
		//this initialization section sets the valuie for the loop cintrol variable
		//initialization section executed only once
		//usua;;yu we are performing and declaring variables in this section
		//here we can declare multiple values of same type but not of different types
		
		
//		for(int i=0,j=0;;)
//		{
//			
//		}
//		
		
//		for(int i=0,j=0;;i++,j++)
//		{
//			
//		}
//		

		
		
		//teh conditional ex[presiion tests teh control variabel agauinst the targeted value
		//here we can take nay conditional expression
		//the result must be of boolean type
		//it is optional and we are not specifying anything then compiler will always places true
		
		
		
		int i=0;
		for(System.out.println("Hello R u sleeping");i<3;i++)
		{
			System.out.println("no YOu Only Sleeping");
		}
		
		
		//teh increments and der=crement does ion teh loop cont=rol variable
		//for increment and decrement we can take any java statement including sout also
			int k=0;
			for(System.out.println("hello");k<3;System.out.println("Hi"))
			{
				k++;
			}
		
			
			//all the three parts of for loop ar eindependent of each other
//			for(;;)
//			{
//				System.out.println("Hiii");
//			}
			//System.out.println("Jaiii");
			
			
//			for(int z=0;true;z++)
//			{
//				System.out.println();
//			}
//			System.out.println("Unreachable code");
			
			
			
//			for(int z=0;false;z++)
//			{
//				System.out.println();
//			}
//			System.out.println("Unreachable code");
			
//			for(int z=0;;z++)
//			{
//				System.out.println();
//			}
//			System.out.println("Unreachable code");
			
			
			
//			int a=10,b=20;
//			for(int z=0;a<b;z++)
//			{
//				System.out.println();
//			}
//			//this is unreachable code
//			//no error here
//			System.out.println("Unreachable code");
			
//			
//			final int c=10,d=20;
//			for(int z=0;c<d;z++)
//			{
//				System.out.println();
//			}
//			//this is the unreachable code
//			//here error occurs
//			System.out.println("Unreachable code");
			
			
				
			int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			for(int x: nums) {
			
			System.out.print(x + " ");
			
			//if we pweform any updations to teh array values using for each loop these womt be rflectede
			x = x * 10;
			 // no effect on nums
			}
			System.out.println();
			for(int x : nums)
			System.out.print(x + " ");
			
	}

}

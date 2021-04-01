package com.scjppreparation.basics.flowcontrols;

public class ContinueConst {

	public static void main(String[] args) {
		
		
		//we can use continue statement to skip current iteration and continue for the next iteration in loops
		
		
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0)
				continue;
			System.out.println("The Number is Prime "+ i);
		}
		
		
		//if we are using continue outside of the loop we will get the compile time error
	}
}

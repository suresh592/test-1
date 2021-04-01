package com.scjppreparation.basics.flowcontrols;

public class BreakCOnst {

	public static void main(String[] args) {
		
		//it is iused to stop fall through in a switch statement
		
		//inside teh loop to break loop execution bae\]sed on a condition
		//
		
		//inside labeled blocks to break that block
		
		//break cannot be used outside of a loop
		int i=0;
		
		//l a label
		l1:
		{
			System.out.println("hello");
			if(i==10)
			{
				break l1;
			}
			i++;
			System.out.println("Hiii");
		}
		
		label:
		{
			System.out.println("This is in a label");
		}
		System.out.println("End");
		
		
		//in teh case if nested loops we should go forlabeled breakjk and continue statementds
		
		
		ll:
			for(int j=0;j<5;j++)
			{
				
				System.out.println("Loop J"+ j);
				l2:
				for(int m=0;m<10;m++)
				{
					System.out.println( "Loop M"+m);
					l3:
					
				for(int n=0;n<5;n++)
				{
					
					System.out.println("Loop N" +n);
					break l2;
				}
				break ll;
					
				}
			}
	}
}

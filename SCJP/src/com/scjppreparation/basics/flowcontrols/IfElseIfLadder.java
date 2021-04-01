package com.scjppreparation.basics.flowcontrols;

import java.util.Scanner;

public class IfElseIfLadder {
	
	public static void main(String[] args) {
		
		//these statements are executed from top down
		//as soon as one of teh conditions controlling the if is executed and the rest of teh ladder is bypassed
		//if none of the conditions is true then the final else statement is executed
		//the final else acts as a default consition
		
		System.out.println("Enter the Month");
		
		Scanner sc=new Scanner(System.in);
		
		int month=sc.nextInt();
		
		if(month==1||month==2)
		{
			System.out.println();
		}
		else if(month==3||month==4||month==5)
		{
			System.out.println("Spring");
		}
		else if(month==7||month==6|month==8)
		{
			System.out.println("Sumemr");
		}
		else if(month==9||month==10||month==11)
		{
		System.out.println("Autumn");	
		}
		//we can also write the if else if without else
//		else
//		{
//			System.out.println("Bogus Month");
//		}
		
	}

}

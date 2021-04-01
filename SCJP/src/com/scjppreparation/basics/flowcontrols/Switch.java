package com.scjppreparation.basics.flowcontrols;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		//if several options are possible then iti is never recommended to use if else
		//go for switch
		
		//this is the syntax of switch
		
		//curly braces are mandatory
		//both case and default are optional

//		switch (key) {
//		case value:
//			statements
//			break;
//
//		case value1:
//			statements 1
//			break;
//		case value2:
//			Statements2
//			break;
//
//
//		default:
//			break;
//		}

		
		//with in the switch every statement must be under a case
		
		//the only permitted values are 
		//byte
		//char
		//integer
		//String
		//short
		//enum
		
//		long l=20;
//		switch(l)
//		{
//		
//		}
		
		
		
		//every case label ust be with in the range of switch arguement type
		//other wise we will get teh compiler time error
		
		
		
		char key=120;
		char ch='c';
		
		//expressionas are allowed for both case and switch labels
		switch (key+56) {
		
		
		//duplication of teh case labels are not allowed
		case 123 +201:
			System.out.println("Char Valur");
			break;

			//here we are taking value larger than char
			//it is showing cokmpiler error
//		case 655367:
//			System.out.println("This is not teh default case");
			
			///every case label must be a compile tuime constant 
			//if we are taking variable as a constant
			
			//note : if we decalre that char ch as final then it will be allowed
			
			//other wise we will get teh compile time error
			//due to sending constant as a value we are getting errror be;ow
			
//		case ch:
//			System.out.println("Gangadhar");
			
			
			//fall through in switch
			
			//with in the case statement in any case is matched then from that case onwards all statements will be executed until break statement
			//or end of the switch
			//callled falll through in switch
			
			
			//we can use the default to define the default actions
			//when none of the above declared cases are matched
			
			//we can declare default in any where in switch
			//but it is recommended to use teh last 
		default:
			System.out.println("This is the default case");
			break;
		}
		
		//this provides an easy way to dispatch execution to different parts of our program
		
System.out.println("Enter the Month");
		
		Scanner sc=new Scanner(System.in);
		
		int month=sc.nextInt();
		switch(month)
		{
		case 1|2|3:
			System.out.println("Winter");
			break;
		case 4|5|6:
			System.out.println("Spring");
			break;
		case 7|8|9:
			System.out.println("Autumn");
			break;
		default:
				System.out.println("Bogus Month");
		}
	}

}

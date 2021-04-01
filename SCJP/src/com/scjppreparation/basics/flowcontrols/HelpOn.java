package com.scjppreparation.basics.flowcontrols;

import java.io.IOException;

public class HelpOn {
public static void main(String[] args) throws IOException {
	
	
	char choice;
	
	do
	{
		System.out.println("1.If Else");
		System.out.println("2.Switch");
		System.out.println("3.While");
		System.out.println("4.Do While");
		System.out.println("5.for");
		choice=(char)System.in.read();
		
	
		
	}while(choice<'1'|choice>'5');
	
	switch(choice)
	{
	
	case 1: System.out.println("If Else");
	break;
	case 2: System.out.println("Switch");
	break;
	case 3: System.out.println("While");
	break;
	case 4: System.out.println("Do While");
	break;
	case 5:
		System.out.println("For");
	break;
	default:System.out.println("Choose between 1 to 5");
	}
}
}

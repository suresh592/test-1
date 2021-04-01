package com.scjppreparation.basics.datatypes;

public class Variables {
	
	//a variabel is a  
	public static void main(String[] args) {
		
		//data type identifier [=value][,identifier =value]....];
		
		//type is h=javas primitive type or a class or interface name
		//identifier is the name of the variable
		
		int a=5,b=6;
		
		double c=Math.sqrt(((a*a) +(b*b)));
		
		System.out.println("hypotenuse is "+c);
		
		
		//teh life time of a variable is confined to its block only
		//variables are created when their scope is enetred
		//variables are destroyed automatically when thier scope is left
		
		
		int x=20;
		int y=30;
		if(x==20)
		{
			y=300;
			System.out.println("The vlaue of X and Y are as follows " + (x+y));
		}
		
	}

}

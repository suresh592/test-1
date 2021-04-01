package com.scjppreparation.basics.operators;

public class Logical {
	
	public static void main(String[] args) {
		
		
		//these are executed same as normal bitwise operators
		//these are mainly used to improve the performance
		
		//for these teh second operand evaluation is operational
		
		//&& ||
		
		//but these are applicable for only boolean data types
		
		//x && y y will be evaluated if when x is true
		
		//x || y y will be evaluated when x is false
		
		
		int x=15;
		int y=25;
		
		if((++x>10)  && (++y<15))
{
	System.out.println("Here Y is incremented");
}
		System.out.println(y);
	}

}

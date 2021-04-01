package com.scjppreparation.basics.flowcontrols;

public class ReutrnConst {
	
	void Strin()
	{
		int x=10;
		if(x==10)
		{
			return;  
		}
		
	}
	public static void main(String[] args) {
		
		
		
		int x=10;
		
		System.out.println("This is before return");
		if(x==10)
		{
			return;  //here teh execution returns to teh java riunn time system main
		}
		System.out.println("This wont be executed");
	}

}

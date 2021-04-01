package com.scjppreparation.basics.oops;

public class DataHiding {
	
	
	
	
	//hiding of teh data so that outside person cannot access our data directly
	//using private keyword we can access data hiding
	
	
	
	private double balance;
	//using data hiding we ca nc achieve security
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("The balance variable is :"+new DataHiding().balance);
	}

}

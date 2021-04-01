package com.scjppreparation.basics.oops;

public class Encapsulation {
	
	
	//encapsulation data and corresponding method behaviour into a singl eunit is called Encapsulation
	//check in the java the complete  reference
	
	//if n ay java class follows data hiding and abstraction
	//then it is called eccapsulated class
	
	//encapsulation  == data hiding + abstraction
	
	
	private double balance;
	private String name;
	private Number applicationId;
	
	
	
	
	
	//hiding data behind the methds is teh central component of encapsulation
	
	//this improves modularity of the application
	
	//enhacement will become very easy
	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Number getApplicationId() {
		return applicationId;
	}



	public void setApplicationId(Number applicationId) {
		this.applicationId = applicationId;
	}



	public static void main(String[] args) {
		
		
		
		
	}

}

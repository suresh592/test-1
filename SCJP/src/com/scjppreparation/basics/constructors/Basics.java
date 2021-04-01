package com.scjppreparation.basics.constructors;

public class Basics {

	//when ever we are creaating an object some piece of the code will be executed automatically 
	//to perform initialization
	
	//this place of code is noting but the constructor
	
	//hence the main objective of teh constructor is to perform initializai=tion for the newly created object
	
	private String name;
	private String address;
	
	
	
	
	


//rules to define a constructor
	
	//name of teh class and the constructor must be matched
	
	//return type concept is not applicable fo rconstructor even void also
	
	//if we declare return type for constructor we will get the compile time error
	
	//teh only applicable modifiers fo rconstructors are 
	//public private protected default
	
	//if we use any other than these we wiull get teh compile time error

	public Basics(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		
		
	
	}

	//we can writw an instanc eblock in a static block
	static
	{
		System.out.println(":This is the static block");
		
		{
			System.out.println("This is the instance in static block");
		}
		
	}

		



	
	//if teh parameterized constructo is there then super class constructor wont be claleld
	public Basics() {
		super();
	
		
		{
			//we cannot write stati cinside constructor
			//static
			
			System.out.println("This is the instanc eblock inside the constructor");
		}
		// TODO Auto-generated constructor stub
	}




	public static void main(String[] args) {
		
		
		//at teh time of object creation if we want to perform initialization of hteinstance variables then we sholud go for
		//constructor
		
		//other than initialization activity if we want to perform any activity then we should go for instanc eblock
		
		//we cannot repoalce instanc eblocks with the constructors because constructors can take arguemtns and inatance 
		//blocks cannot take arguements
		
		//similarly we cannot replace instance blocks with the constructor because a class can contain more than one constructor
		//fi we want to replace instanac eblock in constructor then in every constructor we have to write instance block code
		//because at run time which constructor can be called we cannot expect
		
		Basics b1=new Basics("Sai gangadhar", "Narasannagari Palli");
		Basics b3=new Basics("Himanish Sagar", "Yeshodamma");
		Basics b2=new Basics("Vidya Reddy","Mandapalli");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
	}
}

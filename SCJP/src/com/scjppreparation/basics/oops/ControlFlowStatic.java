package com.scjppreparation.basics.oops;

class Decrilbe 
{
	
	
	//whats teh control flow in case of base and derived classes
	
	static
	{
		m1();  //0
		System.out.println("BSB");  //Fsb
	}
	
	public static void main(String[] args) {
		
		m1();  //20
		System.out.println(" Base Main Method");  //Main Method
	}
	static void m1()
	{
		System.out.println(y);
	}
	static {
		System.out.println("BDB");  //SDB
	}
	static int y=20;

	
}

public class ControlFlowStatic  extends Decrilbe{
	
	
	
	//when ever we are executing a class 
	//first  .class file will be cloaded
	
	//at that time  teh followinf actios will be perrformed automatically
	
	//identification of static members from top to bottom
	
	//execution of static  variabel assignments and static blocks form top to bottom
	
	
	//execution ofmain method
	
	
	//at teh timeof execution
	
	static int x=7890;
	
	
	//at the time of class loading if we want to perform any activity then we have to define that activity inside static v-=blocks
	//because static blocks will be executed at teh time of class loading
	
	//with in the class we can take nay number of static blocks
	//butr these are executed form top to botgtom
	
	
	//first this is executed
	static
	{
		m2();  //0
		System.out.println("DSB");  //Fsb
	}
	
	public static void main(String[] args) {
		
		m2();  //20
		System.out.println("Dain Method");  //Main Method
	}
	static void m2()
	{
		System.out.println(y);
	}
	static {
		System.out.println("DDB");  //SDB
	}
	static int y=20;

	
	
	
	//inthis cse
	
	//identification of staticmembers from parent to child
	
	//execution of stayic variable assignemtnsstaiic blocks from parent to child
	
	//execution of cgild or derived class main methods
	
	//because main method of parent class is over riding in teh child class main mehtod
	
	//when ever we are treying to load the child class automaticall yparent class is loaded to make parent class members available	
	//to the child class
	//hence when ever we are executing the child class rthe following is the flow with respect to static member steps
	
	//identification of static members form parent to child
	
	//execution of static variable assignments and static bloxks from parent tp ochild
	
	//executiojn of only child class main method
	//if the child class main method does not contain automatiuically paren tclasss main method is execurrted
	
	//first base class static blocks are executed
	//then derived class static blocks are executed
	//tehn main class is executed of teh derived class
}



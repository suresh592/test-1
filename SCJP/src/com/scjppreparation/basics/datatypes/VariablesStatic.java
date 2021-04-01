package com.scjppreparation.basics.datatypes;

public class VariablesStatic {
	
	static int number=22;
	
	static String name="Sai Gangadhar";
	
	//value of the variable is not varied form object to object
	
	//we have to declare that type of variables at class level by using the static modifier
	
	//in case of instance s separate copy will be created but in case od static only one copy is maintained at class level and the copy will 
	//be shared by all objects of that class
	
	//created at the time of class loading and  destroyed at teh time of class unloading
	
	
	//these variables stored in method area
	//also know as class vlevel variables or attributes
	
	
	//static variables and methods we can access directlyu form another non static methods
	static void display()
	{
System.out.println("Number is "+number +" and Name is "+name);
}
	
	
	//static vasriables and methods we can access directly from non static methods
	void disp()
	{
		System.out.println(number +"\t" +name);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Without uasing class name");
		//we can acess static vasriables and methods from another static methods directly
		System.out.println(name);
		display();
		
		System.out.println("With class name");
		//we can access static vasriables and method using het class name
		System.out.println(VariablesStatic.number);
		
		VariablesStatic.display();
		
		
		System.out.println("usign reference variable");
		//using reference variable we can acess static vasriables and methods
		VariablesStatic vs=new VariablesStatic();
		System.out.println(vs.number);
		
		
		System.out.println("after making reference variable null");
		vs=null;
		
		//we can access static variables and methods after making object reference to null

		vs.display();
		
		
		
		
	}

}

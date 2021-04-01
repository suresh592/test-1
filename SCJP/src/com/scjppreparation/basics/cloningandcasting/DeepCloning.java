package com.scjppreparation.basics.cloningandcasting;

public class DeepCloning {

	//Cloned objects and source objects are completely independent of each other.
	
	//Changes made in the cloned instance will not impact the reference variable of the source object.
	
	//To create deep copy we need to override the clone method of Object class.
	
	//A deep copy is preferred if the object’s class variables have references to other objects as fields.
	
	public static void main(String[] args) {
		
		
		System.out.println("This shallow copy belongs to the Department and the Employee class");
		
		Department dept=new  Department("8066322", "9", "Associate Engineerr");
		
		Employee emp=new Employee("Sai gangadhar", "8066322", dept);
		
		//creating a clone og f the employee and assigning it to the another employee object
		
		Employee emp1=null;
		try
		{
			//here emp is assigned to emp1 Obkejct
			emp1=(Employee) emp.clone();
		}
		
		catch(CloneNotSupportedException exception)
		{
			System.out.println(exception);
		}
		
		System.out.println(emp);
		System.out.println(emp1);
		
		//here we are making changes to teh obejct emp
		
		//
		emp.name="Vidya Reddy";
		dept.designation="Chief Exefcutive Officer";
		//but due to deep cloning  what ever teh changes made to teh obejct emp are not reflecting in the emp1 object 
		System.out.println(emp);
		System.out.println(emp1);
		
		
	}
}

package com.scjppreparation.basics.cloningandcasting;



public class ShallowCloning {
	
	//Cloned object and source object are not disjoint completely
	
	//changes made in the cloned instance will impact the reference variable of the source object
	
	//The default version of the clone is the shallow copy
	
	// 	Shallow copy is preferred if class variables of the object are only primitive type as fields
	
	//its is relatively fast
	
	
	public static void main(String[] args) {
		
		
		System.out.println("This is belongs to the student and class");
	Student st=new Student("56","Sai gangadhar");
	
	st.display();
	
	Student st2=st;
	
	
	st2.display();
	
	st.name="Vidya Reddy M";
	
	st.display();
	st2.display();
	
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
	//but due to shallow cloning  what ever teh changes made to teh obejct emp are reflecting in the emp1 object as well
	System.out.println(emp);
	System.out.println(emp1);
	
		
	}

}

package com.scjppreparation.basics.cloningandcasting;

public class Employee implements Cloneable {
	
	String name;
	String id;
	Department dept;
	
	
	public Employee(String name, String id, Department dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	//this is the default version of clone method 
	//allows us to create shallow copy of the object

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
	
	//this is the deep copy of the method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee emp=(Employee) super.clone();
	emp.dept=(Department) dept.clone();
		return emp;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}

	
	
	
	
	
	
	
	

}

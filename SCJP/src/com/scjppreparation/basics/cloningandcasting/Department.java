package com.scjppreparation.basics.cloningandcasting;

public class Department implements Cloneable{
	
	String empId;
	String grade;
	String designation;
	public Department(String empId, String grade, String designation) {
		super();
		this.empId = empId;
		this.grade = grade;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Department [empId=" + empId + ", grade=" + grade + ", designation=" + designation + "]";
	}
	
	
	 protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	
	

}

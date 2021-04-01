package com.scjppreparation.basics.collecfwset;

import java.util.Comparator;
import java.util.TreeSet;

class EmpSalary implements Comparable

{

	double salary;
	String name;
	
	
	public EmpSalary(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Salary "+salary+" Name "+name;
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double salary =this.salary;
		
		EmpSalary es=(EmpSalary) o;
		
		double salary2=es.salary;
		
		
		if(salary<salary2)
		{
			return -1;
		}
		else if(salary>salary2)
		{
			return 1;
		}
		else if(salary==salary2)
		{
			String name=this.name;
			EmpSalary ess=(EmpSalary) o;
			String name2=ess.name;
			return name.compareTo(name2);
		}
		return 0;
		
		
		
	}
	
	
	
}


public class EmpComparableNdComparator {

	public static void main(String[] args) {
		
		EmpSalary e=new EmpSalary(1245.456, "Sai Gangadhar");
		
		EmpSalary e1=new  EmpSalary(120.456, "Yeshodamma");
		
		EmpSalary e2=new EmpSalary(456789.456, "Leader");
		
		EmpSalary e3=new EmpSalary(456.12, "Vidya Reddy");
		
		EmpSalary e4=new EmpSalary(456.12, "Ranith Raju");
		
		TreeSet tr=new TreeSet();
		
		tr.add(e);
		
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		
		System.out.println("Using Comparable");
		System.out.println(tr);
		
TreeSet tr1=new TreeSet(new Comppp());
		
		tr1.add(e);
		
		tr1.add(e1);
		tr1.add(e2);
		tr1.add(e3);
		tr1.add(e4);
		System.out.println("Using Comparator");
		System.out.println(tr1);
	}
	
}

class Comppp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		
		EmpSalary emp=(EmpSalary) o1;
		
		EmpSalary emp1=(EmpSalary) o2;
		
		
		double salary=emp.salary;
		double salary1=emp1.salary;
		
		if(salary<salary1)
		{
			return 1;
		}
		else if(salary>salary1)
		{
			return -1;
		}
		else if(salary==salary1)
		{
			String name=emp.name;
			
			String name2=emp1.name;
			return name2.compareTo(name);
		}
		return 0;
		
	}
	
}

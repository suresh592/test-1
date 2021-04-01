package com.scjppreparation.basics.collecfwset;

import java.util.Comparator;
import java.util.TreeSet;

class 	Employee implements Comparable
{
	
int sno;
	
	
	public Employee(int sno) {
		super();
		this.sno = sno;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp "+sno;
	}

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
	
		int eid1=this.sno;
		
		Employee emp=(Employee) o;
		
		int eid2=emp.sno;
		
		if(eid1<eid2)
		{
			return -1;
			
		}
		else if(eid1>eid2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}

public class EmployeeComparable { 

	int sno;
	
	
	


	public EmployeeComparable(int sno) {
		super();
		this.sno = sno;
	}





	public static void main(String[] args) {
		
		Employee emp=new Employee(516);

		Employee emp2=new Employee(571);
		
		Employee emp3=new Employee(567);
		
		Employee emp4=new Employee(589);
		
		Employee emp5=new Employee(501);
		
		Employee emp6=new Employee(534);
		
		
		TreeSet  tr=new TreeSet();
		
		tr.add(emp);
		
		tr.add(emp2);
		
		tr.add(emp3);
		
		tr.add(emp4);		
		tr.add(emp5);
		
		tr.add(emp6);
		
		System.out.println("This is wiht respect to the Comparable Object");
		
		System.out.println(tr);
		
		
		System.out.println("This is with respect to teh Comparator Object");
		
		TreeSet tr2=new TreeSet(new MyComparatorr());
		
        tr2.add(emp);
		
		tr2.add(emp2);
		
		tr2.add(emp3);
		
		tr2.add(emp4);		
		tr2.add(emp5);
		
		tr2.add(emp6);
		
		System.out.println(tr2);
	}

	
	
}


class MyComparatorr implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee emp=(Employee) o1;

		Employee emp2=(Employee) o2;
		
		
		return emp2.compareTo(emp);
		
	}
	
}

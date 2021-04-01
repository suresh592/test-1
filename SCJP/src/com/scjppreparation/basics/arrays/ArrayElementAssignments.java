package com.scjppreparation.basics.arrays;

public class ArrayElementAssignments {

	public static void main(String[] args) {
		//for trh primitive type arrays as array elements we can provide any primitive type 
		//which is automatically type converted
		//any type which is implicitly promoted to teh required rype
		
		int[] a=new int[5];
		
		a[0]=21;
		a[1]='c';
		byte b=3;
		a[2]=b;
		short s=34;
		a[3]=s;
			long l=561134;
			a[4]=(int) l;
			
			
			//in the case of object type array elements then we can provide either the declared type or its child class elements
			
			Number[] num=new Number[5];
			
			num[0]=new Float(5);
			num[1]=new Integer(10);
			
			//hwere we will get teh compiler error
			//num[2]=new String("Sai");
			
			Object[] aa= new Object[5];
			aa[0]=new Float(5);
			aa[1]=new Integer(10);

			aa[2]=new String("Sai");
			for(Object nn:aa)
			{
				System.out.println(nn);
			}
			
			//in teh case of interface type array we can only porovide the implementation or child classes as the array obejcts 
	       
			Runnable[] ee= new Runnable[5];
			ee[0]=new Thread();
			
			//for abstract class type arrays only child class types are allowed
			//for interfaces its implemeted l=class objects only are allowed
	}
	
}

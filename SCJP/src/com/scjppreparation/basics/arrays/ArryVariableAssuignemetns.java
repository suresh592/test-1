package com.scjppreparation.basics.arrays;

public class ArryVariableAssuignemetns {

	public static void main(String[] args) {
		
		
		//Element level promotions are not applicable at teh array level
		
		int[] a= {1,2,3,4};
		
		byte[] b= {1,2,3,4};
		
		//not allowed at array level
		//a=b;
		
		int[] c= {1,2,3,4};
		
		
		//these are allowed if they are of the same type
		a=c;
		
		//we can simply assign parent type array to the child type array
		
		String [] ser= {"Sai","Gangadhar","Kotte","Kodandagari"
		};
		
		Object[] obj=ser;
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
		
		
		//when ever we are performing array assignemtns the dimensions must be matched 
		//other wise we willl get the error
		
		
	}
}

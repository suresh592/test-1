package com.scjppreparation.basics.arrays;



public class ArrayDeclarations {

	
	//teh general form of array declaration is 
	
	// type[]  variabl ename
	
	//type [] variable name=new type[size of array]
	
	int[][] a;
	int [][]b;
	
	int d[][];
	
	int[] e[];
	int []f[];
	int[] []h;
	
	
	
	
	
	//same for three dimensional array also we can declare anything we want ads above
	public static void main(String[] args) {
		
		
		//we can declare like below alsoo
		
		
		int[] a,b; //a 1& b 1
		
		int[] []c,d; //c 2 and d 1
		
		int [] []e,f[]; //e 2 and f 3
		
		// thw below is th wewrog declaration
		
		//int [] []e,[]f;
		//before the second variable we cannot specify teh size
		//it shows the compiler error
		//int [] []h,[]g;
		
	
		int[] month_days;
		month_days =new int[12];
		
		month_days[0]=31;
		month_days[1]=29;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=31;
		month_days[5]=30;
		month_days[6]=31;
		month_days[7]=30;
		month_days[8]=31;
		month_days[9]=30;
		month_days[10]=30;
		month_days[11]=31;
		
		
		System.out.println("Days in the February are "+month_days[1] );
		
		
		System.out.println("Average of eht array Values");
		
		int sum=0;
		for(int j:month_days)
		{
			
			sum=sum+j;
		}
		
		System.out.println("Average days per month in a year is :"+sum/12);
	}
}
	
	

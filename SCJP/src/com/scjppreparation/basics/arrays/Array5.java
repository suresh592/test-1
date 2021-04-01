package com.scjppreparation.basics.arrays;

public class Array5 {
	
	String str[]= {"Sai","Gangadhar","Yeshodamma","Vidya"};
	
	
	//we can also declares teh variables like this
	int arr_name[][] = new int[][]  {
        new int[] {10, 20, 30 ,40},
        new int[] {50, 60, 70, 80, 90, 100},
        new int[] {110, 120}
            };
            
                                                      
                               
int[][] arr_names = {
new int[] {10, 20, 30 ,40},
new int[] {50, 60, 70, 80, 90, 100},
new int[] {110, 120}
    };
	
	public static void main(String[] args) {
	
		
		//arrays using user defined data type
		Array5[] ar=new Array5[5];
		Array5 srr=new Array5();
		System.out.println(ar);
		
		//we can assign a array value to a reference of the array
		ar[0]=new Array5();
		for(int i=0;i<ar[0].str.length;i++)
			System.out.println(ar[0].str[i]);
		
		
		for(int i=0;i<ar.length;i++)
		
		{
			if(ar[i]!=null)
			{
				for(int j=0;j<ar[0].str.length;j++)
				{
					System.out.println(ar[i].str[j]);
				}
			}
		}
	}

}

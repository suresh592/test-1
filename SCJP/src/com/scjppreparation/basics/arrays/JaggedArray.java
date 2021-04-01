package com.scjppreparation.basics.arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
		
		

        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];
 
        // Making the above array Jagged
 
        // First row has 3 columns
        arr[0] = new int[3];
 
        // Second row has 2 columns
        arr[1] = new int[2];
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr.length);
        	for(int j=0;j<arr[i].length;j++)
        	{
        		System.out.println(arr[i].length);
        		arr[i][j] = count++;
        	}
        }
        System.out.println("The contents in the Jagged Array are");
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++ ) {
        	System.out.print(arr[i][j]);	
        	}
        	System.out.println();
        	}
		
	}

}

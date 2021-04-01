package com.scjppreparation.basics.flowcontrols;

public class ForEach {

	public static void main(String[] args) {


		//this is the most convenient to retrieve the elements of arrrays and collections

		//syntax

		//for( type var:reference variable)
		//{
		//sout(var)
		//


		int[][] a= {{10,20,30},{20,30,40}};

		//normal for loop

		System.out.println("using Normal for loop");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Using enhanced for loop");

		for(int[] b:a)
		{
			for(int y:b)
			{
				System.out.println(y);
			}
		}

	}
}

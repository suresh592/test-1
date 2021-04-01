package com.scjppreparation.basics.arrays;

import java.util.Scanner;

public class StudArray {
	String name;
	String address;
	
	static void displayDetails(StudArray []st)
	{
		if(st!=null)
		{
		for(StudArray jer:st)
		{
			System.out.println("Name is :"+jer.name+" Address is :"+jer.address);
		}
		}
		else
		{
			System.out.println("Student Data Not Found");
		}
	}
	
	public static void main(String[] args) {
		
		//this program is in note book
		Scanner sc=new Scanner(System.in);
		
		
	}

}

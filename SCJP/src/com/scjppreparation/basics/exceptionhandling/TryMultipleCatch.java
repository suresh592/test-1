package com.scjppreparation.basics.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;

public class TryMultipleCatch {

	public static void main(String[] args) {
		
		//teh way of handling exception is varied form exception to exception hence for every excpetion it is recommeneded to  take
		
		//separate catch block
		
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//the aboveway is not recommded to use
		
		
		
//		
//		try {
//			File F=new File("Saoi.txt");
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//this approach is highly recommene=ded to use	
		
		//hence try with multiple catch blocks is high possible and highly recommended to use
		
		//if try with multiple catch block present 	then teh order of catch blocks is very important and it chould be from
		
		//child to parent
		
		//if we are taking from parent to child then we will get compile time error saying exception xxx has already been caught
		
		
		
		try {
		
			System.out.println(10/0);
			} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
				System.out.println(e.toString());
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		TryMultipleCatch tm;
		
		
	}
}

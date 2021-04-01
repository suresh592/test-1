package com.scjppreparation.basics.collectionsarrays;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {

	//COnverting arrays to List
	
	//Public stayic List asList(Object[] a)
	
	//by using the above methods we are not creating an independent List Obejct  just we are creating list view for existing array Obejct
	
	//by using the list reference if we perform any operation the change swill be reflecterd to teh array reference
	
	//similarly by using the array reference if we perfrom any chages  those chanes will be reflected to eh list
	
	//by using the list we cant perform any operation which varies the size	that is by adding or removing other wise wee will get 
	
	//run time exception saying unsupported operation exception(USOE)
	
	//by using list refernce we can perform replacement operation but replacement should be with teh same type of elementonly  
	//other wise we will get run time exception saying  Array Store Exception
 	public static void main(String[] args) {
		
 		
 		String[] s= {"Sai","HImanush","Harika And hjassine","Dev","Root","Vishnu","Cheri"};
 		List<String> l=Arrays.asList(s);
 		
 		System.out.println(l);
 		
 		//performing change to List
 		
 		//if we do this it throws unsuppoerted operation exception
 		//l.add("Leader");
 		
 		s[2]="Harika And Hassine";
 		
 		l.set(1, "Himanush");
 		
 		System.out.println(l);
 		
 		
 		//we cannot remove the array element
 		//we will ge t unsupported operation exception
 		//l.remove(2);
 		
 		//l.set(1, 456789.456);
 		System.out.println(l);
		
		
	}
}

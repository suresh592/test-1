package com.scjppreparation.basics.collecfwlist;

public class Basics {

	
	//An array is an indexed collection of homogenious elements
	
	
	//limitations
	//Thesse are fizxed insize
	//that is once we create an array therer is no chance of increasing or decreasing the size based on our requirement
	//hence to use array sconcept we must know the array size in advance
	
	//these arrays can hold only homogenious types of data only
	
	//but we can resoove this n=bhy using object type arrays
	
	//Object [] a=new Object[1000];
	
	//a[0]=new Stduent();
	//a[1]=new customer();
	
	//arrays concepts are not build based on teh data structure hence predefined method support isnot available
	//for every requirement programmer is responsibel to write teh logic
	
	//to resolve above problems sun people introduced collections
	
	
	public static void main(String[] args) {
		
		//Advantages of collections over Arrays
		
		//tehse are growable in nature
		//we can increase or decrease size based on our requiremtn
		
		//these can hold both homogenious and heterogenious data
		
		//every collection class is implemented based on some data structure
		
		//hence predefined method support is available
		
		//memory point of view arrays is not recommended
		
		//performance point of view arrays are highly recommended
		
		//Array scan be used to hold both primitive and Objects
		
		//but collections can be used to hold only objects but not for primitive data types
		
		
		
		//collection
		
		//to represent a groiup of objects into a single entity is called collections
		
		//Collection Framework
		
		//it defines several classes and interfaces which can be used to represent a group of objects as a single entity
		
		
		
		//9 key interfaces of collection Framework
		
		
		
		//**** 
		//collection
		//if we want to represnt a group of individual objects as a single entity then we should go for collection
		//this is considered as teh root interface for teh collection framework
		//this defines the  most commom mmethods applicable for any object
		
		
		//collection vs collections
		
		//collection is an interface can be used to represent a group of individual objects as a single entity
		
		//collections is a urility class present in java.util package to define several utility methodsfor collecions
		
		
		
		// **** List
		
		//the child interface of collection
		//if we wan tto represent a group of individual objects  wheere insertion order ispreserved and dupliicatesa re allowed
		//then we should go for list
		
		
		
		
		//*************** set
		
		//this is hte child interface of collections
		
		//if we want to erpresent a group of indivial objects where duplicatesa are not allowed an insertion order is 
		//not preserved then we will go for set
		
		
		
		
		// ***************sorted set
		
		//this is teh child interface of set
		
		//if we want to represent a group of individual objects according to some  sorting order then we shoul go for set
		
		
		// *   ***************** Navigable set
		
		//this is the child interface of sorted set  to provide several methods for navigation purpose
		
		
		
		//* *********************  Queue
		
		//this is the child interface of collection
		//if we want to represent a group of individual objects prior to processing then we should go for Queue
		
		
		
		//NOte  :
		
		//All the above interfaces like Collection, List, Set, Sorted Set, Navigalbe Set, Queue are meant to represent a 
		//group of individual objects
		
		
		//If we want ro represent a group of individual objects as key value pairs then we should go for
		//Maps
		
		
		
		//********************    MAP        **********************
		
		//if we want to represent a group of individual objects as ky value pairs then we should go for map	
		//Both the key and value are objects only
		//duplicate keys are not allowed biut duplicate values are allowed
		//\
		//Map is not the child interface of collection
		
		
		
		//**************** sorted Map *****************
		
		//if we want to represent a group of objects as key value pairs according to some sorting order
		//then we shoul go for sorted map
		//child ointerfac eof map
		
		
		//Navigable map
		//the child interfac eo f sorted map and defines several merthods for navoigation purpose
	}
}

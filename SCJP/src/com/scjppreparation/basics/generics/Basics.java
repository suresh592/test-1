package com.scjppreparation.basics.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Basics {

	//Arrays are always safe with respect to type
	
	//for example if our programmer requirement is to add only String objects[] then we will go for String[] array.
	
	//for this array we can add onlyl String type of obejctws, by mistake if we are going to add any other type of elelemt
	
	//we will get the compile time error
	
	//hence in the case of array we can always give teh guarantee about the type of elements. String[] array only
	
	void strArray()
	{
		String[] s=new String[5];
		s[0]="Sai";
		s[1]="Raju";
		
		//we cannnot add like this hence Arrays are type safe
		//s[2]=489;
		}
	//contains string[] obectjsaue to this arrays are always safe to use with respect to type
	
	//but the collections are not safe with respect to type 
	
	//example if our programmer requirement is to hold only string objects  and if we are using the array list by mistake if we are 
	//trying to add  any other type to teh array list we wont get any compiler error but the program may fail at tun time
	
	//there is no guarantee that collecion canhold a particular type of objects. hence withrespect to collections are not safe to use
	
	
	void Liss()
	{
		ArrayList al=new ArrayList();
		al.add("Saai");
		
		al.add("Razhorb");
		
		//we can add like this no prtoblem arises
		al.add(123456);
	}
	//inthe case of arrays while performing retrieval it is not required to perfrom type casting
	
	//but in the case of collections compulsory we should perform tpe casting other wise we  will get compile time error
	
	
	//Hence in tehcase of Collections it is a big headche to teh progemmaer to perfrom type caasting
	
	//to over come teh above problems of collecions type casting and type safe  the sun people introduced generics in 1.5 veriosn
	
	
	//the main object=ives of generics concepts are :
	
	// **  to provide type safety to teh collecions. so that they can hold a particular type of objects only	
	// * to resolve type casting problems
	
	//for exam ple to hold values of only string tyhp ein an array list
	
	//AArrayList<String> al =new ArrayList<String>
	
	//for the above array list we can add only String type of objects by  mistake if we are trying to add any on=ther types we will 
	
	//get teh compiler error 	that is we are getting type safety here
	
	//at teh time of reteieval it is not required to perfrom type casting
	
	
	//Conclusion  :
	//usuage of parent class reference to hold child class object is considered as polymorphism\
	
	//polymorphism is onlyapplicable for base type but not for parameter type
	
	//ArrayList<Integer> in=new Arraylist<Integer>   true
	
	//List<Integer> in=new Arraylist<Integer>   true 
	
	//Colelction<Integer> in=new Arraylist<Integer>   true
	
	
	//List<Obejct> in=new Arraylist<Integer>   false
	
	//here abse type is the class names like arraylist colelction list etc...
	
	//parameter type is Integer, Object etc... 
	
	//polymorphism concept is not applicable for the parameter rypes
	
	//conclusion 1:
	
	//for the parameter type can only use class or interface names but not the primitive types
	//wif we use primitive types it leads to voilation which leads to cimpile time error
	
	//ArrayList<int> in=new arrayList<int>  error
	
	
	//Generic classes
	
	//until 1.4 q anon generic version of array list class is defined as follows
	
	//class ArrayList
//	{
//		add(Object o)
//		Object get(int index)
//	}
	
	//the arguement to the add method id object	
	//hence we can add any type of object  due to this we are not getting type safety
	
	//the return type of get method is ibject hence at the retrieval compuolsory we should perfrom type casting
	
	//but in 1.5 version a generic type of arraylist version is produced
	
//	class ArrayList<T>
//	{
//		add(<T t>);
//		T get(int index)
//	}
	
	
//based on our run time requirement type parameter t will be replaced with teh correspondung provided tyep
	
	//for example to hold only strign type of object we have to create generic version of arraylist obejct as follows
	
//	ArrayList<String> al=new ArrayList<String>()
	
//	for this requirement the corresponding loaded version of arraylist
//	
//	class ArrayList<String>
//	{
//		add(String s);
//		
//		String get(int index)
//	}

	//Add method can take String as the arguemente 
	
	//hence we can add only String type of objects 
	//by mistake if we are trying to add any other type of obejcts  we will get the compiler error
	
	//that is we are getting the type safety
	
	//the return type of get method is String hence at the time of retrieval we can assign dorectly to teh String type variable
	
	//it is not required to perfrom type casting
	
	//we can pass nay  number of parameters but need not to be once
	
//	HashMap<String, Integer> hm=new HashMap<String, Integer>()
	
	//through generics we are associating a type parameter  to the classes . duch type of parameterized classes are called Generic Classes
	
	
	//we can define our own generic classes also	
	public static void main(String[] args) {
		
		
		
		Gen<String> g=new Gen<String>("Sai Gangadhar K");
		
		g.show();
		
	
		System.out.println(g.getOb());
		
		
		Gen<Integer> i=new Gen<Integer>(25689);
		i.show();
		System.out.println(i.getOb());
	}
}

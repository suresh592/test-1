package com.scjppreparation.basics.mainandcmdargs;


//# include 
//all teh specified header files are loaded at the time of include statement only ireespective of
//whether we are using those header files or not 	
//this is callled static binding


//import

//but in the case of Java language using import statement no .class file is loaded at the time of import statement
//in the next lines of code whenever we are using a classat teh time only the corresponding .class file will be loaded
//called dynamic binding or bad on demand or load on fly

//instgead of using import we can also  use the fully qualified name

//order of import execution

//explicit class import
//classes prersent in current working dorectory
//implicit class


//explicit class import

//import java.util.arraylist

//implicit import
//java.util.*;


//static import is there
//usually we cannot use class name if we can done teh static imports

public class StduentBean {

	
	//a java bean ius a simple class with private properrpities and 
	//public getter and setter methods
	
	private String name;
	private String id;
	
	
	//setter methods should prefix with set
//	/compulsory this method should takes some arguement
	//return type should be void
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	
	//the method name should prefix with get
	//it should be no ARGUEMENT method
	//return typoe must be the type of teh argument and this must not be void
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	//for boolean properities the getter method can be prefixed with either get or its recommended with is
	
	private  boolean isTrue;
	
	public boolean getIsTrue()
	{
		return isTrue;
	}
	public boolean isIsTrue()
	{
		return isTrue;
	}
	
	public static void main(String[] args) {
	
	}
	
	
}

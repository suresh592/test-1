package com.scjppreparation.basics.langpackage;

public class ToString {

	
	//we can use this method to find the Strin representation of the object
	
	//when ever we are tryign to print any object reference internally toString() method is called and executed
	
	
	String name;
	
	int rollNum;

	public ToString(String name, int rollNum) {
		super();
		this.name = name;
		this.rollNum = rollNum;
	}
	
	public static void main(String[] args) {
		
		
		ToString ts=new ToString("Sai Gangadhar", 546987);
		
		ToString t=new ToString("Saai", 541639);
		
		System.out.println(ts);   //herre internally     ts.toString() is called
		
		System.out.println(t);
		
		
		//in the above case Object class toString() method got executed which is implemented as follows
		
		//return getClass().getName()+"@"+Integer.toHexString(hashCode());
		
		
		//class name@hexa decimal String reparesentation of hash code
		
		
		//to provide our own representation we have to over ride to String() in our class which is high ly recommended
		
		//when ever we are tryign to print Student object referencce to return his name and roll number we have to over ride toString as follows
	}
	//when ever we are tryign to print Student object referencce to return his name and roll number we have to over ride toString as follows
	
	public String toString()
	{
		return  "Name is "+name+"\t"+"Roll Number"+rollNum; 
		
	}
	
	
	//in the String, String buffer and in all wrapper classes toString() method is over ridden to return proper String format. hence it is 
	
	//highly recommended to over ride toStrign() method in our own class also.
}

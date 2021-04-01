package com.scjppreparation.basics.exceptionhandling;


class TooYoung extends RuntimeException
{
	
	String mesage;

	public TooYoung(String mesage) {
		super();
		this.mesage = mesage;
	}
	
	
	
	
	
	
}

class TooOld extends RuntimeException
{
	String message;

	public TooOld(String message) {
		super();
		this.message = message;
	}
	
	
	
	
}
public class CustomizedExceptions {
	
	//to meet our programming requirement some times we have to create our own excpetions
	
	//such type of exceptions are called customized exceptions
	
	public static void main(String[] args) throws TooOld, TooYoung {
		
		
	int age=25;
	
	if(age>60)
	{
		throw new TooOld("You are too old to Marry");
	}
	else if(age<18)
	{
		throw new TooYoung("You are too young to marry");
	}
	else

	{
		System.out.println("YOu can Marry NO Problem");
	}
		
	
	//it ishigh ly recommended to keep our customized exception class as uncheked 
	
	//that is we have to extends run time exception class but not exception class while defining
	
	//our customized excepions
		
	}

}

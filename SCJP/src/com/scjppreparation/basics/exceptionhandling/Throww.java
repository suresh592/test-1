package com.scjppreparation.basics.exceptionhandling;

public class Throww {

	//some times we can create the excpetion obejct manually and and hand over that object to JVM  explicitly  by using throw 
	
	//key word
	
	//throw new ArithExcpetion("/ by Zero");
	

	//thriw  to hand over exception object to JVM manually 
	
	//creation of new Arithmetic object is done by AE
	
	
	static ArithmeticException ee=new ArithmeticException();
	
	public static void main(String[] args) {
		
		//hence the main purpose of throwa key word is to hand over the created exception object manuallyto JVm
		
		//the result of the following two programs is same
		
//		try
//		{
//			System.out.println(10/0);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//in this case exception object created internally and hsnd over that object automaticallyto JVm
		
		
		//in the below case we are creating the arithmetic exceptionobject explicitly and we hand over it to jvm manually by using throw key word	
		
		//throw new ArithmeticException("/ by Zero");
		
		//in general we can use throw key word for customized exceptions
		
		//if we are trying to throw null refernce then we will get null pointer exception
		
		
		
		throw ee;
		
		//after throw stateemtn we are not allowed to write any statemetn other wise we will get compile time error saying 
		
		//unreachable statement
		
		//System.out.println(""Hiii This i s inreachable statement);
		
		//we can use throw key word fpor only throwable types other wise we will get compile time error saying incompatible types
		
		//we cannot throw for nnormal class we can use only child classes of throwable
		
		
	}
}

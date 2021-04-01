package com.scjppreparation.basics.exceptionhandling;

public class TryCatch {

	
	//we will maintain the risky code in the try block and corresponding hanf=dling code int teh catch block
	
	public static void main(String[] args) {
		
		System.out.println("State 1");
		
		try
		{
			System.out.println(10/0);
			System.out.println("These does not eexecuted I Thinks");
		}
		//There are not statemets between try and catch other wise we wioll get error
		//System.out.println("he;lo0");
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.getMessage();
		}
		System.out.println("State 2");
		
	}
	
	
	//controil flow in try catch
	
//	try
//	{
//		stmt 1
//		stmt2
//		stmt3
//	}
	
//	catch()
//	{
//		stnt 4
//	}
//	stmt5
	
	//if there is no excpetion in 1,2,3,5 there is normal termination
	
	//if exeption raised in statement 2 and correspomding catch block is matched then 1,4,5 is executed
	
	
	//if an excpetion raised at statement 2 and corresponding catch is not matched then 1, followed by abnormal termination
	
	//if an exception raised at statement 4 or 5 then it is always an abnormal termination
	
	//NOte
	
	//with in the try block if any where the exception raised then rest of the try block wont be executed  even though we handle ex.
	
	//hence it is recommended to take only the risky code in the try block and length of the try block should be as less as possible
	
	//if an exception raised at any statement which is not part of teh try then it is always abnormal termination
	
	
}



package com.scjppreparation.basics.exceptionhandling;

public class Combinations {



	void b()
	{
		
		//possible
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//possible
		try {
			
		} finally {
			// TODO: handle finally clause
		}
		
		
		//only try is not possible;
		
//		try
//		{
//			
//		}
		
		//on;ly catch is not posible
		
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//only finally is not possible
		
//		finally
//		{
//			
//		}
	}
	
	
	void a()
	{
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Hello");
		
		//if we decalre this we will get error
		
		///catch without try is not possible
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		
try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Hello");
		//try without finally is not possible
		
//		finally {
//			
//		}
		
		
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
		
		//two consecutive finally blocks are not possible 
		//if we do like this we will get error
//		finally {
//			
//		}
		
		
		//but we can take two try blocks 
		
try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
	}
	
	
	
	






void c()
{
	

	try {
		
	} catch (Exception e) {
		// TODO: handle exception
		
		
		try {
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	
	
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	finally {
		try {
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		try {
			
			
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
}


public static void main(String[] args) {
	
	
	
	//control flow in try catch finally blocks
	
//	
//	try
//	{
//		1
//		2
//		3
//		
//	}
//	
//	catch (Exception e) {
//		// TODO: handle exception
//		4
//	}
//	
//	finally {
//		5
//	}
//	6
	
	////if there is no excpetion 1,2,3,5,6, normal termination
	
	//if an exception raised at statemet 2 and corresponding catch bolxk matched  
	//1,4,5,6
	
	//if an exception raised at statemet 2 and corresponding catch block is not matched then
	
	//1, 5 with abnoraml termination
	
	
	//if an exception raised at statemnt 4 then this is always an abnormal termination but before finally is executed	
	
	//if an excpetion raised at statemt 5 or 6 then it is always an abnornal termination
	
	
	
	
	//cnotrol Flow in nested try catch finally blocks
	
//	
//	try
//	{
//		1
//		2
//		3
	
//	
//	try
//	{
//		4
//		5
//		6
//		
//	}
//	
//	catch (Exception e) {
//		// TODO: handle exception
//		7
//	}
//	
//	finally {
//		8
//	}
//	9
//		
//	}
//	
//	catch (Exception e) {
//		// TODO: handle exception
//		10
//	}
//	
//	finally {
//		11
//	}
//	12
	
	
	//if there is no excpetion it is always an normal termination with
	
	//1,2,3,4,5,6,8,9,11,12
	
	//if an excpetion raised at statement 2 then corresponding catch block is matched  1,10,11,12 with normal termination
	
	//if an excpetion is raised at statement 2 and corresponding catch is not matched then 1, 11 with abnoraml termination
	
	//if an excpetion raised at 5 and corresponding innner catch is matched
	
	//1,2,3,4,7,8,9,11,12 executed with normal termination
	
	//if an excpetion raised at 5 and corresponding innner catch is not matched and outer catch is matched then
	
		//1,2,3,4,8,10,11,12 executed with normal termination
	
	//if an excpetion raised at 5 and corresponding innner and outer catch is not matched  matched
	
		//1,2,3,4,8,11 executed with abnormal termination
	
	
	
	
	//if an excpetion raised at 8 an d corresponding catch is matched then, 
	//1,2,3,4,5,6,7,8,9,10,11,12 normal termination
	
	
	//last 8 cases are doubtful praftice well
}
}

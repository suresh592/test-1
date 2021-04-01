package com.scjppreparation.basics.enumerationenum;


//if we decalre enum outside the class the applicabel modifiers are public default strictFp


public enum Month {

	Jan, Feb, Mar, Apr, May, June, July, Aug, Sep, Oct, Nov, Dec;
	
	public static void main(String[] args) {
		
		
		Month m1=Month.Feb;
		
		System.out.println(m1);
		
		
		//we can decalre enum with in the class or outside the class but not inside the method
		
		//if we are trying to decalre enum with in the method  we will get compile time error
		
	}
	
}

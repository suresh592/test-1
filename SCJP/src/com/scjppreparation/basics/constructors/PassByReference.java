package com.scjppreparation.basics.constructors;

public class PassByReference {
	
	void fun(PassByReference pass)
	{
		System.out.println(pass);
	}
	
	
	public static void main(String[] args) {
		
		
		PassByReference pa=new PassByReference();
		pa.fun(null);
		pa.fun(new PassByReference());
		pa.fun(pa);
	}

}

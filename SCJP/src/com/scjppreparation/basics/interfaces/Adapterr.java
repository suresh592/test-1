package com.scjppreparation.basics.interfaces;


interface zzz
{
	
	void m2();
	
}

abstract class Adapter  implements zzz
{
	
}
public class Adapterr extends Adapter {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
		System.out.println("Thisis the inetrface methods");
		
	}
	
	
	public static void main(String[] args) {
		
		zzz zz=new zzz() {
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("This is inside the interface pobject");
			}
		};
		
		zz.m2();
	}
	//this is a simple java class that inmplements an interface , an interface wiht the empty implementation


	//we are talking about the implementation completely and ready to provide sericds --class
	//we don tknow any thing about implementation and just we have specification then we should go for --- interface
	//we are talking about ijmplementation but not complpetely  --- abstract class
		
	
	
}

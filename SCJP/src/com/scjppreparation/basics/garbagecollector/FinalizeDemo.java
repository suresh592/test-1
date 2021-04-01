package com.scjppreparation.basics.garbagecollector;

public class FinalizeDemo {

	static FinalizeDemo aa;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		FinalizeDemo f=new FinalizeDemo();
		
		System.out.println(f.hashCode());
		
		f=null;
		
		System.gc();
		Thread.sleep(3000);
		System.out.println(aa.hashCode());
		
		aa=null;
		
		
		System.gc();
		
		Thread.sleep(3000);
		System.out.println("End of the main");
	}
	
	public void finalize()
	{
		System.out.println("Finalize method called");
		
		aa=this;
	}
	
	
	//the behavoiur of gc is vendor dependant and we cannot expec th eorder  because
	
	//when teh jvm runs gc exactly
	
	//algorithmfollowed by gc
	
	//in which order gc destroys the obejcts
	
	//whether gc destroys all elogible objects or not
	
	
	//we cannot tell the exact algorithm followed by gc but mostly it is mark and sweep algorithm	
	
	
	
	
}

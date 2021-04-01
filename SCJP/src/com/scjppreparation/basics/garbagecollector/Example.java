package com.scjppreparation.basics.garbagecollector;

public class Example {

public static void main(String[] args) {
	
	
	
   Example e=m1();
   
   //here only e is eligible for GC
   
   m2();
   
   //herre teh two objects ae eligibel for GC
   
   System.out.println(e);
}



//teh obejcts which are created inside a method are bydefault eligible for Gc after teh completion of that method
private static Example m2() {
	// TODO Auto-generated method stub
Example ex=new Example();
	
	Example ee=new Example();
	
	//no obejct eligible for GC
	
	
	ee=new Example();
	//one obejct eligible for GC
	
	
	ex=ee;
	//two objects eligible for gc
	return ex;
	
}

private static Example m1() {

	Example ex=new Example();
	
	Example ee=new Example();
	
	return ex;
}


}

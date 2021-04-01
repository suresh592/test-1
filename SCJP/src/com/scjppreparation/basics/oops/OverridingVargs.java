package com.scjppreparation.basics.oops;


class Vargs
{
	
	void m1(int... x)
	{
		System.out.println("Parent class varg method");
	}
	
	void m2(int... x)
	{
		System.out.println("P Var args methoid");
	}
	
}

class VargsOv extends Vargs
{
	
	//this is clalled over loading with trespect o Vargs cl;ass
	void m1(int x)
	{
		System.out.println("Child class Noermal method dfo rOver lading");
	}
	
	void m2(int... x)
	{
		System.out.println("C var agrs method");
	}
	
}

public class OverridingVargs  {

	//we cannnor tover ride a normal method with the var args method
	//we are trying to over ride ot will become obver loading but not over riding
	
	//a var arg method should be over loaded with the var arg meethodonly
	
	
	public static void main(String[] args) {
		
		Vargs vr=new Vargs();
		
		VargsOv vrr=new VargsOv();
	
		Vargs v=new VargsOv();
		vr.m1(10);  //parent

		vrr.m1(25);   //child
		
	
		v.m1(56);       //parent
		
		
		vr.m2(5687);
		vrr.m2(4567);
		v.m2(456);		
		//if both parent and chidl class methods are var args tehn in this case teh child clss method is claled
	} 
	
	
	
	
}

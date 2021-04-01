package com.scjppreparation.basics.innerclasses;


//For outer clases the applicabel modifiers are final , abstract, public , default, Strictfp
public class NormalInnerClass {

	//we can declare any named class directly without any static modifiers, such type of class is called Normal or Regular inner class
	
	String name;
	int x;
	float f;
	
	
	
	//but for the inner classes teh appliacable modifiers are private, proteccted, static , public, final, abstract, strictfp, default
	class NormInner
	{
		
		int x=250;
		//For normal or gregular inner classes we cannot defclare a main method ebcause
		
		//we can access static members from another statci memebrs or from a top end mclass or memebrs only
		
		public  NormInner main() {
			
			System.out.println("This is hte inner class");
			System.out.println("This is the main method in String arguements");
			return null;
			
		}
		
		
		//From inner classes we can access all members of the outer class directly without any instnace to be created
		
		//all members means both static and non static directly
		
		void mm1()
		{
			
			
			f=25;
			x=260;
			name="Saai";
			
			System.out.println("Name "+name+"\t"+f+"\t"+x);
			
			
			System.out.println(this.x);
			System.out.println(NormalInnerClass.this.x);
		}
		
		
		//with in the inner classes this always points to current inner class
		
		//to refere to the outer class we cau use   
		
		//outerclassname.this
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is the outer rclass main method");
		
		NormalInnerClass ni=new NormalInnerClass();
		
		NormalInnerClass.NormInner nni=new NormalInnerClass().new NormInner();
		
		
		//this is the another way to create object
		
		NormalInnerClass.NormInner n=ni.new NormInner();
		n.main();
		
		//this is the another way to call the main method in inner clases
		//
		
		NormalInnerClass.NormInner m=new NormalInnerClass().new NormInner().main();
		nni.main();
		
		
		ni.m2();
	}
	
	
	
	//Accessing the inner class code form instance are of outer class
	
	public void m2()
	{
		//from instance area of outer calss we can directly create the object of Inner calss and access its members dorectly
		NormInner ni=new NormInner();
		
		ni.main();
		
	}
	
	

     
	
}


//class Tess
//{
//	
//	//we ccann accesss inner class code from outside of teh pouter calss that is oin another classes
//	
//	
//	public static void main(String[] args) {
//		
//
//		NormalInnerClass ni=new NormalInnerClass();
//		
//		NormalInnerClass.NormInner nni=new NormalInnerClass().new NormInner();
//		
//		nni.main();
//	}
//	
//}

package com.scjppreparation.basics.oops;

public class Overloading {
	
	//if the method names are sam ebut with different arguements ro 

	//two methods having the sam ename and with dofferent arguemetns is allowed in a=java
	
	
	
	void m1()
	{
		System.out.println("No arguemetn Method");
	}
	
	//mwethod signature consists name of the method  and its parameters list only 
	
	//m1 is htemehtod name
	//int a is the arugemetn list
	
	//in java return type is not the part odf the signature
	
	//compiler will always mehotd sognature for method class\
	
	//with in the sam eclass two methods with the same signature isnot allowed
	
	void m1(int a)
	{
		System.out.println("Integer arguement method");
	}
	
	void m1(float b )
	{
		System.out.println("Floar arguement method");
	}
	
	//in oveloading mehtod resolution if hte matched arguemnt with the specific method isnot avaialable then compiler will raise an
	//error immediately
	
	//first it promotes the arguement to teh next level and checks foir the matched method
	
	//if the matched method is available then it is considered else
	//once again the compiler promoted the arguement to teh next leve;
	
	//thi sprocess will be continued until all possible promotions still if the matched method is not avaialbe
	
	//the only compiler will raise a request
	
	void m1(char c)
	{
		
	}
	
	
	void m1(Object o)
	{
		System.out.println("Object one");
	}
	
	void m1(String s)
	{
		System.out.println("String ine");
	}
	
	
	//in over loading child resolution will get more priority than thte parent one
	
	public static void main(String[] args) {
		
		Overloading oo=new Overloading();
		oo.m1();
		
		//the char method is promoted to int
		oo.m1(12345);
		oo.m1(123456.4789f);
		oo.m1(97);
		
		
		oo.m1(new Object());
		
		oo.m1("SAi Gangdahr");
		oo.m1(null);//String is called instead of Object
		
		//in over loading method resolution always takes care by the compiler based on the reference type
		
		//this is also know as compile time polymorphism
		//early binding
		
		
		///the reference type will play a very prominenet role and run tikme objec twill be dummy
		
		
		
		
		
	}

}

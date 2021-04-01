
package com.scjppreparation.basics.oops;

class Animal
{
	
	
}

class Monkey extends Animal
{
	
	
	
}
public class Inheritance1 {
	
	void test(Animal A)
	{
		System.out.println("Animal version");
	}
	
	void test(Monkey m)
	{
	System.out.println("Monkey Version");
	}
	
	public static void main(String[] args) {
		
		Inheritance1 i=new Inheritance1();
		
		Animal a=new Animal();
		
		Monkey m=new Monkey();
		
		Animal aa=new Monkey();
		
		i.test(a);//Animal
		
		i.test(m);//Monkey
		
		i.test(aa);//Animal
		
	}
	
	//In over loading method resolution always takes care by the compilern based on teh reference type and run time objectnever
	
	//play any role in overloading	

}

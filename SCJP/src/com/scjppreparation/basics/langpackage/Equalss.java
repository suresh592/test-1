package com.scjppreparation.basics.langpackage;

public class Equalss {

	//we can use the equals method to check the equality of two objects   public boolean equals(Object o)
	
	String name;
	
	int roll;

	public Equalss(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	public static void main(String[] args) {
		
		
		Equalss eq=new Equalss("Saai",123456);
		
		Equalss eqq=new Equalss("Gnagdahr",456789);
		
		Equalss rq=new Equalss("Saai",123456);
		
		Equalss s=eq;
		
		System.out.println(eq.equals(eqq));
		System.out.println(eq.equals(rq));
		
		System.out.println(eq.equals(s));
		
		//System.out.println(eq.equals("Durga"));
		
		System.out.println(eq.equals(null));
		
		//in the above cases object class equals method will be executed which is always meant for refernce comparision(Address)
		
		//if the trwo references pointing to the same object then only equals method returns true
		
		//this behaviour is exactly same as == operator
		
		//if we want to perform content comparision instead of reference comparisionwe have to over ride equals method in our class
		
		//what ever wwe are over riding .equals() method we havw to consider the following things
		
		//what is the meaning of equality
		
		//in this case of different types of objects(Heterogenious) equals method should return false but not class cast exception
		
		//if we are passing null arguement 	our equals method should return false but not a null pointer exception
		
		
		
		
		
		
	}

	
	
	//the following is the valid way of over riding equals method in student class
	
//	public boolean equals(Object o) {
//		
//		String name1=this.name;
//		int roll=this.roll;
//		
//		Equalss eqs=(Equalss) o;
//		
//		String name2=eqs.name;
//		int roll2=eqs.roll;
//		
//		if(name1.equals(name1)&&roll==roll2)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//		
//	}
	
	
	
	//short way of writing equals method
	
	@Override
	public boolean equals(Object obj) {

		Equalss ee=(Equalss) obj;
		try
		{

			if(name.equals(ee.name)&&roll==ee.roll)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		catch (ClassCastException e) {
			// TODO: handle exception
			return false;
		}
		
		catch (NullPointerException e) {
			// TODO: handle exception
			return false;
		}
		
		
		
	}
	
	
	//difference between  == and equals   
	
	//  ==	//this is an operator applicable for both primitive types and object references	
	
	//e  operator applicable only for object references biut not for primitive types
	
	//  ==  always meant for reference comparision
	
	//e -by default equals method refers for reference comparision
	
	//== we cant over ride == method for content comparision
	
	//e - we can over ride .equslw() method for content comparision
	
	
	// == fro any object rerference r== null always false
	
	//e    fro any object rerference r.equals(null) always false
	
	
}

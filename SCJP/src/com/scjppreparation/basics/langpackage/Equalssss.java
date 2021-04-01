package com.scjppreparation.basics.langpackage;

public class Equalssss {
	String name;
	int age;
	public static void main(String[] args) {
		
		
		
		//== method always meant for reference comparision
		
		//equals() method always meant for content comparisons
		
		
		String s1=new String("Saai");
		String s2=new String("Saai");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		String s3=s2;
		  
		System.out.println(s3==s2);
		System.out.println(s3.equals(s2));
		
		
		//in the String classes equals is iver ridden for content comparision
		
		//in string buffer equals is not over ridden for content comparision hence object clas equals got executed which is menat for refernce comparision
		
		//in wrapper classes equsla method os over ridden for content comparision
	}
	
	
	//contract betwen equals and hash code
	
	//if two objects are equal by 	.equals method cumpulsory teh hash codes must be the same
	
	//if two objects are not equal by using then there are no restrifction son hash code , they can be same or different
	
	//if hash codes of two objects are equal then we cannot conclude eq	equals iut may return true or false
	
	//if the hash code of two objects are not equal then we can conclude always .equals is always false
	
	
	//to satisfy teh aobve contract when ever we are over riding .equals() compulsory we shoudl over ride hash code
	
	
	//if we are not over riding  we wont get any compile time and run time errors
	
	//but it is not a good programmin g practise

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(!(obj   instanceof Equalssss )) {
			return false;
		}
		Equalssss eq=(Equalssss) obj;

		if(name.equals(eq.name)&&age==eq.age)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

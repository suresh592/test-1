package com.scjppreparation.basics.wrappers;



public class Basics {

	//teh main objectives of wrapepr calsses are 
	
	//to wrap primitives into obejct forms so that we can handle primitives just like as Objects
	
	//to define several utility methods for primitives
	
	
	//constructors of wrapper classes
	
	//Almost all wrapper classe contains two constructors. one can take corresponding primitive type as an arguement and teh other can
	
	//take the Stringt as an argemet
	
	//Integer i=new Integer(//int value)
	
	//Integer i=new Integer(String s)
	
//	Double d=new Double(double value)
//			
//			Double dd=new Double(String s)
	
	//if teh string is not proplerly formatted tehn we iwll get run time exception saying 
	
	//number format exception
	
	//Integer i=new Integer("ten");   number format excpetion
	
        //float class contains the three construcots
	
	//one cantake the float and the other can take double and the last one cantake string as an arguement
	
	
//	Float f=new Float(double value)
//			Float f=new Float(float value)
//			
//					Float f=new Float(String value)
	
	
	//character class can contain only one constructor which can take char primitive tyep as the arguement
	
	//Character ch=new Character(char value)
	
	//boolean class also contains two constructors which can take boolean and String as an arguements
	
	//if we are passing boolean primitive type as an arguement then the only allowed values are true or false by mistake if we provide any other
	
	//values we will get teh compile time error	
	
	//if we are passing strni arguement to the compiler then case uis not important and the content is also not important
//	
//	Boolean b=new Boolean(boolean value)
//			
//			Boolean bb=new Boolean(String s)
	
	
	
	public static void main(String[] args) {
		
		
		
		//Integer excample constructors
		
		System.out.println("Integer");
		Integer i=new Integer(123456);
		
		Integer ii=new Integer("456789");
		
		System.out.println(i+"\t"+ii);
		
		System.out.println("DOuble");
		Double d=new Double(456789.123);
		
		Double dd=new Double("789456.123456");
		System.out.println(d+"\t"+dd);
		
		System.out.println("Float");
		
		Float f=new Float(123456.789);  //double
		
		Float ff=new Float(456123.132f); //float
		
		Float fff=new Float("456.132");
		
		System.out.println(f+"\t"+ff+"\t"+fff);
		
		
		System.out.println("Charcater");
		
		Character ch=new Character('A');
		
	 System.out.println(ch);
	 
	 Boolean b=new Boolean(true);
	 
Boolean bb=new Boolean("True");   //truw
Boolean bbb=new Boolean("NOt Corect");   //false


System.out.println(b+"\t"+bb+"\t"+bbb);



System.out.println(bb.equals(bbb));

System.out.println(bb==bbb);


//wrapper calsses  and hteir corresponding string arguement



//Byte     byte or String

//Short    short or String

//Integer   integer ot String

//long    long or String

//float   float or String or double

//Character char or String

//double   double or Stirng

//Boolean booleamn or String


//Note 

//in every wrapper classes to String is voer ridden to return its content 

//in every wraapper classe equals is over ridden for content comparision





//There ar e4 utility methods in wrapper classes

//valueOf()

///XXXValue()

//parseXXX()

//toString()



		
		
	}
}

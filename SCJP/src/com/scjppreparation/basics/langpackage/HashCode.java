package com.scjppreparation.basics.langpackage;

public class HashCode {

	//for every object jvm will assign a unique id which is nothing but hash code
	
	//jvm uses hash code will saving objects into hash table or hash map or hash set
	
	//based on our requirement we can generate hash code n=by over riding hash code method in our class
	
	//if we are not over riding hashCOde method then object class hash code method will be executed which generates hash code based 
	
	//on the address of the object but when ever we are over riding 	hash code method then hash code is no longer related to 
	
	//address of the object
	
	//over riding hashcode method is said to be proper ifff for every object we have to generate a unique number
	
	
	
	
	//this is not proper way of over riding  because for every object we are returning 100
//	public int hashCode()
//	{
//		return 100;
//	}
	
	int rollNum;

	public HashCode(int rollNum) {
		super();
		this.rollNum = rollNum;
	}
	
	
	//this is the proper way of over riding hash code because we are generating different hash code for every object
	public int hashCode()
	{
		return rollNum;
	}
	
	
	
	
	//toString vs hash code
	
	
	
	
public static void main(String[] args) {
	
	
	
	
	HashCode hs=new HashCode(567);
	
	HashCode hss=new HashCode(571);
	
	
	//output without over riding hash code method	and toString
	System.out.println(hs);   //com.scjppreparation.basics.langpackage.HashCode@1e643faf
	
	System.out.println(hss);  //com.scjppreparation.basics.langpackage.HashCode@880ec60
	
	
	//after over riding hash code method and without over riding toString()
	
	System.out.println(hs);   //com.scjppreparation.basics.langpackage.HashCode@237
	
	System.out.println(hss);   //com.scjppreparation.basics.langpackage.HashCode@23b
	
	
	//after over riding hash code and toString methods are :
	
	
	System.out.println(hs);  //rollNum  567
	
	
	
	System.out.println(hss);   //rollNumm   571
}



//the perdefiend obejct class tostrinng() method must call teh hashCode method for executeion
@Override
public String toString() {
	
	//these to String method does not call hash code 
	return "HashCode [rollNum=" + rollNum + "]";
}
	
	
	//Note    

//if we are giving oppurtunity to 		 object class to String() method then it will internally calls hashCode method

//if we are giving oppurtunity ti our class toString method then it may not call has code
	
}

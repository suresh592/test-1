package com.scjppreparation.basics.garbagecollector;

import java.util.Date;

public class Basics {

	
	//in old langauges like c and C"++ creation adn destructiton of the obejct is the responsibility of the programmer only
	
	//usually programmer takes very much care while creating objects and his neglecing destruction of use less obejcts
	
	//due to this negligence at certain points of time for creation of new object sufficient memory may not be available 
	
	//and the entire program will collapse due to memeory problems
	
	//but in java programmer is only responsible for the creation of objects and he is not responsible for destruction of useless obejcts
	
	//sun people provided on eassistent which is always running in teh bacj=kground 	for destruction of use less objects
	
	//Due to this assistant the chance of failure of java program is very less
	
	//This assistant is nothing called Garbage Colector
	
	//Hence the main objective of garbage colelctor is to destroy the use less objects
	
	
	//Various ways to make an obejt eligibel for garbage collector
	
	//Even through programmer is not responsible to destroy useless obejcts it is always a good progermmaing practice to make an 
	
	//object eligibel for gc when it is no loneg rrequired
	
	//an obejct is said to be eligibel for GC when it does not contain nay external references	
	
	//teh following are various possible ways to make an object eligible for GC.
	
	
	
	
	///Case 1  *************************
	
	//if an object is l=no longer required then assign null to its references, then automatically its eligible for GC
	
	//Student s1=new Stduent();
	
	//Student s2=new Student();
	
	//Then no objects eligible for gc
	
	//s1=null
	
	//s1 obejct eligible for gc
	
	//s2=null
	
	//s2 is eligible for GC
	
	
	// case 2 *****************************    Island Of Isolation
	
	class Test
	{
		
		
		Test t;
		
		void fun(){
			
			Test t=new Test();
			
			Test t1=new Test();
			
			
			Test t2=new Test();
			
			t1.t=t2;
			
			t2.t=t;
		
			t.t=t1;
			
			t1=null;
			
			t2=null;
			
			t=null;        //upto this line onoo objetcs eligible for GC
			
			//here all the 3 objetcs are eligible for GC
			
			//If an object does not havign any reference then it is eligible for GC
			
			//even though object having the reference still it is eligible for GC(Islanf Of Isolation)
		}
		
	}
	
	//Methods for requesting JVm to run garbage collector
	
	//when ever we are making an object eligible for GC it may not be destroyed by GC immd=ediately
	
	//when ever JVM runs garbage collector then only Object will be destrou=yed
	
	//we can request JVM to run GC programmatically  whether JVM accepts oevr request or not there is no guarantee
	
	//The various ways for requesting JVM to run Garbage Collecctor
	
	//System Class         ************************
	
	//the system class contains a static method GC for this            System.gc()	
	
	//By RunTimeClass
	
	//by using a run time object JVM can communicate with JVM
	
	//Run time class is a singleton class hence we cannot create run time object by using the constructor
	
	//we can create a run tiem obejct by using teh afctory method
	
	//RunTime r=RunTime.getRunTime();
	
	//oncce we gor thr run time obejct then we can apply the following methods inn the obejct
	
	//freeMemory() returns free memory in the heap
	
	//totalMemory() returns the total memory of the heap
	
	//gc() for reuesting jvm to run garbage collector
	
	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		
		System.out.println(r.totalMemory()+"\t"+"Total Memory");
		
		System.out.println(r.freeMemory() +"\t"+"Free Memory");
		
		System.out.println();
		
		
		for(int i=0;i<100;i++)
		{
			Date d=new Date();
			
			d=null;
		}
		
		System.out.println(r.freeMemory() +"   Before GC Called");
		
		
		//gc present in system class is a static method where as GC present in runTime class is an instance methodand recommended to use System.gc()
		r.gc();
		
		System.out.println(r.freeMemory() + " After GC called");
		
		
	}
	
	
}

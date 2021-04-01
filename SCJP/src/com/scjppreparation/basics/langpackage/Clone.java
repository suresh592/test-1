

package com.scjppreparation.basics.langpackage;

public class Clone implements Cloneable {
	
	int i;
	int j;

	//the process of creating exactly duplicate objects is called cloning 
	
	//teh main objectoive of cloning is to maintqain back up
	
	//we can get teh cloned object by using clone() of object class	
	
	//protective native void clone() throws cloneNotSUpportredException
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Clone c1=new Clone();
		
		Clone c2=(Clone) c1.clone();
		c2.i=23;
		
		c2.j=22;
		
		System.out.println(c1.i +"\t"+c1.j);
		
		
		System.out.println(c1.hashCode()+"\t"+c2.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		
		
		//we can call clone only on the cloneable objects
		
		//an object is said to be cloneble if teh corresponding class implements cloneable interface
		
		//cloneable interface presents in java.lang package and it does not contain any methods
		
		//Shallow CLonign and Deep CLomning
		
		//the process of just creating teh duplicate referecne variable but not the duplicate object is called shallow cloning
		
		//the process of creating exactly independent duplicate objects is called  deep cloning
		
		//by default cloning means deep cloning
		
		//Test t=new Test()
		
		//Test t1=t1;   //shallow cloning
		
		//Test t2=(Test)t.clone(); //deep cloning
		
		
		
	}
	
}

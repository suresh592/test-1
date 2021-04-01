package com.scjppreparation.basics.collecfwlist;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIterator {

	
	//we can apply iterator concept for any Colelction Object
	
			//hence this is a universal cursor
			
			//while iterating we can perform remove operation also in addition to the read operation
			
			//we can get the iterator object by using iterator method of teh coolection class
			
			//Iterator itr=collectionObejct.iterator();
			
			//the iterator interface hsas the following methods
			
			//public boolean hasNext()
			
			// Object next()
			
			//void remove()
	public static void main(String[] args) {
		
ArrayList al=new ArrayList();
		
		al.add(null);
		al.add("Sai Gangadahra");
		al.add(10);
		al.add('c');
		al.add(null);
		al.add("Yeshodamma");
        al.add(10);		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		al.add(1, 25);
		al.add("Number");
		
		System.out.println(al.size());
		al.add(null);
		System.out.println(al);
		
		System.out.println();
		
		
		Iterator i=al.iterator();
		int count=0;
		while(i.hasNext())
		{
//			String s=(String) i.next();
//			if(s.equals("10"))
//			{
//				i.remove();
//			}
			
			if(count==4)
			{
				
				i.remove();
			}
			System.out.println(i.next());
			
			count++;
		}
		
		System.out.println(al);
		
		
		
		//in the case of iterator and enum we can always move towards the forward directioinan dwe canno tmove backward 
		//direction and hence these cursors are single directional but not the backward directional.
		
		//while performing the iteration we can read and remove access
		//we cannot perform  replacement and addition of new objects
		
		
		
	}
}

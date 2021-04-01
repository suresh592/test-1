package com.scjppreparation.basics.collecfwlist;

import java.util.Collection;
import java.util.Iterator;

public class Collectio implements Collection {

	
	
	//in this program I implemented teh collection interface and adds all teh unimplemented methods
	
	//at last wewiill see all the methods
	
	
	//if we want to represent a group of individual objects then we will go for collection
	
	//it defines tehe most common methods 	which can be applied for any collection Object
	
	//methods in collection interface
	
	
	//boolean add(Object o)
	// "      addAll(Collection c)
	//   "    remove(Object o)
	//    "   removeAll(Colelction c)
	//boolean retainAll(Collection c)
	
	
	//to remove all obejcts except those present in C
	
	//void clear()
	//boolean isEmpty()
	//int size()
	//boolean contains(Object o)
	//boolean containsAll(Collection C)
	//Object[] toArray[Object[] a)
	//Object[] toArray()
	//iterator iterator()
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}

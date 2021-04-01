package com.scjppreparation.basics.map;

import java.util.Hashtable;

class Temp
{
	int i;

	public Temp(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"\t"+" ";
	}
	
	public void finalize()
	{
		System.out.println("Finalize method oois called");
	}
	
	
	
	
	
}
public class HashTables {

	
	//teh nuderlying data structure is hash table
	
	//Heterogenious objects are allowed fro both keys and values
	
	//insertion order is not preserved and this is based on the hash code of the keys
	
	//null is not allowed for both keys and values other wise we will get  null pointer exception
	
	//duplicate keys are not allowed but duplicate values are allowed
	
	//all  methods are synchronized hencce hash table is thread safe
	
	
	//constructors
	
	//hashTable h=new HashTable() 
	
	//creates an empty hash set with defauolt initial capacity 11 and default fill ratio  0.75
	
	//hashTable h=new HashTable(int initial capcity)
	
	//hashTable h=new HashTable(int initialCapacity, float fill ratio)
	
	//hashTable h=new HashTable(Map m)
	
	public static void main(String[] args) {
		
		Hashtable hs=new Hashtable();
		
		hs.put(new Temp(5), "A");
		
		hs.put(new Temp(2), "b");
		hs.put(new Temp(6), "c");
		hs.put(new Temp(15), "d");
		hs.put(new Temp(23), "e");
		hs.put(new Temp(16), "f");
		hs.put(new Temp(9), "g");
		hs.put(new Temp(7), "h");
		
		System.out.println(hs);
		
		
	}
}

package com.scjppreparation.basics.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Basics implements Map {

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
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//If we want to represent a group of Objects as key value pairs then we shoul d go for map 
	
	//both the key and value are obejcts
	
	//duplicate keys are not allowed but values are allowed
	
	//each key vlaue pair is claled entry
	
	//there is no rlation ship betwen map and collection
	
	//collection is mean tfor only a group of individual obejcts where as map is mean t for a group of key value pairs
	
	//Methods are  :
	
	//Object put(object key, Object value)   
	
	//this is to add the key value pair to teh map
	
	//if the specified key is already avaialable then the old value is replaced with the new value and the old valu ewill be returned
	
	//void putAll(Map m)
	
	//to addd a group of key value pairs
	
	//Object get(Object key)
	
	//returns the value associated with the key
	
	//if the key is not available then we iwll get   null
	
	//Object remove(Obejct key)
	
	//Object containsKey(Object key)
	
	//boolean containsValue(Object vlaue)
	
	//int size()
	
	//boolean isEmpty()
	
	//void clear()
}

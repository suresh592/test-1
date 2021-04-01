package com.scjppreparation.basics.map;

import java.util.Comparator;
import java.util.TreeMap;

class MysCom implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}

class Employ
{
	
	String name;
	int number;
	@Override
	public String toString() {
		return "Employ [name=" + name + ", number=" + number + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
	
	
}
public class TreMap {

	
	//the underlying data structure is red black tree
	
	//insertion morder is not preserved and all data is inserted according to some sorting order of keys
	
	//if we are depending on some natural sorting order tehn keys should be homogenious and comparable
	
	//other wise we will get teh class cast exception
	
	//if we are defining our sown sorting order then keys need not to be homogenipous and comparable
	
	//there are no restrictions on the values they can be homogeniuos and comparable
	
	//dupliacte keys are not allowed but values can be duplicated
	
	//for the empty tree map as the first entry with the null key is allowed in jdk 6 only. but afte rinserting that entruy if we are trying 
	//to insertt any other elemetn entry we will get null pointer exception
	
	//fpor teh non entry tree map if we are trying to insert null entry then we will ge tnull pointer excpetion
	
	
	//cconstructors are  :
	
	
	//Treemap t=new TreeMap();
	
//	/Treemap t=new TreeMap(Comparator c);
	
	//Treemap t=new TreeMap(Map m);
	
	//Treemap t=new TreeMap(SortedMap m);
	public static void main(String[] args) {
		
		
		TreeMap tr=new TreeMap(new MysCom());
		
		
		//in jdk 6 we try to add null at first elemetn then there is no error
		
		//if we try to add any other element then it will throw null poiinter exception
		
		//while it is not teh case with jdk 8
		
		//if you add null any where then it will throw null pointer exception
		
		//irrespective of the place
		//re.put(null, "Sai Gangdahr");
		
		tr.put("AAA", "hkdsaj");
		
		tr.put("AAB", "hkdsaj");
		tr.put("AAC", "hkdsaj");
		tr.put("AAD", "hkdsaj");
		tr.put("AAE", "hkdsaj");
		
		
		System.out.println(tr);
		
		
		TreeMap t=new TreeMap();
		
		t.put(101,"Hyderabad");
		
		t.put(102,"Pune");
		t.put(103,"Mukmbai");
		t.put(104,"kolkata");
		t.put(105,"Chennai");
		t.put(106,"banglore");
		
		System.out.println(t);
		
		
TreeMap tt=new TreeMap(new Com());
		
	
        Employ ee=new Employ();

        String name="Sai";
        Integer number=456;
        String name1="Rathasaradhi";
        Integer number2=5555;
		
        
        //check this error
//        tt.put(name,number );
//        tt.put(number, name);
		System.out.println(tt);
		
	}
}

class Com implements Comparator
{

	
	Employ ee=new Employ();
	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1.equals(ee.getName()))
		{
			String s1=o1.toString();
			String s2=o2.toString();
			return s2.compareTo(s1);
		}
		else
		{
			Integer i1=(Integer) o1;
			Integer i2=(Integer) o2;
			return i2.compareTo(i1);
		}

		
	}
	
}

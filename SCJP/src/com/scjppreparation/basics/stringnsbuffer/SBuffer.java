package com.scjppreparation.basics.stringnsbuffer;

public class SBuffer {

	//if the content will change freauently then it is never recommened to go for String. because for every change a new object willl be created
	
	//to handle this requirement ocmpulsory we should go for string buffer where all the changes perfiormed in teh existing object
	
	//only instead of creating the nrw object
	
	//constructors
	
	//StringBuffer sb=new StringBuffer();
	
	//creates an empty string bufefr with teh default initial capacity 16
	
	//once string buffer reaccheds its maximum capcacity a new strign buffer object will be created with 
	
	//new capcity=(currentCapacity+1)*2;
	
	
	//StringBuffer sb=new StringBuffer(int initial capcaity);
	
	//creates an empty string buffer with specifired initial capcaity
	
	
	//StringBuffer sb=new StringBuffer(String s);
	
	//creates an equivalen tstrign buffer obejct witj the equivaluen capaccity of 16+s.lemngth()
	
	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());
		
		//if we insert abive xi==sixteen chars then its ccapcacity will be increased
		sb.append("abbcdefghijklmnop");
		
		System.out.println(sb.capacity());
		
		
		//Important method of string buffer	 
		
		//int lenght()
		
		System.out.println(sb.length());
		//int capcacity()
		
		//	char charAt(itn index)
		
		System.out.println(sb.charAt(5));
		//void setChatAt(int index, char ch)  to replace teh char locating at specified index with the provided characher
		
		System.out.println(sb);
		sb.setCharAt(6, 'c');
		System.out.println(sb);
		//public stringbugffer append(String s)   int teh place of String we can use int i, boolean b, double d, object o
		
		
		
		sb.append(" pi value is ");
		
		sb.append(3.14);
		
		sb.append(" it is exactly ");
		
		sb.append(true);
		
		System.out.println(sb);
		
		//string buffer insert(int index, String s)  in teh place of string we can use any member including obejct alsoo
		
		
		sb.insert(3, " Saai Gangadhar ");
		
		System.out.println(sb);
		
		
		//public stringbuffer delete(int begin, int end)   starts from beginand ends at end-1,   end is exclusive
		
		//deleteCharAt(int index)  to delete teh character at specified location
		
		sb.delete(20, 27);
		System.out.println(sb);
		
		//public StringBufefr reverse()
		
		
		//public void setLenght(int length)
		
sb.setLength(36);

System.out.println(sb);


//public void ensureCapacity(int capacity)    to set teh capacity based on our requirement

//StringBuffer sb=new StringBufefr() 		

System.out.println(sb.capacity());

sb.ensureCapacity(150);

System.out.println(sb.capacity());


//public void rtimTOSiZe()  to release extra allocated free memory, after calling this method length and capacity will ebequal


sb.trimToSize();

System.out.println(sb.capacity());
	}
}

package com.scjppreparation.basics.datatypes;

public class CharLiterals {
	public static void main(String[] args) {

		//A char can be represented as an unicode literal
		char ch='a';
		//char chh='ab';//invalid character constant


		char ct=97;  //no problem here
		//it takes values upto 
		char max=65535;


		//above this value throws exception
		//char maxOutOfRange=456129;		

		//a char literal can be trepresented in hexa defcimal and octal representaton

		char hex=0xface;

		char oct=0123456;


		//A char literal can be represented in unicode representation

		char uch='\u9067';
		char uch2='\uface';
		char nch='\n';
        char cht='\t';

        
        //char can be used to perform arithmetic operations 
        
        char a='a';
        System.out.println("Before incrementing "+a  );
        ++a;
        System.out.println("After Incrementing "+a);
        char b='b';
        char c=(char) (a+b);
        System.out.println("Addition of Character Variables"+ c);
        
        char de='\'';


	}//compile time exception


}

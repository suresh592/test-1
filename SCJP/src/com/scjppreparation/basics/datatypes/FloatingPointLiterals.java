package com.scjppreparation.basics.datatypes;

public class FloatingPointLiterals {
	
	public static void main(String[] args) {
		
		
		//we cna only specify the floating point literal only in decimal form but not in Octal and mHexcac Decimal forms
		
		//we cannot also specify floating literals and doublesd
		//we will get the compilation error
		float y=12345.4567f;
		
		double d=24123.1615d;
		
		
		//teh above value is not accepted because there is no way to represent the decimal values in the hexadecimal and octal format
		//double dat=0xface.123;
		//float fet=01234.456;
		
		//these values are acceptable b\ecause these values are taking from the int type
		double oct=01234.456;
		
		float fet=01234;
		double _$_=0xface;
		
		float der=0xface;
		
		//flost values can be represented in the exponential form
		float exp=1.2e34f;
		double expp=1.7e308d;
		
		//you can also represent sign after the e or E in the scientific formn
		
		double signExp=124.123e-056;
		
		double signExpp=0x124.123P6;
		
		double ud=123_456_789.0123;
		
		
	}

}

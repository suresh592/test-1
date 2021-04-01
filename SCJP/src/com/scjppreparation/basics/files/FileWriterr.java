package com.scjppreparation.basics.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {

	
	//we can use this objec to write character data into the file
	
	
	//constructors 
//	
//	FileWriter  f=new FileWriter(String name)
//			
//			FileWriter  f=new FileWriter(File name)
	
		//teh above two constructors meant for over ridign, if we want to perfomr append instead of overr riding then we have to use
	
	//the following constructors
	
//	FileWriter fw=new FileWriter(String name, boolean append)
//			
//	FileWriter ff=new FileWriter(file file, boolean append)


//if the specified file is already not available then the above constructors will create a new file
	
	
	//Methods of file writer
	
	//write (int ch) to write a singl echaracter to the file
	
	//write(char[] ch)    to wirte an array oc characters in to the file
	
	//write(String s) to write a String f characters into the file
	
	//flush() to give teh guarantee that the last character of the data also return to the file
	
	//close()
	
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abcd.txt");
		
		
		fw.write(250);
		fw.write("\n");
		char[] cbuf= {'a','b','c','d','r','t','h'};
		
		fw.write(cbuf);
		fw.write("\n");
		fw.append('k');
		
		fw.write("\n");
		
		fw.write("Written By Sai Gangadhar Kotte Kodandagari");
		
		fw.flush();
		
		fw.close();
	
		
		
		
		
		
		
	}
}

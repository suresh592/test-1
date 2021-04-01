package com.scjppreparation.basics.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderr {

	//we can use the file reader toread teh data from the file
	
	//FileReader fr=new FileReader(String name)
	
	//FileReader fr=new FileReader(File f)
	
	
	//mewthods of file reader
	
	//int read()    this attempts to read next character data from the fil eand return its unicode value
	
	//if the next character is nit available then this method returns -1
	
	//int read(char[] ch)
	
	//it attempts to read enough character  from the file into teh char array and returns number of characters which are copied from 
	
	//file to char[]
	
	//close()
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("abcd.txt");		
		FileReader fr=new FileReader(f);
		
		System.out.println(fr.read());
		
		char[] ch=new char[(int) f.length()];
		
		fr.read(ch);
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println("==================");
		
		
		FileReader fff=new FileReader("abcd.txt");
		int fd=fff.read();
		
		while(fd!=-1)
		{
			System.out.println((char)fd);
			
			fd=fff.read();
		}
		
		
		
		
		
	}
	
	
	//usuage of  file writer and file reader is not recommended because
	
	//while writing data by file writer we have to insert line separators which is bigger headache to the programmer
	
	//by using the file reader we can read data character by character  which is not convinient to teh programmer
	
	//to reslove these problem ssun people introduced buffered reader and buffered writer	
	
	
}

package com.scjppreparation.basics.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterr {

	
	
	//this is hte most enhanced writer to write character data in to the file. by using FileWriter and BufferedWriter we can write only 
	
	
	//character and String data only but by using the printWriter we can write any primitive types data in to the file/
	
	//PrintWriter pw=new PrintWriter(String s)
	
	//PrintWriter pw=new PrintWRiter(File F)
	
	//PrintWriter pw=new PrintWRiter(Writer w)
	
	//write(int ch)
	
	//write(char[] ch)
	
	//write(String ch)
	
	//flush()
	
	//close()
	
	
	//print(primitive data types)
	
	//println(primitive data types)
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vrr.txt");
		
		PrintWriter p=new PrintWriter(fw);
		
		p.write(100);
		
		p.println(true);
		
		p.println('d');
		
		p.println(256897);
		
		p.println("Sai Gangadhar");
		
		//we can also print Object type to the class
		
		p.flush();
		
		p.close();
		
		
		//readers adn writers meant for handling character data 
		
		//to handle binary data we should go fro streams
		
		//we can use input stream to read binary data an doutput stream to write binary data
		
		//we can use object input stream and object output sttream to read and write obejcts into teh file directly
		
		//teh most enhanced writer to weite charatcer data into the file is PrintWriter amd where as the most enhanced reader to 
		
		//to read character data is buffered reader
		
		
		
		
	}
	
}

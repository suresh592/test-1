package com.scjppreparation.basics.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterr {

	//we can use buffered writer to write thre character data into the file 
	
	//constructors
	
	//BufferedWriter bw=new BufferedWriter(Writer w)
	
	//BufferedWriter b=enw BufferedWriter(Writer w, int bufferSize)
	
	//buffered wirter never communicates directly with the file 
	
	//compulsory it should communicate via some writer obejct conly
	
	
	
	//BufferedWriter bw=new BufferedWriter("abc.txt" )       false way
	
	//BufferedWriter bw=new BufferedWriter(new File("abc.txt"))    false way
 	
	//BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"))   true
	
	//BufferedWriter bw=new BufferedWriter(new BW(new FileWriter(new File("abc.txt")))   true way
	
	
	
	//important methods of buffered writer are  :
	
	//write(int ch)
	
	//write(char[] ch)
	
	//write(String ch)
	
	//flush()
	
	//close()
	
	//newLine()    to insert the new line
	
	
	public static void main(String[] args) throws IOException {
		
		
		File list=new File("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vr.txt");
		
		FileWriter fw=new FileWriter(list);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(233);
		
		bw.newLine();
		char[] c={'a','b','v','f','g','t','e'};
		
		bw.write(c);
		
		bw.newLine();
		String s="Saai is Studying Sincerely";
		
		bw.write(s);
		
		bw.newLine();
		bw.flush();
		bw.close();

		
		//when ever we are closing buffered writer automatically underllyign writers will be closed
		
		//not need to close again file writer after closing the bi=uffered writer
		fw.close();
		
				
		
		
		
	}
	
}

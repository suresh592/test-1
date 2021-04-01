package com.scjppreparation.basics.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderr {

	
	//teh main advantage of bufferde readder over file reader is we can read the data line by line instead of reading data character
	
	//by character
	
	//this operation improvves performace of the system by reducing number of read operations
	
	
	//constructors 
	
	//BufferedReader br=new BufferedReader(Reader r)
	
	//BufferedReader br=new BufferedReader(Reader r, int bufferSize)
	
	//buffered reader cannot communicate with teh file directly
	
	//compulsory it should communicate via some reader object only
	
	//important methods are :
	
	//int read()
	
	//int read(char ch[])
	
	//close()
	
	//String readLine();
	
	//the above method attempts to fins the next line , and if teh next line is available it returns it other wise it returns null
	
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vr.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		
		
		
		System.out.println("++++++++++++++++++++++++");
		
		
FileReader frr=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vrrs.txt");
		
		BufferedReader brrr=new BufferedReader(frr);
		
		line=brrr.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=brrr.readLine();
		}
		
		
		br.close();
		
		brrr.close();
	}
	
	
	//when ever you are closing buffered reader the underlyign readers will be closed
}

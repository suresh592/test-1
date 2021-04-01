package com.scjppreparation.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		
		
		
		PrintWriter pw=new PrintWriter("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vrrs.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vrr.txt"));
		
		String line=br.readLine();
		
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
			
		}
		
BufferedReader brr=new BufferedReader(new FileReader("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Vr.txt"));
		
		line=brr.readLine();
		
		//System.out.println(line);
		while(line!=null)
		{
			pw.println(line);
			line=brr.readLine();
			
		}
		
		
		System.out.println("hiiiii");

		
File f=new File("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz\\Vrrs.txt");
		
FileReader fr=new FileReader(f);
		BufferedReader brrr=new BufferedReader(fr);
		
		String l=brrr.readLine();
		System.out.println(l);
		while(l!=null)
		{
			System.out.println(l);
			l=brrr.readLine();
		}
		
		
		
		
		pw.close();
		br.close();
		brr.close();
		brrr.close();
	}
	
	
}

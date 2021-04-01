package com.scjppreparation.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


//Here 3 programs are not done refer when needed pg no 626
public class FMereg1 {

	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		PrintWriter pw=new PrintWriter("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Vrrss.txt");
		
	BufferedReader br=new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\eclipse-workspace\\\\\\\\SCJP\\\\\\\\xyz\\\\\\\\Vrr.txt"));
		
	BufferedReader br1=new BufferedReader(new FileReader("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Vr.txt"));
	
	String line =br.readLine();
	
	String line2=br1.readLine();
	
	while(line!=null|line2!=null)
	{
		
pw.println(line);
pw.println(line2);

line=br.readLine();

line2=br1.readLine();
	}
		
		
	pw.close();
	
	br.close();
	br1.close();
	
	display();
	
	
	}

	private static void display() throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader vr=new BufferedReader(new FileReader("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SCJP\\\\xyz\\\\Vrrss.txt"));
	
	String line=vr.readLine();
	
	while(line!=null)
	{
		System.out.println(line);
		line=vr.readLine();
	}
	
		
	
	}
	
	
	
}

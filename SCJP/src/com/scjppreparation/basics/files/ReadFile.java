
package com.scjppreparation.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	
	public static void main(String[] args) throws IOException {
		
		
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
				
				brrr.close();
	}
}

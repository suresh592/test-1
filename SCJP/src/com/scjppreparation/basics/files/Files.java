package com.scjppreparation.basics.files;

import java.io.File;
import java.io.IOException;

public class Files {

	
//	File f=new File(String name);
//	
//	//create a java file object to represent the name of the file or directory
//	
//	File F=new File(String subdir, String name)
//			
//			to create a file or directlory present in some other sub directory
//			
//			File ff=new File(File sundir, String name)
//			
//			
	
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("abc.txt");
		
		f.createNewFile();
		
		
		File ff=new File("xyz");
		ff.mkdir();
		
		
		//with respect to create a new file in teh xyz directory
		
		File fs=new File(ff,"Vr.txt");
		
		fs.createNewFile();
		
		//or
		
		File fdir=new File("xyz","Vrr.txt");
		
		fdir.createNewFile();
		
		
		//important methods of file class
		
		//boolean exists()    returns true id the physical file or directory exists
		
		//boolean createNewFile() 
		
		//first this method will check whether the specified file is already available or not. if it is already 
		
		//available then this method returns false without creating new file. ifit si already available then this method returns true 
		
		//after creating the new file
		
		//boelean mkdir()
		
		//boolean isFile()
		
		//boolean isDirectory()
		
		//String[] list()    it retuns teh name of all files and sub directories present in the specified directroy
		
		//boolean delete( )    to delete a file or directory
		
		//long lenght()     returns the numbe rof characters present in teh specified file	
		
		
		
		File list=new File("C:\\Users\\DELL\\eclipse-workspace\\SCJP\\xyz");
		
		String[] lists=list.list();
	
		for(String lis:lists)
		{
			System.out.println(lis);
		}
		
	}
}

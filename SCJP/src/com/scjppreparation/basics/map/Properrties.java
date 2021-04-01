package com.scjppreparation.basics.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properrties {

	//it is teh child class of Hash table
	
	//in our program which changes any thing frequentluy like db names, passwords and urls never recommended
	
	//to hard code the value in thejava program
	
	//because for every change we j=have to recompile, rebuk=ild , redeploy the application. some times even server restart is also required
	
	//this phonemona creates a big impact on the client
	
	//we have to configure those variables inside properities files adn we have to read those valeus form Java code
	
	//the main advantage is 	if any change in the properities file just redeployement is enough which is not he
	
	//business impact on the client
	
	
	//constructor
	
	//Properities p=new Properities()
	
	//Methods
	
	//String getProperity()    returns the value assocoated with teh getProperity Methods
	
	//String setProperity(String pname, String pvalue)       to set a  new properity
	
	//Enumeration properityNames
	
	//void load(InputStream is)    to load the properities from java properities into object
	
	//void store(OutputStream os,String comment)   to update properities from properities ibejct into properitiesd file
	
	
	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ganga\\eclipse-workspace\\SCJP\\src\\com\\scjppreparation\\basics\\map\\abc.properties");
		
		p.load(fis);
		
		System.out.println(p);
		
		String s=p.getProperty("venki");
		
		System.out.println(s);
		
		p.setProperty("nag", "9999");
		
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\ganga\\\\eclipse-workspace\\\\SCJP\\\\src\\\\com\\\\scjppreparation\\\\basics\\\\map\\\\abc.properties");
		
		
		p.store(fos, "Updated by Sai Gangadhar");
	}
}

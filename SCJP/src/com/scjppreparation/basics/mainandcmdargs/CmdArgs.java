package com.scjppreparation.basics.mainandcmdargs;

public class CmdArgs {
	public static void main(String[] args) {
		
		//the args which are passing fomr command prompt are called command line arguements
		//using cmd args we can sustomize the behaiour of Main Method
		
		for(String arg:args)
		{
			System.out.println(arg);
		}
		
		
		//with in teh main only ccommand line arguements are avaialable
		//space is the separator between commandline arguments
		//if the command line arguements itself contains space then we should enclose it with  " "
		
	}

}

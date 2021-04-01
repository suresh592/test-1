package com.scjppreparation.basics.garbagecollector;

public class Finalizee {

	//just before destroyign teh object gc always ccalls the finalize method for clean up activitieson that object
	
	//finalize method decalred in  obejct class with the following declaration
	
	//protectedd void finalize() throws throwable
	
	//   * ******************   case 1
	
	//gc always calls finalize on the object which is eligible for gc
	
	//jjust before destruction of the corresponding class finalize will be executed 
	
	//if String gobjet eligibel for gc then String class finalize will be called but not test class finalize method
	
	public static void main(String[] args) {
		
		String s=new String("Sai");
		
		s=null;
		System.gc();
		System.out.println("End of the main");
		
		Finalizee fs=new Finalizee();
		
		//we are calling finalize explicitly
		
	//	fs.finalize();
		//fs.finalize();
		
		fs=null;
		
		//we can call gc any number of times in a program
				System.gc();
				
				
				
				
				System.out.println("End off the mainnnn");
				
				System.out.println("Finalize id going to be called automatically");
				
				System.gc();
		
	}
	
	public void finalize()
	{
		System.out.println("FinaliE methodd called");
		
		System.out.println(10/0);
	}
	
	//in teh above program String obejct is eligible for gc hence string class finalize willl be executed which has empty implementation
	
	//if we are replacting string obejct with finalize objec then test class finalize will be executed
	
	//we can call finalize explicityly in this case that method is executed just like a normal methodand object wont be destroyed
	
	//just before destruction of an object gc will always calls finalize
	
	
	//before the destruction of the servlet object web container always calls the destroy method to perform clean up activities
	
	//its not possible to call destroy method form inti() and serice() methods explicitly
	
	//if oyu e=call exoicitlyit is just executed like a normal methodcall and servlet object wont be dewstroyed
	
	
	//case 3 ********************
	
	//if we are callling teh finalize explicitly adn while executing that finalize if any exception raised and incaughr then the program
	
	//will be terminated abnormally
	
	//if GC calls finalieze and while executing that finalize if any exception is uncaught then simple jvm ignires that uncaught excpetio
	
	//	rest of the program will be executed abnormally
	
	
	//in this program if we are not ocmmenting lines 31 and 32then tthe program will be terminated abnormallu
	
	//if we are commenign those lines then the gc calls finalize() method andd the raised arithmetic exception is ignored by JVM.
	
	//hence in this case the output is //End of main   //Finalize method is called
	
	//while execuing finalize() only teh uncaught exceptions are ignored by the JVM
	
	//on nay obejct gc calls finalized only once
	
}
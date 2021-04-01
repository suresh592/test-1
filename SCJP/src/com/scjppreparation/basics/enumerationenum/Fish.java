package com.scjppreparation.basics.enumerationenum;

public enum Fish {
	
	//teh first line of the enum must be the ocnstants other wise we will get teh errir
//	public void m1()
//	{
//		
//	}
	
	Star, Gold, APolo, Guppy, Killer, Boche, Zilebi;
	
	
	//with in enum we can tak econstructors also
	
		//enum class constructors willl be executed automatically at teh time of enum class loading because enum constantss will be created
		
		//at the time of class loadding only
	
	Fish() {
	System.out.println("This is the COnstrucroi iin fis=h class");
		// TODO Auto-generated constructor stub
	}
	
	//we cannot create object of enum explicityly hence we cannot call constructors dorectly
	
	//in addition to the above constants  if we want to take any extra members 	
	
	//compulsory list of constants should be the first line and should ends 
	public static void main(String[] args) {
		
		System.out.println("Enum main method");
	}

	
	
	//inside enum without having constant we cant take any extra memberrs but empty enum is always valid

}

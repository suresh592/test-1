package com.scjppreparation.basics.innerclasses;

public class AnonymInnerClsInetrface {

	//These example will gives us an anonymous inner class that implements an inetrface
	
	public static void main(String[] args) {
		
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=0;i<5;i++)
				{
					System.out.println("Child Thread "+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		
		Thread t=new Thread(r);
		
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		
		//Anonymousinner classes that define inside the method arguement	
		
		
		new Thread() {
			Runnable r=new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					for(int i=0;i<5;i++)
					{
						System.out.println("Child Thread 1"+i);
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			};
		}.start();
		
		for(int i=0;i<1;i++)
		{
			System.out.println("Main THread 1 " +i);
		}
		
	}
	
	
	
	//General classes vs anonymous inner classes
	
	
	//a general calss can extends only one classa at a time where as anonymousinner class can extends only one class at a tiem
	
	//A general class can implement only any number ofinterfacesa and an anonymous inner class can implement only one interface at a time
	
	//a general class can extends a class and implement any number of interfaces simultaneously where as an anonymous inner class
	
	//can extends or implements any one at a time or simultaneously
}

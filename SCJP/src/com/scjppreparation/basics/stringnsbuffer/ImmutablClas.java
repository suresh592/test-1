package com.scjppreparation.basics.stringnsbuffer;

final class ImmutablClas {

	
	//not working propr=erly 
	
	
	//check in oyutube
	
	private String name;

	public ImmutablClas(String name) {
		this.name = name;
		modify(name);

	}
	
	
	public ImmutablClas modify(String name)
	{
		if(this.name==name)
		{
			System.out.println(this.name+"\t"+name);
			return this;
		}
		else
		{
			return (new ImmutablClas(name));
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		ImmutablClas im=new ImmutablClas("Saai");
		
		ImmutablClas i=new ImmutablClas("Leader");
		
		ImmutablClas ij=new ImmutablClas("Saai");
		
		System.out.println(im==i);
		
		System.out.println(im==ij);
		
	}
	
}

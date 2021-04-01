package com.scjppreparation.basics.constructors;

public class CopyCOnstructor {

	int num;
	String name;
	public CopyCOnstructor(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public CopyCOnstructor(CopyCOnstructor st) {
		// TODO Auto-generated constructor stub
		
		this.num=st.num;
		this.name=st.name;
		
	}
	
	
	
	public CopyCOnstructor() {
		// TODO Auto-generated constructor stub
	}

	void display()
	{
		System.out.println(num+"\t"+name);
	}
	
	@Override
	public String toString() {
		return "CopyCOnstructor [num=" + num + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		CopyCOnstructor cc=new CopyCOnstructor(215, "Veera Swamy");
		
		CopyCOnstructor c=new CopyCOnstructor(cc);
		
	cc.display();
	c.display();
		cc.toString();
		
		c.toString();
	
	
		
		//by using hte literal
		

		CopyCOnstructor ccc=new CopyCOnstructor();
		
		c.num=ccc.num;
		c.name=ccc.name;
		
		ccc.display();
		
	
	
	}
	
}

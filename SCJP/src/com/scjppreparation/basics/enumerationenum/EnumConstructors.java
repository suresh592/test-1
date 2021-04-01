package com.scjppreparation.basics.enumerationenum;
enum Fruits
{
	Apple, Mango, Guava, Dates, Kajura, PineApple;
	
	int price;

	Fruits(int price) {
		this.price = price;
	}
	
	Fruits() {
		
	this.price=245;
	}
	
	public int getPrice()
	{
		return price;
	}
}
public class EnumConstructors  {

	//when compared with old languages enum ,java benum i smore powerful because in addition to constants we can take variables,
	
	//methods, constants... which may no tpossible in old languages	
	
	//this  	extra facility is due to internal implementation of enum concept which is class based
	
	
	//inside enum we can decalre the main method and hence we can invoke enum class dorectly form cokmmand prompt
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Fruits.Apple.equals(Fruits.Dates));
		
		System.out.println(Fruits.Guava.hashCode());
		
		System.out.println(Fruits.PineApple.ordinal()>Fruits.Guava.ordinal());
		
		
		Fruits[] fs=Fruits.values();
		
		for(Fruits fss:fs)
		{
			System.out.println(fss +"\t"+fss.getPrice());
		}
		
		
		//with in teh enum we can take instance adn statc methods but we cannot take abstract methods
		
		//every enum contant represents an object hence what ever the methods we can apply on normal java object we can apply those
		
		//on the enum constants also
	}
	
}

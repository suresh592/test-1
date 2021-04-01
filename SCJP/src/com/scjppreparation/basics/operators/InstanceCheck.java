package com.scjppreparation.basics.operators;

public class InstanceCheck extends InstanceOfOperator{
	
	public static void main(String[] args) {
		
		InstanceOfOperator in=new InstanceOfOperator();
		InstanceCheck ins=new InstanceCheck();
		System.out.println(ins instanceof InstanceOfOperator);
		System.out.println(in instanceof InstanceCheck);
		
	}

}

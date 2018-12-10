package com.elong.design.pattern.ch28Visitor;

public class Fail extends Action {

	@Override
	public void GetManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println("When " + concreteElementA.getClass().getName() + " is " 
				+ this.getClass().getName() + ",he is fail");

	}

	@Override
	public void GetWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println("When " + concreteElementB.getClass().getName() + " is " 
				+ this.getClass().getName() + ",she is fail");

	}

}

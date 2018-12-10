package com.elong.design.pattern.ch28Visitor;

public class Man extends Person {

	@Override
	public void Accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.GetManConclusion(this);
	}

	

}

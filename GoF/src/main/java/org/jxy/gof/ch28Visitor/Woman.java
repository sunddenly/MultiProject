package com.elong.design.pattern.ch28Visitor;

public class Woman extends Person {

	@Override
	public void Accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.GetWomanConclusion(this);
	}

	

}

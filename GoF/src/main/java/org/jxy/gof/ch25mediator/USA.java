package com.elong.design.pattern.ch25mediator;

public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void Declare(String message) {
		mediator.Declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("USA get message from the other side:" + message);
	}

}

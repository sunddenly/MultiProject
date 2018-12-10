package com.elong.design.pattern.ch25mediator;

public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void Declare(String message) {
		mediator.Declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("Iraq get message from the other side:" + message);
	}

}

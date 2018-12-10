package com.elong.design.pattern.ch14observer;

import java.util.ArrayList;
import java.util.List;

public class Secretary extends Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public void Attach(Observer observer) {
		observers.add(observer);
	}
	public void Detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void Notify() {
		for (Observer o : observers) {
			o.Update();
		}
			
		
	}

}

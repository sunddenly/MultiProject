package com.elong.design.pattern.ch14observer;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public void Attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);

	}

	@Override
	public void Detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);

	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.Update();
		}

	}

}

package com.elong.design.pattern.ch14observer;

public abstract class Subject {
	
	public abstract void Attach(Observer observer);
	public abstract void Detach(Observer observer);
	public abstract void Notify();
	public abstract String getAction();
	public abstract void setAction(String action);
	

}

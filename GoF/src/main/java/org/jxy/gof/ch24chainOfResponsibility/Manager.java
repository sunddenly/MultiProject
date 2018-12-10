package com.elong.design.pattern.ch24chainOfResponsibility;

public abstract class Manager {
	
	protected String name;
	protected Manager superior;
	public Manager(String name) {
		this.name = name;
	}
	
	public void SetSuperior(Manager superior) {
		this.superior = superior;
	}
	
	public abstract void RequestApplications(Request req);
	
}

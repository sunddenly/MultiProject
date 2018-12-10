package com.elong.design.pattern.ch26flyweight;

public class ConcreteWebSite extends WebSite {
	
	private String name = "";
	

	public ConcreteWebSite(String name) {
		super();
		this.name = name;
	}


	@Override
	public void Use(User user) {
		// TODO Auto-generated method stub
		System.out.println("Web class:" + name + "; user:" + user.getName());

	}

}

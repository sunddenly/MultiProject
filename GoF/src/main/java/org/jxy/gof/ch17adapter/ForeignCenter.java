package com.elong.design.pattern.ch17adapter;

public class ForeignCenter {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void 进攻() {
		System.out.println("�з� " + name + " ����!!!");
	}
	
	public void 防守() {
		System.out.println("�з� " + name + " ����!!!");
	}

}

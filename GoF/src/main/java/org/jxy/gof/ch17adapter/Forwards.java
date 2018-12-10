package com.elong.design.pattern.ch17adapter;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Forward " + name + " Attack!!!");

	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Forward " + name + " Defense!!!");

	}

}

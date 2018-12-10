package com.elong.design.pattern.ch17adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Guard " + name + " Attack!!!");

	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Guard " + name + " Defense!!!");

	}

}

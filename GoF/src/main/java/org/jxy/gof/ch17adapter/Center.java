package com.elong.design.pattern.ch17adapter;

public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Center " + name + " Attack!!!");

	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Center " + name + " Defense!!!");

	}

}

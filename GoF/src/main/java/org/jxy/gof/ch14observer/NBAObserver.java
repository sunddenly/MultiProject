package com.elong.design.pattern.ch14observer;

public class NBAObserver extends Observer {
	
	public NBAObserver(String name,Subject sub) {
		super(name, sub);
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.printf(super.sub.getAction() + "," + super.name + " stop watching NBA!!! go on working!!!\n");

	}

}

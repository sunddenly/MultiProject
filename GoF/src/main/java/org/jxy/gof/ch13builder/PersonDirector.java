package com.elong.design.pattern.ch13builder;

public class PersonDirector {
	
	private PersonBuilder pb;
	
	public PersonDirector(PersonBuilder pb) {
		this.pb = pb;
	}
	
	public void CreatePerson() {
		pb.BuildHead();
		pb.BuildBody();
		pb.BuildArmLeft();
		pb.BuildArmRight();
		pb.BuildLegLeft();
		pb.BuildLegRight();
	}

}

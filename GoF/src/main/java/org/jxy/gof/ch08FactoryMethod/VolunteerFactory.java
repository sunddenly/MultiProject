package com.elong.design.pattern.ch08FactoryMethod;

public class VolunteerFactory implements IFactory {

	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}

package com.elong.design.pattern.ch16state;

public class RestState extends State {

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		System.out.println("Current time is " + work.getHour() + " o'clock,I came back home!");

	}

}

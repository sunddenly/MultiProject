package com.elong.design.pattern.ch16state;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		int hour = work.getHour();
		
		if(hour < 13) {
			System.out.println("Current time is " + hour + " o'clock,I'm a little hungary and tired!");
		} else {
			work.SetState(new AfternoonState());
			work.WriteProgram();
		}

	}

}

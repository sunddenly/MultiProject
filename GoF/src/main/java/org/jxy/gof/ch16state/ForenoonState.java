package com.elong.design.pattern.ch16state;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		int hour = work.getHour();
		
		if(hour < 12) {
			System.out.println("Current time is " + hour + " o'clock,I'm exciting!");
		} else {
			work.SetState(new NoonState());
			work.WriteProgram();
		}

	}

}

package com.elong.design.pattern.ch16state;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		int hour = work.getHour();
		
		if(hour < 13) {
			System.out.println("Current time is " + hour + " o'clock,I'm ok,keep on working!");
		} else {
			work.SetState(new AfternoonState());
			work.WriteProgram();
		}


	}

}

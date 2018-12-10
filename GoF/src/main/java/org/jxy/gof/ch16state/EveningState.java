package com.elong.design.pattern.ch16state;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		boolean workFinished = work.isWorkFinished();
		int hour = work.getHour();
		
		if (workFinished) {
			work.SetState(new RestState());
			work.WriteProgram();
		} else {
			if (hour <21) {
				System.out.println("Current time is " + hour + " o'clock,I'm too tired!");
			} else {
				work.SetState(new SleepingState());
				work.WriteProgram();
			}
		}

	}

}

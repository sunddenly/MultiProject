package com.elong.design.pattern.ch16state;

public class Work {
	
	public int hour = 0;
	public boolean workFinished = false;
	private State current;
	
	public void Work() {
		current = new ForenoonState();
	}
	
	
	
	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public boolean isWorkFinished() {
		return workFinished;
	}



	public void setWorkFinished(boolean workFinished) {
		this.workFinished = workFinished;
	}
	
	public void SetState(State s) {
		current = s;
	}



	public void WriteProgram() {
		if (hour < 12) {
			System.out.println("Current time is " + hour + " o'clock,I'm exciting!");
		} else if (hour < 13) {
			System.out.println("Current time is " + hour + " o'clock,I'm a little hungary and tired!");
		} else if (hour < 17) {
			System.out.println("Current time is " + hour + " o'clock,I'm ok,keep on working!");
		} else {
			if (workFinished) {
				System.out.println("Current time is " + hour + " o'clock,I came back home!");
			} else {
				if (hour <21) {
					System.out.println("Current time is " + hour + " o'clock,I'm too tired!");
				} else {
					System.out.println("Current time is " + hour + " o'clock,I'm asleep!");
				}
			}
		}
		
	}

}

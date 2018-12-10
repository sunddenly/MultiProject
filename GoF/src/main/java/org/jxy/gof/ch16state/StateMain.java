package com.elong.design.pattern.ch16state;

public class StateMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work work = new Work();
		
		work.setHour(9);
		work.WriteProgram();
		work.setHour(10);
		work.WriteProgram();
		work.setHour(12);
		work.WriteProgram();
		work.setHour(13);
		work.WriteProgram();
		work.setHour(14);
		work.WriteProgram();
		work.setHour(17);
		work.WriteProgram();
		
		work.setWorkFinished(false);
		
		work.setHour(19);
		work.WriteProgram();
		work.setHour(22);
		work.WriteProgram();

	}

}

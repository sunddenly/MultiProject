package com.elong.design.pattern.ch18momento;

public class MomentoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameRole jake = new GameRole();
		jake.GetInitState();
		jake.StateDisplay();
		
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMomento(jake.SaveState());
		
		jake.Fight();
		jake.StateDisplay();
		
		jake.RecoveryState(stateAdmin.getMomento());
		
		jake.StateDisplay();

	}

}

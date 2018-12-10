package com.elong.design.pattern.ch25mediator;

public class MediatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);
		
		UNSC.setColleague1(c1);
		UNSC.setColleague2(c2);
		
		c1.Declare("Don't make dashaqi or we'll fight you!!!");
		c2.Declare("We have no dashaqi and we don't afraid of you!!!");
		
		

	}

}

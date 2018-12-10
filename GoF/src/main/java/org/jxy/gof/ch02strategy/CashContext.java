package com.elong.design.pattern.ch02strategy;

public class CashContext {
	
	CashSuper cs = null;
	
	public CashContext(String type){

		char charType = type.charAt(0);
		//char charType = (char)type;
		switch (charType){
		case 'n':
			cs = new CashNormal();
			break;
		case 'r':
			CashReturn cr1 = new CashReturn("300","100");
			cs = cr1;
			break;
		case '8':
			CashRebate cr2 = new CashRebate("0.8");
			cs = cr2;
			break;
			
		}
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}

}

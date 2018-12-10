package com.elong.design.pattern.ch02strategy;

public class CashFactory {
	
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
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
		return cs;
	}

}

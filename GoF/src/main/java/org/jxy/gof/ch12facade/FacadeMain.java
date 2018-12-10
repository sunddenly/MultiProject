package com.elong.design.pattern.ch12facade;

public class FacadeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Stock1 gu1 = new Stock1();
		Stock2 gu2 = new Stock2();
		Stock3 gu3 = new Stock3();
		NationalDept1 nd1 = new NationalDept1();
		Realty1 rt1 = new Realty1();
		
		gu1.Buy();
		gu2.Buy();
		gu3.Buy();
		nd1.Buy();
		rt1.Buy();
		
		gu1.Sell();
		gu2.Sell();
		gu3.Sell();
		nd1.Sell();
		rt1.Sell();
		*/
		
		Fund jijin = new Fund();
		jijin.BuyFund();
		jijin.SellFund();

	}

}

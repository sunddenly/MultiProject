package com.elong.design.pattern.ch12facade;

public class Fund {
	
	Stock1 gu1;
	Stock2 gu2;
	Stock3 gu3;
	NationalDept1 nd1;
	Realty1 rt1;
	
	public Fund() {
		gu1 = new Stock1();
		gu2 = new Stock2();
		gu3 = new Stock3();
		nd1 = new NationalDept1();
		rt1 = new Realty1();
	}
	
	public void BuyFund() {
		gu1.Buy();
		gu2.Buy();
		gu3.Buy();
		nd1.Buy();
		rt1.Buy();
	}
	
	public void SellFund() {
		gu1.Sell();
		gu2.Sell();
		gu3.Sell();
		nd1.Sell();
		rt1.Sell();
	}

}

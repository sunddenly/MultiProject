package com.elong.design.pattern.ch14observer;

public class StockObserver extends Observer{
	
	
	public StockObserver(String name,Subject sub) {
		super(name,sub);
	}
	
	public void Update(){
		System.out.printf(super.sub.getAction() + "," + super.name + " stop stocking!!! go on working!!!\n");
	}

}

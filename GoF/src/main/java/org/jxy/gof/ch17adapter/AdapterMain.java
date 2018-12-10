package com.elong.design.pattern.ch17adapter;

public class AdapterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player b = new Forwards("Battier");
		b.Attack();
		Player m = new Guards("T-mac");
		m.Attack();
		
		//Player ym = new Center("Yao");
		Player ym = new Translator("Yao");
		ym.Attack();
		ym.Defense();

	}

}

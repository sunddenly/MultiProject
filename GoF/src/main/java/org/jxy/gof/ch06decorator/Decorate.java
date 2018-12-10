package com.elong.design.pattern.ch06decorator;

public class Decorate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("wangyi");
		
		System.out.println("\n the first decorate:\n");
		
		TShirts dtx = new TShirts();
		BigTrouser kk = new BigTrouser();
		Sneakers pqx = new Sneakers();

		pqx.Decorate(xc);
		kk.Decorate(pqx);
		dtx.Decorate(kk);
		dtx.Show();
		
		System.out.println("\n the second decorate:\n");
		
		Suit xz = new Suit();
		Tie ld = new Tie();
		LeatherShoes px = new LeatherShoes();
		
		px.Decorate(xc);
		ld.Decorate(px);
		px.Decorate(ld);
		xc.Show();

	}

}

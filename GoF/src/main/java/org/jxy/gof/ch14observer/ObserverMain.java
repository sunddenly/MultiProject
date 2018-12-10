package com.elong.design.pattern.ch14observer;

public class ObserverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretary sec = new Secretary();
		Boss boss = new Boss();
		
		StockObserver so1 = new StockObserver("tongshi1",sec);
		NBAObserver so2 = new NBAObserver("tongshi2",sec);
		StockObserver so3 = new StockObserver("tongshi3",boss);
		NBAObserver so4 = new NBAObserver("tongshi4",boss);
		NBAObserver so5 = new NBAObserver("tongshi5",boss);
		
		sec.Attach(so1);
		sec.Attach(so2);
		boss.Attach(so3);
		boss.Attach(so4);
		boss.Attach(so5);
		boss.Detach(so4);
		
		sec.setAction("boss is comming!!!");
		boss.setAction("I'boss!!!");
		
		sec.Notify();
		boss.Notify();

	}

}

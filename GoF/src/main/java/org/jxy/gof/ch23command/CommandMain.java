package com.elong.design.pattern.ch23command;

public class CommandMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		girl.SetOrder(bakeMuttonCommand1);
		girl.SetOrder(bakeMuttonCommand2);
		girl.SetOrder(bakeChickenWingCommand);
		girl.CancelOrder(bakeChickenWingCommand);
		girl.SetOrder(bakeChickenWingCommand);
		girl.Notify();

	}

}

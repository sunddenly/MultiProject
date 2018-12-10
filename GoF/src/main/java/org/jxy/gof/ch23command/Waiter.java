package com.elong.design.pattern.ch23command;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Waiter {
	
	private List<Command> orders = new ArrayList<Command>();;
	
	public void SetOrder(Command command) {
		if (command.toString() == "Command Pattern.BakeChickenWingCommand") {
			System.out.println("Waiter:chicken wing is null,order other please!");
		} else {
			orders.add(command);
			System.out.println("Add order: " + command.toString() + " time: " + new Date().toString());
		}
	}
	
	public void CancelOrder(Command command) {
		orders.remove(command);
		System.out.println("Cancel order: " + command.toString() + " time: " + new Date().toString());
	}
	
	public void Notify() {
		for (Command command : orders) {
			command.ExecuteCommand();
		}
	}

}

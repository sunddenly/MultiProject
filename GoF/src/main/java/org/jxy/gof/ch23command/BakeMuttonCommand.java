package com.elong.design.pattern.ch23command;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExecuteCommand() {
		// TODO Auto-generated method stub
		receiver.BakeMutton();

	}

}

package com.elong.design.pattern.ch24chainOfResponsibility;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request req) {
		// TODO Auto-generated method stub
		if (req.getReqType() == "ask for leave") {
			System.out.println(name + ": " + req.getReqContent() + " number:" + req.getNumber() + " is applied.");
		} else if ((req.getReqType() == "ask for raise wages") && (req.getNumber() <= 500)) {
			System.out.println(name + ": " + req.getReqContent() + " number:" + req.getNumber() + " is applied.");
		} else if ((req.getReqType() == "ask for raise wages") && (req.getNumber() > 500)) {
			System.out.println(name + ": " + req.getReqContent() + " number:" + req.getNumber() + " no way!!!");
		}
	
	}

}

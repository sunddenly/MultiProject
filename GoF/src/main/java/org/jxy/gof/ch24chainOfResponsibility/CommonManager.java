package com.elong.design.pattern.ch24chainOfResponsibility;

public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request req) {
		// TODO Auto-generated method stub
		if ((req.getReqType() == "ask for leave") && (req.getNumber() <= 2)) {
			System.out.println(name + ": " + req.getReqContent() + " number:" + req.getNumber() + " is applied.");
		} else if (superior != null) {
			superior.RequestApplications(req);
		}

	}

}

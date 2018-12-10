package com.elong.design.pattern.ch24chainOfResponsibility;

public class ChainOfResponsibilityMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManager jingli = new CommonManager("jingli");
		Majordomo zongjian = new Majordomo("zongjian");
		GeneralManager zongjingli = new GeneralManager("zongjingli");
		jingli.SetSuperior(zongjian);
		zongjian.SetSuperior(zongjingli);
		
		Request req1 = new Request();
		req1.setReqType("ask for leave");
		req1.setReqContent("Wang needs to leave");
		req1.setNumber(1);
		jingli.RequestApplications(req1);
		
		Request req2 = new Request();
		req2.setReqType("ask for leave");
		req2.setReqContent("Wang needs to leave");
		req2.setNumber(4);
		jingli.RequestApplications(req2);
		
		Request req3 = new Request();
		req3.setReqType("ask for raise wages");
		req3.setReqContent("Wang needs to raise wages");
		req3.setNumber(500);
		jingli.RequestApplications(req3);
		
		Request req4 = new Request();
		req4.setReqType("ask for raise wages");
		req4.setReqContent("Wang needs to raise wages");
		req4.setNumber(1500);
		jingli.RequestApplications(req4);
		
		

	}

}

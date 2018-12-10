package com.elong.design.pattern.ch10TemplateMethod;

public class TestPaper {
	
	public void TestQuestion1() {
		System.out.println("the selection if question1 are : a.A,b.B,c.C,d.D");
		System.out.println("the answer of question1 is : " + Answer1());
	}	
	protected String Answer1() {
		return "";
	}
	
	public void TestQuestion2() {
		System.out.println("the selection if question2 are : a.A,b.B,c.C,d.D");
		System.out.println("the answer of question1 is : " + Answer2());
	}
	protected String Answer2() {
		return "";
	}
	
	public void TestQuestion3() {
		System.out.println("the selection if question3 are : a.A,b.B,c.C,d.D");
		System.out.println("the answer of question1 is : " + Answer3());
	}
	protected String Answer3() {
		return "";
	}

}

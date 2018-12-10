package com.elong.design.pattern.ch10TemplateMethod;

public class TestPaperA extends TestPaper {
	
	@Override
	public String Answer1() {
		return "b";
	}
	
	@Override
	public String Answer2() {
		return "c";
	}
	
	@Override
	public String Answer3() {
		return "a";
	}

}

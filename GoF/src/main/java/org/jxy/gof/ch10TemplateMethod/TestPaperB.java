package com.elong.design.pattern.ch10TemplateMethod;

public class TestPaperB extends TestPaper {
	
	@Override
	public String Answer1() {
		return "c";
	}
	
	@Override
	public String Answer2() {
		return "a";
	}
	
	@Override
	public String Answer3() {
		return "a";
	}

}

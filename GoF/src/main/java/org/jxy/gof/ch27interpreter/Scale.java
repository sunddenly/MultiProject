package com.elong.design.pattern.ch27interpreter;

public class Scale extends Expression {

	@Override
	public void Execute(String key, double value) {
		// TODO Auto-generated method stub
		String scale = "";
		int val = (int) value;
		switch (val) {
		case 1:
			scale = "Low Scale";
			break;
		case 2:
			scale = "Mid Scale";
			break;
		case 3:
			scale = "High Scale";
			break;
		
		}
		
		System.out.println(scale + " ");

	}

}

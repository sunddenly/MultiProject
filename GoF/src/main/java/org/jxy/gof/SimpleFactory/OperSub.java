package com.elong.design.pattern.SimpleFactory;

public class OperSub extends Operation{
	
	public int GetResult()
	{
		int result = 0;
		result = numA - numB;
		return result;
	}
}

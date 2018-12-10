package com.elong.design.pattern.ch28Visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure o = new ObjectStructure();
		o.Attach(new Man());
		o.Attach(new Woman());
		
		Success v1 = new Success();
		o.Display(v1);		
		Fail v2 = new Fail();
		o.Display(v2);		
		Love v3 = new Love();
		o.Display(v3);

	}

}

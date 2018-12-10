package com.elong.design.pattern.ch19composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	
	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);

	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println("-" + name);
	    
	    for (Company c : children) {
	      for (int i = 0;i < depth;i++) {
	        System.out.print("--");
	       }
	     c.Display(depth+2);
	     }

	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		for (Company c : children) {
			c.LineOfDuty();
		}

	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);

	}

}

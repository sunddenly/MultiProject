package com.elong.design.pattern.ch19composite;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println("-" + name);

	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name + " staffs' trainning and managing");

	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub

	}

}

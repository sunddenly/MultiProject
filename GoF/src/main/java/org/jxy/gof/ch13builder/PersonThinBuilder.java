package com.elong.design.pattern.ch13builder;

import java.awt.Graphics;

public class PersonThinBuilder extends PersonBuilder{
	
	//private Graphics g;
	
	public PersonThinBuilder(Graphics g) {
		super(g);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		g.drawLine(60, 50, 40, 100);
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		g.drawLine(70, 50, 90, 100);
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		g.drawRect(60, 50, 10, 50);
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		g.drawOval(50, 20, 30, 30);
	}

	@Override
	public void BuildLegLeft() {
		// TODO Auto-generated method stub
		g.drawLine(60, 100, 45, 150);
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		g.drawLine(70, 100, 85, 150);
	}

}

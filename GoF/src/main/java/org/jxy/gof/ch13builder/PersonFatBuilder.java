package com.elong.design.pattern.ch13builder;

import java.awt.Graphics;

public class PersonFatBuilder extends PersonBuilder{
	
	//private Graphics g;
	//private Pen p;
	
	public PersonFatBuilder(Graphics g) {
		super(g);
	}
	

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		g.drawLine(50, 50, 30, 100);
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		g.drawLine(80, 50, 100, 100);
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		g.drawOval(45, 50, 40, 50);
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

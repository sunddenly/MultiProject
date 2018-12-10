package com.elong.design.pattern.ch13builder;

import java.awt.Graphics;

public abstract class PersonBuilder {
	
	protected Graphics g;
	
	public PersonBuilder(Graphics g) {
		this.g = g;
	}
	
	public abstract void BuildHead();
	public abstract void BuildBody();
	public abstract void BuildArmLeft();
	public abstract void BuildArmRight();
	public abstract void BuildLegLeft();
	public abstract void BuildLegRight();

}

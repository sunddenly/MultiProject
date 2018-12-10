package com.elong.design.pattern.ch20Iterator;

public abstract class Iterator {
	
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean IsDone();
	public abstract Object CurrentItem();

}

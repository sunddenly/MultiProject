package com.elong.design.pattern.ch20Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
	
	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public int getCount() {
		return items.size();
	}
	
	public Object getEle(int index) {
		return items.get(index);
	}
	
	public void setEle(int index,Object value) {
		
		items.add(index, value);
	}

}

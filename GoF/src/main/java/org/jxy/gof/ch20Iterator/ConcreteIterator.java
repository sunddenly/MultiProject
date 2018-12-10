package com.elong.design.pattern.ch20Iterator;

public class ConcreteIterator extends Iterator {
	
	private ConcreteAggregate aggregate;
	private int cur = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.getEle(cur);
	}

	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.getEle(0);
	}

	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return cur >= aggregate.getCount() ? true : false;
	}

	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		Object ret = null;
		cur++;
		if (cur < aggregate.getCount()) {
			ret = aggregate.getEle(cur);
		}
		return ret;
	}

}

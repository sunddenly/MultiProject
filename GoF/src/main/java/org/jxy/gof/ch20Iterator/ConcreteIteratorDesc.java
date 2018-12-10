package com.elong.design.pattern.ch20Iterator;

public class ConcreteIteratorDesc extends Iterator {
	
	private ConcreteAggregate aggregate;
	private int cur = 0;
	
	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
		cur = aggregate.getCount() - 1;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.getEle(cur);
	}

	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.getEle(aggregate.getCount() - 1);
	}

	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return cur < 0 ? true : false;
	}

	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		Object ret = null;
		cur--;
		if (cur >= 0) {
			ret = aggregate.getEle(cur);
		}
		return ret;
	}

}

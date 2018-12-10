package com.elong.design.pattern.ch20Iterator;



public class IteratorMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteAggregate a = new ConcreteAggregate();
		
		a.setEle(0, "daniao");
		a.setEle(1, "xiaocai");
		a.setEle(2, "baggage");
		a.setEle(3, "foreigner");
		a.setEle(4, "staff");
		a.setEle(5, "thief");
		
		Iterator i = new ConcreteIterator(a);
		
		Object item = i.First();
		while (!i.IsDone()) {
			System.out.println(i.CurrentItem() + ",buy ticket please!");
			i.Next();
		}
		
		System.out.println("\n");
		
		Iterator iDesc = new ConcreteIteratorDesc(a);
		
		Object itemDesc = iDesc.First();
		while (!iDesc.IsDone()) {
			System.out.println(iDesc.CurrentItem() + ",buy ticket please!");
			iDesc.Next();
		}

	}

}

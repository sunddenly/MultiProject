package com.elong.design.pattern.ch28Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	
	private List<Person> elements = new ArrayList<Person>();
	
	public void Attach(Person ele) {
		elements.add(ele);
	}
	
	public void Detach(Person ele) {
		elements.remove(ele);
	}
	
	public void Display(Action visitor) {
		for (Person person : elements) {
			person.Accept(visitor);
		}
	}

}

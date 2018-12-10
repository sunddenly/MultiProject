package com.elong.design.pattern.ch19composite;

public class CompositeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteCompany root = new ConcreteCompany("Beijing");
		root.Add(new HRDepartment("Beijing HR"));
		root.Add(new FinanceDepartment("Beijing Finance"));
		
		ConcreteCompany comp = new ConcreteCompany("Shanghai");
		comp.Add(new HRDepartment("Shanghai HR"));
		comp.Add(new FinanceDepartment("Shanghai Finance"));
		root.Add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("Hangzhou");
		comp1.Add(new HRDepartment("Hangzhou HR"));
		comp1.Add(new FinanceDepartment("Hangzhou Finance"));
		comp.Add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("Nanjing");
		comp2.Add(new HRDepartment("Nanjing HR"));
		comp2.Add(new FinanceDepartment("Nanjing Finance"));
		comp.Add(comp2);
		
		System.out.println("\nConstruct-Map");
		root.Display(1);
		
		System.out.println("\nDuty");
		root.LineOfDuty();

	}

}

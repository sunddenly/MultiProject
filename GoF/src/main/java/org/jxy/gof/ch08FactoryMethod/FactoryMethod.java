package com.elong.design.pattern.ch08FactoryMethod;

public class FactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		LeiFeng xueleifeng = new Undergratuate();
		xueleifeng.BuyRice();
		xueleifeng.Sweep();
		xueleifeng.Wash();
		*/
		
		/*
		LeiFeng student1 = new Undergratuate();
		student1.BuyRice();
		LeiFeng student2 = new Undergratuate();
		student2.Sweep();
		LeiFeng student3 = new Undergratuate();
		student3.Wash();
		*/
		
		/*
		LeiFeng student1 = SimpleFactory.CreateLeiFeng("undergratuate");
		student1.BuyRice();
		LeiFeng student2 = SimpleFactory.CreateLeiFeng("undergratuate");
		student2.Sweep();
		LeiFeng student3 = SimpleFactory.CreateLeiFeng("undergratuate");
		student3.Wash();
		*/
		
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.CreateLeiFeng();
		
		student.BuyRice();
		student.Sweep();
		student.Wash();

	}

}

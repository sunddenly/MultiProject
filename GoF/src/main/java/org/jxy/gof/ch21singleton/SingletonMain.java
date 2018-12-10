package com.elong.design.pattern.ch21singleton;

public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.GetInstance();
		Singleton s2 = Singleton.GetInstance();
		
		if (s1 == s2) {
			System.out.println("They are same!!!");
		}

	}

}

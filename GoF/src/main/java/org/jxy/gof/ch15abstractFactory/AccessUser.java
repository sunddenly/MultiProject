package com.elong.design.pattern.ch15abstractFactory;

public class AccessUser implements IUser {

	public User GetUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("Get a record from table User in Access ");
		return null;
	}

	public void Insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("Insert a record for table User in Access ");

	}

}

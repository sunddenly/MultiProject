package com.elong.design.pattern.ch15abstractFactory;

public class SqlserverUser implements IUser{
	
	public SqlserverUser(){}

	public void Insert(User user) {
		System.out.println("Insert a record for table User in Sqlserver ");
	}
	
	public User GetUser(int id) {
		System.out.println("Get a record from table User in Sqlserver ");
		return null;
	}



}

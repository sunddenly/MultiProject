package com.elong.design.pattern.ch15abstractFactory;

import java.lang.reflect.InvocationTargetException;

public class AbstracFactoryMain {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		User user = new User();
		Department department = new Department();
		//IFactory factory = new SqlserverFactory();

		IUser iu = DataAccess.CreateUser();
		IDepartment idep = DataAccess.CreateDepartment();
		
		iu.Insert(user);
		iu.GetUser(1);
		idep.Insert(department);

	}

}

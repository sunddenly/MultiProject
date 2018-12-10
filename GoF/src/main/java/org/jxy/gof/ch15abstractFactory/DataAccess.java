package com.elong.design.pattern.ch15abstractFactory;
import java.lang.reflect.*;


public class DataAccess {
	
	
	private static final String db = "Sqlserver";
	//private static final String db = ConfigurationSettings.AppSettings["DB"];

	
	public static IUser CreateUser() throws InstantiationException, IllegalAccessException {
		/*
		IUser result = null;
		switch(db.charAt(0)) {
		case 'S':
			result = new SqlserverUser();
			break;
		case 'A':
			result = new AccessUser();
			break;
		}
		
		return result;
		*/
		String className = "ch15abstractFactory." + db + "User";
		IUser result = null;
		try {
			Class cls = Class.forName(className);
			Object obj = cls.newInstance();
			result = (IUser) obj;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (IUser) result;
	}
	
	public static IDepartment CreateDepartment() throws InstantiationException, IllegalAccessException {
		/*
		IDepartment result = null;
		switch(db.charAt(0)) {
		case 'S':
			result = new SqlserverDepartment();
			break;
		case 'A':
			result = new AccessDepartment();
			break;
		}
		
		return result;
		*/
		String className = "ch15abstractFactory." + db + "Department";
		IDepartment result = null;
		try {
			Class cls = Class.forName(className);
			Object obj = cls.newInstance();
			result = (IDepartment) obj;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (IDepartment) result;
		
	}

}

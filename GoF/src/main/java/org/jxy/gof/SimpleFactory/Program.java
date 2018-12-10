package com.elong.design.pattern.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			Operation oper;
			
			System.out.println("please input number A :");
			String strNumA = sc.nextLine();
			System.out.println("please input mark :");
			char strOperate = sc.nextLine().charAt(0);
			System.out.println("please input number B :");
			String strNumB = sc.nextLine();
			oper = OperFactory.createOperate(strOperate);
			oper.numA = Integer.valueOf(strNumA);
			oper.numB = Integer.valueOf(strNumB);

			System.out.println("the two nums are: " + Integer.valueOf(strNumA) + "and" + 
					Integer.valueOf(strNumB) + " while the mark is \"" + strOperate +"\"");
			int strResult = 0;
			
			strResult = oper.GetResult();
			
			System.out.println("the result is : " + strResult);
		}
		catch(Exception ex)
		{
			System.out.println("you have something wrong : " + ex.getMessage());
		}
	}

}

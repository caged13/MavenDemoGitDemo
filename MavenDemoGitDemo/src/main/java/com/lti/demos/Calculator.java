package com.lti.demos;

public class Calculator {

	public String hello()
	{
		return "Hello LTI";
	}

	public int addNos(int x, int y) {
		
		int result = x+y;
		return result;
	}
public int subNos(int x, int y) {
		
		int result = x-y;
		return result;
	}

public void searchEmp(int empid) {
	
		if (empid==0)
		{
			throw new ArithmeticException("zero");
		}
		else
		{
			System.out.println("do something");
		}
}


}

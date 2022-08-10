package com.lti.demos;

public class TestCalc {
	
	public static void main(String[] args)
	{
		
		  Calculator c = new   Calculator();
		    String msg = c.hello();
		    System.out.println(msg);
		    
		    int sum = c.addNos(200, 256);
		    System.out.println(sum);

	}
}

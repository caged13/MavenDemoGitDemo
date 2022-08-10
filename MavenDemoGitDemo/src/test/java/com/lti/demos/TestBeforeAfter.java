package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	int sum=0;
	Calculator c = new Calculator();
	@BeforeEach
	public void teststartup()
	{
		sum=0;
		System.out.println("the sum ="+ sum);
	}
	
	@Test
	public void testaddtwonumber() {
		System.out.println("test case1");
		int f =c.addNos(5,300);
		Assertions.assertEquals(305,f);
	}
	
	@Test
	public void testsubNos() {
		System.out.println("test case2");
		int f =c.subNos(5,300);
		Assertions.assertEquals(-295,f,"pls chk the subnosmethod code");
	}
	@AfterEach
	public void testshutdown() {
		System.out.println("some objectis null");
	}
	@BeforeAll
	public static void testdbconn() {
		System.out.println("DB connection is up -- only once --before all");
	}
	@AfterAll
	public static void testshutdbconn() {
		System.out.println("DB connection is shutdown -- only once --after all");
	}
}

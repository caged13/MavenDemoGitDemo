package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	Calculator c = new Calculator();
	@Test
	void testExcptions() {
		Assertions.assertThrows(IllegalArgumentException.class,
		()->{Integer.parseInt("one");});
	}
	@Test
	public void testmethodexp() {
		
		final Exception  e = assertThrows(ArithmeticException.class, ()->{c.searchEmp(0);});
		Assertions.assertEquals("zero",e.getMessage());
	}

}

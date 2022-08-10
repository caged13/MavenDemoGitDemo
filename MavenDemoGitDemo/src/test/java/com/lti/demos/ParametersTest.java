package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

	@ParameterizedTest
	@ValueSource(ints = {8,10,30,14,20})
	public void testIntAryParam(int arg) {
       System.out.println("args: "+ arg);
       Assertions.assertTrue(arg%2==0);
		
	}
	@DisplayName("should pass if nt null")
	@ParameterizedTest
	@ValueSource(strings= {"Hello","World"})
	public void testparams(String args) {
		Assertions.assertNotNull(args);
		
	}
	@Test
	public void testlambdalist() {
		Integer[] intary= {10,20,5,25};
		List<Integer> intlist =Arrays.asList(intary);
		
		Assertions.assertAll(
				()->assertEquals(10,intlist.get(0)),
				()->assertEquals(20,intlist.get(1)),
				()->assertEquals(5,intlist.get(2)),
				()->assertEquals(25,intlist.get(3))
				);
	}
    @RepeatedTest(value=3,name="repeate 3 times")
	public void repeateTest() {
		int a=10,b=30;
		Assertions.assertEquals(300,(a*b));
	}
}

package com.simple.java;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGenericTemplate {

	@Test
	public void TestGenericTemplateWithString() {		
		GenericTemplate<String> gtTest1 = new GenericTemplate<>("gtTest1");
		assertInstanceOf(String.class, gtTest1.getGenericObejct());
		assertEquals("gtTest1", gtTest1.printGenericObject());
	}
	
	@Test
	public void TestGenericTemplateWithInteger() {		
		GenericTemplate<Integer> gtTest1 = new GenericTemplate<>(7);
		assertInstanceOf(Integer.class, gtTest1.getGenericObejct());
		assertEquals(7, gtTest1.printGenericObject());
	}
}

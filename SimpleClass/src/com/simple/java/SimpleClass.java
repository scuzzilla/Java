package com.simple.java;

import java.util.LinkedList;

public class SimpleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a msg from the SimpleClass!");
		
		var gc = new GenericClass();
		gc.setStrings("Test1", "Test2");
		gc.getStrings();
		
		GenericTemplate<String> gtString = new GenericTemplate<>("Test3");
		GenericTemplate<Integer> gtInteger = new GenericTemplate<>(7);
		
		gtString.printGenericObject();
		gtInteger.printGenericObject();
		
		var gtTest = new TestGenericTemplate();
		gtTest.TestGenericTemplateWithString();
		gtTest.TestGenericTemplateWithInteger();
		
		LinkedList <String>ll = new LinkedList<>();
		var hll = new HandleLinkedList(ll);
		hll.printLinkedList();
	}
}

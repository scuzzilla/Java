package com.simple.java;

import java.util.LinkedList;

public class HandleLinkedList {
	
	private LinkedList<String> ll;
	
	public HandleLinkedList(LinkedList<String> ll) {
		//ll = new <String>LinkedList();
		this.ll = ll;
		ll.add("ll-Test1");
		ll.add("ll-Test2");
	}
	
	public void printLinkedList() {
		for (String elem : this.ll) {
			System.out.println(elem);
		}
	}
}

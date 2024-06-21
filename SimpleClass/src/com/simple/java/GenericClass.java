package com.simple.java;

import java.util.Vector;

public class GenericClass {
	private String string1;
	private String string2;
	private Vector<String> vect1;
	
	void setStrings(String str1, String str2) {
		this.string1 = str1;
		this.string2 = str2;
	}
	
	void setVector() {
		if (this.string1 != null) {
			vect1.add(this.string1);
		} else {
			System.out.println(this.string1);
		}
		
		if (this.string2 != null) {
			vect1.add(this.string2);
		} else {
			System.out.println(this.string2);
		}
	}
	
	void getStrings() {
		System.out.println("First String: " + this.string1);
		System.out.println("Second String: " + this.string2);
	}
}

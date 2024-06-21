package com.simple.java;

public class GenericTemplate <T> {
	
	private T genericObject;
	
	public GenericTemplate(T genericObject) {
		this.genericObject = genericObject;
	}

	public T getGenericObejct() {
		return this.genericObject;
	}
	
	public T printGenericObject() {
		if (this.genericObject instanceof String) {
			System.out.println("genericObject: " + genericObject);
		}
		
		if (this.genericObject instanceof Integer) {
			System.out.println("genericObject: " + genericObject);
		}
		
		return this.genericObject;
	}
}

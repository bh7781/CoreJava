package com.design.creational.singletonPattern;

public class SingleObject {
	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	// private constructor
	private SingleObject() {
	}

	// Get the only available object
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("This is example of Singleton Pattern...");
	}

}

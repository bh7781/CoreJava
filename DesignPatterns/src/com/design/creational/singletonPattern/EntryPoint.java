package com.design.creational.singletonPattern;

public class EntryPoint {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		
		SingleObject object1 = SingleObject.getInstance();
		object1.showMessage();
		
		System.out.println(object.hashCode() == object1.hashCode());
	}

}

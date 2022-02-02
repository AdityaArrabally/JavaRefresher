package com.learning.adi.java.javarefresher.generics;

public class GenericExample<T> {
	
	T object;
	
	GenericExample(T object){
		this.object = object;
	}
	
	void showType() {
		System.out.println(object);
	}

}

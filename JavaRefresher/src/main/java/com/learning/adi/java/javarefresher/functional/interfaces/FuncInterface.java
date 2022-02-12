package com.learning.adi.java.javarefresher.functional.interfaces;

@FunctionalInterface
public interface FuncInterface {
	public default String HelloWorld() {
		return "Hello World !!!! ";
	}

	public static String CustomMessage(String msg) {
		return msg;
	}
	
	public void bar();
}

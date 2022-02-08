package com.learning.adi.java.javarefresher.functional.interfaces;

public class FuncInterfaceImpl implements FuncInterface {

	@Override
	public void bar() {
		System.out.println("Hello World !!!");

	}
	
	public String HelloWorld() {
		return "";
		
	}

	public static void main(String[] args) {
		FuncInterfaceImpl fi = new FuncInterfaceImpl();
		System.out.println(fi.HelloWorld());
		System.out.println(FuncInterface.CustomMessage("Hi"));
		fi.bar();
	}
}

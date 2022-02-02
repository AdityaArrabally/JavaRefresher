package com.learning.adi.java.javarefresher.functional.interfaces;

import java.util.function.Function;

//In Java 8, Function is a functional interface; it takes an argument (object of type T) and returns an object (object of type R). The argument and output can be a different type.
public class Java8Function {

	public static void main(String[] args) {
		Function<String, Integer> func = x -> x.length();
		Integer length = func.apply("Aditya Arrabally");
		System.out.println(length);
	}
}

package com.learning.adi.java.javarefresher.functional.interfaces;

import java.util.function.Function;

public class Java8ChainFunction {
	public static void main(String[] args) {
		Function<String, Integer> function = x -> x.length();
		Function<Integer, Integer> function2 = x-> x*10;
		Integer count = function.apply("Aditya Arrabally");
		System.out.println(count);
		
		count = function.andThen(function2).apply("Aditya Arrabally");
		System.out.println(count);
	}
}

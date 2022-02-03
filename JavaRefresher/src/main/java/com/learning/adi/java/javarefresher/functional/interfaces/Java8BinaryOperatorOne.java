package com.learning.adi.java.javarefresher.functional.interfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Java8BinaryOperatorOne {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		Integer result = func.apply(5, 11);
		System.out.println(result);

		BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
		Integer result2 = func2.apply(10, 20);
		System.out.println(result2);

	}
}

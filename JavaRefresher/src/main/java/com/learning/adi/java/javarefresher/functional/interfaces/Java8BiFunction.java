package com.learning.adi.java.javarefresher.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, List<Integer>> function = (x1, x2) -> Arrays.asList(x1, x2, (x1 + x2));
		List<Integer> output = function.apply(10, 20);
		System.out.println(output);

		String result = powToString(3, 10, (a1, a2) -> Math.pow(a1, a2), (x) -> "Result :: " + String.valueOf(x));

		System.out.println(result);
		
		
		// Multiply
		String result2 = convert(3, 5, (a1, a2) -> a1*a2, (x) -> "Multiply :: " + String.valueOf(x));
		System.out.println( result2);
		
		// Add
		String result3 = convert(3, 5, (a1, a2) -> a1+a2, (x) -> "Add :: " + String.valueOf(x));
		System.out.println( result3);
		
		
		// Subtract
		String result4 = convert(10, 5, (a1, a2) -> a1-a2, (x) -> "Subtract :: " + String.valueOf(x));
		System.out.println(result4);
		

	}

	public static <R> R powToString(Integer a1, Integer a2, BiFunction<Integer, Integer, Double> func,
			Function<Double, R> func2) {
		return func.andThen(func2).apply(a1, a2);
	}
	
	
	
	public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2, BiFunction<A1, A2, R1> func, Function<R1, R2> func2) {
		return func.andThen(func2).apply(a1, a2);
	}
}

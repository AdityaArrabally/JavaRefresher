package com.learning.adi.java.javarefresher.streams;

import java.util.Arrays;

public class Java8StreamReduce {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 1st argument, init value = 0
		int sum = Arrays.stream(numbers).reduce(0, Integer::sum);

		System.out.println("sum : " + sum); // 55
	}
}

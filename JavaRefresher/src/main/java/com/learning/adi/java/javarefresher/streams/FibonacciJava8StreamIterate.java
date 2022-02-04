package com.learning.adi.java.javarefresher.streams;

import java.util.stream.Stream;

public class FibonacciJava8StreamIterate {
	public static void main(String[] args) {
		Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x));
		System.out.println("-------------------------------------------------");
		Stream.iterate(0, n -> n + 1).limit(10).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
		System.out.println("-------------------------------------------------");
		// fibonacci
		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(20).map(n -> n[0])
				.forEach(s -> System.out.println(s));

	}
}

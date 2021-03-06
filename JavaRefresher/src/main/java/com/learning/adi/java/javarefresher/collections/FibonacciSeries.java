package com.learning.adi.java.javarefresher.collections;

import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10)
				.forEach(s -> System.out.println(s[0] + "::" + s[1]));

		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(a -> a[0])
				.forEach(s -> System.out.println(s));

	}
}

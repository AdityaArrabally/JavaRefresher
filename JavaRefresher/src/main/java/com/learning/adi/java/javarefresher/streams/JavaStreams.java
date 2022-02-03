package com.learning.adi.java.javarefresher.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreams {

	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(System.out::println);
		List<String> lines = Arrays.asList("spring", "node", "aditya");
		
		List<String> result = lines.stream().filter(line -> !"aditya".equals(line)).collect(Collectors.toList());
		
	    result.forEach(System.out::println);
	}
}

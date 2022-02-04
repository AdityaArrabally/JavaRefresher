package com.learning.adi.java.javarefresher.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamGroupingBy {

	public static void main(String[] args) {

		// 3 apple, 2 banana, others 1
		List<String> items = Arrays.asList("apple", "apple", "apple", "banana", "banana", "apple", "orange", "orange","banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		System.out.println("-------------------------------------------------");

		Map<String, Long> finalMap = new LinkedHashMap<>();
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
		System.out.println("-------------------------------------------------");
		
		Stream<String> language = Stream.of("Java", "Python", "Node");
		
		List<String> languageResult = language.collect(Collectors.toList());
		System.out.println(languageResult);

	}
}

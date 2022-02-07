package com.learning.adi.java.javarefresher.streams.collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class Java8Collectors {

	public static void main(String[] args) {
		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "bb", "ccc", "dd");
		List<String> result = givenList.stream().collect(toList());
		LinkedList<String> linkedResult = givenList.stream().collect(toCollection(LinkedList::new));

		Map<String, Integer> mapResult = givenList.stream()
				.collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));
		
		String combinedString = givenList.stream()
				  .collect(joining());

		System.out.println(combinedString);
		
		String separator = givenList.stream()
				  .collect(joining(" "));
		System.out.println(separator);
		
		String separatorPreAndPost = givenList.stream()
				  .collect(joining(" ", "PRE-", "-POST"));
		
		System.out.println(separatorPreAndPost);
		
		
		Long counting = givenList.stream()
				  .collect(counting());
		
		System.out.println(counting);
		
		
		DoubleSummaryStatistics summary = givenList.stream()
				  .collect(summarizingDouble(String::length));
		
		System.out.println(summary.getAverage());
		
		
		Map<Integer, List<String>> groupingBy = givenList.stream()
				  .collect(groupingBy(String::length, toList()));
		
		
		System.out.println(groupingBy);
	}

}

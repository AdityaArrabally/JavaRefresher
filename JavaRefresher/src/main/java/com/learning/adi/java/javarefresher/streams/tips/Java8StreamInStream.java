package com.learning.adi.java.javarefresher.streams.tips;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class Java8StreamInStream {
	public static void main(String[] args) {

		Properties properties = System.getProperties();
		LinkedHashMap<String, String> collect = properties.entrySet().stream()
				.collect(Collectors.toMap(k -> (String) k.getKey(), v -> (String) v.getValue())).entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		collect.forEach((K, V) -> System.out.println(K + " :: " + V));
	}
}

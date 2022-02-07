package com.learning.adi.java.javarefresher.streams.tips;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Utils {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		LinkedHashMap<String, String> linkedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		LinkedHashMap<String, Integer> linkedHashMap = unsortMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(linkedHashMap);

		Map<String, Integer> linkedHashMapTwo = new LinkedHashMap<>();

		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> linkedHashMapTwo.put(x.getKey(), x.getValue()));
		
		System.out.println(linkedHashMapTwo);
	}

}

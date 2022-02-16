package com.learning.adi.java.javarefresher.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FinalCountWords {
	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] strArray = str.split(" ");

		Map<String, List<String>> map = Arrays.stream(strArray).collect(Collectors.groupingBy(item -> item.toString()));

		System.out.println(map);

		Map<String, Long> mapDifferen = Arrays.stream(strArray)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(mapDifferen);

		HashMap<Integer, String> mapNew = new HashMap<Integer, String>();
		mapNew.put(2, "Saket");
		mapNew.put(25, "Saurav");
		mapNew.put(12, "HashMap");

		Iterator<Map.Entry<Integer, String>> itr = mapNew.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(((Map.Entry<Integer, String>) itr.next()).getValue());
		}
	}
}

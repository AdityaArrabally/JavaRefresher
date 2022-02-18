package com.learning.adi.java.javarefresher.algorithms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {

		boolean anagramCheck = checkIfAnagram("LISTEN", "SILENT");
		if (anagramCheck) {
			System.out.println("Yes its an anagram");
		} else {
			System.out.println("Not an anagram");
		}
	}

	public static boolean checkIfAnagram2(String string1, String string2) {

		char[] firstArray = string1.toCharArray();
		Stream<Character> cStream1 = IntStream.range(0, firstArray.length).mapToObj(i -> firstArray[i]);
		Map<Character, Long> firstMap = cStream1.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(firstMap);

		char[] secondArray = string2.toCharArray();
		Stream<Character> cStream2 = IntStream.range(0, secondArray.length).mapToObj(i -> secondArray[i]);
		Map<Character, Long> secondMap = cStream2.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(secondMap);
		return secondMap.equals(firstMap);
	}

	public static boolean checkIfAnagram(String string1, String string2) {
		char[] firstArray = string1.toCharArray();
		char[] secondArray = string2.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		return Arrays.equals(firstArray, secondArray);
	}
}

package com.learning.adi.java.javarefresher.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListRemoveIfPredicate {
	public static void main(String[] args) {
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");

		// Remove all the elements that satisfy the given predicate
		/*
		 * programmingLanguages.removeIf(new Predicate<String>() {
		 * 
		 * @Override public boolean test(String s) { return s.startsWith("C"); } });
		 */

		programmingLanguages.removeIf(e -> e.startsWith("C"));
		programmingLanguages.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 3;
			}

		});
		programmingLanguages.forEach(e -> System.out.println(e));
	}
}

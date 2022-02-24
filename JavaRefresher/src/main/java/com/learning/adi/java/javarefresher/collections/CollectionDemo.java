package com.learning.adi.java.javarefresher.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection);

		fruitCollection.remove("banana");
		System.out.println(fruitCollection);

		System.out.println(fruitCollection.contains("apple"));
		fruitCollection.forEach(e -> System.out.println(e));

		fruitCollection.clear();

		System.out.println(fruitCollection);
	}
}
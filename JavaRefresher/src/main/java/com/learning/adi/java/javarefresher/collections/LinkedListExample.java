package com.learning.adi.java.javarefresher.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add(2, "L");
		System.out.println("After add(2, \"L\") : " + linkedList);
	}
}

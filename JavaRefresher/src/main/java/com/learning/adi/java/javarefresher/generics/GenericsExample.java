package com.learning.adi.java.javarefresher.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		Printer<Integer> printer = new Printer<>(20);
		printer.print();

		Printer<Double> doublePrinter = new Printer<>(20.5);
		doublePrinter.print();

		shout("John");
		shout(57);
		shout(new Integer(10));
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		printList(intList);
	}

	private static <T> void shout(T thingToShout) {
		System.out.println(thingToShout + "!!!!!");
	}

	private static void printList(List<?> myList) {
		System.out.println(myList);
	}

}

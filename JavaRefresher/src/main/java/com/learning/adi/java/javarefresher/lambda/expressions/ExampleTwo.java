package com.learning.adi.java.JavaRefresher.lambda.expressions;

import java.util.ArrayList;
import java.util.List;

public class ExampleTwo {
	public static void main(String[] args) {

		
		// 1
		StringConcat s = (str1, str2) -> str1 + str2;

		System.out.println("Result :: " + s.sConcat("Smart ", "Aditya"));

		
		// 2
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Bob");
		list.add("Dan");
		list.add("Nick");
		list.add("Chris");
		list.add("Zack");
		list.add("Harry");

		list.forEach((names) -> System.out.println(names));
	}
}

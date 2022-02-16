package com.learning.adi.java.javarefresher.algorithms;

import java.util.Arrays;

public class BinarySearchJava8 {
	public static void main(String[] args) {
		int integers[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		
		int result = Arrays.binarySearch(integers, 100);
		
		System.out.println(result);
	}
}

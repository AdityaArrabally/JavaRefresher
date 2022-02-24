package com.learning.adi.java.javarefresher.algorithms;

import java.util.Arrays;

public class Java8 {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int position = Arrays.binarySearch(array, 80);
		System.out.println("The value of the position is :: " + position);
	}
}

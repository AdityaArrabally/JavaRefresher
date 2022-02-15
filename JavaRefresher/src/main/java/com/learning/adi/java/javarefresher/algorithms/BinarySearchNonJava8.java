package com.learning.adi.java.javarefresher.algorithms;

public class BinarySearchNonJava8 {

	public static void main(String[] args) {

		int integers[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		int start = 0;
		int size = integers.length;
		int findValue = 100;

		int result = BinarySearchNonJava8.binarySearch(integers, start, size - 1, findValue);
		if (result == -1) {
			System.out.println("Couldn't find the element");
		} else {
			System.out.println("Found the element :: " + result);
		}

	}

	public static int binarySearch(int arr[], int start, int size, int findValue) {
		if (size > 1) {
			int midValue = start + (size - 1) / 2;
			System.out.println(midValue);
			if (arr[midValue] == findValue) {
				return midValue;
			} else if (arr[midValue] > findValue) {
				return BinarySearchNonJava8.binarySearch(arr, start, midValue - 1, findValue);
			}
			return BinarySearchNonJava8.binarySearch(arr, midValue + 1, size, findValue);
		}
		return -1;
	}
}

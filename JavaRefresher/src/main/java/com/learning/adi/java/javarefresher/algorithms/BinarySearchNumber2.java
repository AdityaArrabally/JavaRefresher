package com.learning.adi.java.javarefresher.algorithms;

public class BinarySearchNumber2 {
	public static void main(String[] args) {
// input array
		int inputArray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		int findValue = 100;
		int result = BinarySearchNumber2.binarySearch(inputArray, findValue);
		if (result != -1) {
			System.out.println("We found the value !!!!" + result);
		} else {
			System.out.println("The searched value is not the array" );
		}
	}

	private static int binarySearch(int inputArray[], int findValue) {
		int l = 0;
		int r = inputArray.length -1;
		while (l <= r) {
			int m = l + ((r - l) / 2);
			if (inputArray[m] == findValue) {
				return m;
			}
			if (inputArray[m] < findValue) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return -1;
	}

}

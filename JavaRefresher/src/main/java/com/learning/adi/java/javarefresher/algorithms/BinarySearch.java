package com.learning.adi.java.javarefresher.algorithms;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int findValue = 30;
		int result = binarySearch(array, findValue);
		if(result != -1) {
			System.out.println("We found the value ::" + result);
		}else {
			System.out.println("Value not found.");
		}
	}

	public static int binarySearch(int array[], int findValue) {
		int l = 0;
		int h = array.length - 1;

		while(h>l) {
			int m = l + (h - l) / 2;
			if (array[m] == findValue) {
				return m;
			}
			if (array[m] > findValue) {
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}
}

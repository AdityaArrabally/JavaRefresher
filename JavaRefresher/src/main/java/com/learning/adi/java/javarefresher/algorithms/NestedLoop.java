package com.learning.adi.java.javarefresher.algorithms;

class NestedLoop {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		double pie = 3.14;

		for (int var = 1; var < n; var = var + 3) {
			System.out.println("Pie: " + pie);
			for (int j = 1; j < n; j = j + 2) {
				sum++;
				System.out.println("Sum inside : " + sum);
			}
			System.out.println("Sum Outside = " + sum);
		}
	}
}
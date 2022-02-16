package com.learning.adi.java.JavaRefresher;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {
	@Test
	public void testMegerSort() {

		int acutal[] = { 90, 100, 110, 120, 10, 60, 70, 80, 20, 30, 40, 50 };
		int expected[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		MergeSort.mergeSort(acutal, acutal.length);

		assertArrayEquals(expected, acutal);
		System.out.println(Arrays.toString(acutal));
	}

	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}

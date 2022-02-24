<<<<<<< HEAD
package com.learning.adi.java.javarefresher.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

class KthSmallestNumber {

	public static int findKthSmallestNumber(int[] nums, int k) {
		HashSet<Integer> set = (HashSet<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toSet());
		System.out.println(set);
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.addAll(set);
		return findNthElement(treeSet, k-1);
	}

	public static <T> T findNthElement(Iterable<T> data, int n) {
		int i = 0;
		for (T element : data) {
			if (i == n) {
				return element;
			}
			i++;
		}
		return null;
	}

	public static void main(String[] args) {
		int result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 3);
		System.out.println("Kth smallest number is: " + result);

		// since there are two 5s in the input array, our 3rd and 4th smallest numbers
		// should be a '5'
		result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 4);
		System.out.println("Kth smallest number is: " + result);

		result = KthSmallestNumber.findKthSmallestNumber(new int[] { 5, 12, 11, -1, 12 }, 3);
		System.out.println("Kth smallest number is: " + result);
	}
}
=======
package com.learning.adi.java.javarefresher.algorithms;

import java.util.*;
import java.util.stream.Collectors;

class KthSmallestNumber {

	public static int findKthSmallestNumber(int[] nums, int k) {
		Set<Integer> hashSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		Iterator<Integer> iterator = treeSet.iterator();
		int i = 0;
		Integer current = null;
		while (iterator.hasNext() && i < k) {
			current = iterator.next();
			i++;
		}
		return current;
	}

	public static void main(String[] args) {
		int result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 3);
		System.out.println("Kth smallest number is: " + result);

		// since there are two 5s in the input array, our 3rd and 4th smallest numbers
		// should be a '5'
		result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 4);
		System.out.println("Kth smallest number is: " + result);

		result = KthSmallestNumber.findKthSmallestNumber(new int[] { 5, 12, 11, -1, 12 }, 3);
		System.out.println("Kth smallest number is: " + result);
	}
}
>>>>>>> branch 'master' of https://github.com/AdityaArrabally/JavaRefresher.git

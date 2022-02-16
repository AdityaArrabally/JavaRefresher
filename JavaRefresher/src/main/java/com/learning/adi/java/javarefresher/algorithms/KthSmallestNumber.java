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

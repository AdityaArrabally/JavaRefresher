package com.learning.adi.java.javarefresher.algorithms;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target =17;

		int[] result = twoSum(nums, target);
		if (result != null) {
			System.out.println(Arrays.toString(result));
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		int numsLenght = nums.length;
		for (int i = 0; i < numsLenght; i++) {
			for (int j = 0; j < numsLenght; j++) {
				if (i != j) {
					if (nums[i] + nums[j] == target) {
						return new int[] { i, j };
					}
				}
			}
		}
		return null;
	}
}

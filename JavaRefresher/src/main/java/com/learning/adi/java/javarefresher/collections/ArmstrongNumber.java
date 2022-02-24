package com.learning.adi.java.javarefresher.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmstrongNumber {
	public static void main(String[] args) {
		List<Integer> armstrongNumList = getArmstrongList(5);
		System.out.println(armstrongNumList);
	}

	public static List<Integer> getArmstrongList(int limit) {
		List<Integer> armstrongNumList = Stream.iterate(1, i -> ++i).filter(i -> i == Stream
				.of(String.valueOf(i).split("")).map(Integer::valueOf).map(n -> n * n * n).mapToInt(n -> n).sum())
				.limit(limit).collect(Collectors.toList());
		return armstrongNumList;
	}
}

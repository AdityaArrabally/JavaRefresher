package com.learning.adi.java.javarefresher.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.adi.java.javarefresher.streams.objects.Staff;

public class Java8StreamMap {
	public static void main(String[] args) {

		List<Staff> staff = Arrays.asList(new Staff("aditya", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));

		// Java 8
		List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collect); // [mkyong, jack, lawrence]
	}
}

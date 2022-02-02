package com.learning.adi.java.JavaRefresher.lambda.expressions;

public class Example {

	public static void main(String[] args) {
		MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
	}
}

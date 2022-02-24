package com.learning.adi.java.javarefresher.algorithms;

public class LengthOfString {

	public static void main(String[] args) {
		String sample = "I am a donkey";
		int length = 0;
		char[] sampleArray = sample.toCharArray();
		for(char c:sampleArray) {
			length++;
		}
		System.out.println("Sample Length" + length);
	}

}

package com.learning.adi.java.javarefresher.algorithms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "Angel is";
		String s2 = "Angle si";
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();	
		if(s1.length() != s2.length()) {
			System.out.println("Strings not equal");
		}
		else {
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			if(Arrays.equals(s1Array, s2Array)) {
				System.out.println("String equals");
			}
			else {
				System.out.println("String not equals");
			}
		}
	}

}

package com.learning.adi.java.javarefresher.algorithms;

public class ReverseString {

	public static void main(String[] args) {
		String beforeReverse = "I am happy.";
		StringBuffer afterReverse = new StringBuffer();
		for(int i=beforeReverse.length()-1; i>=0 ;i--) {
			afterReverse = afterReverse.append(beforeReverse.charAt(i));
			System.out.println(afterReverse);
		}
		System.out.println(afterReverse);
	}

}


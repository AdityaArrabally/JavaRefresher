package com.learning.adi.java.javarefresher.algorithms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12345;
		boolean isPalindrome = isPalindrome(i);
		System.out.println(isPalindrome);

	}

	public static boolean isPalindrome(int x) {
		String strInt = new Integer(x).toString();
		String intStr = new StringBuilder(strInt).reverse().toString();
		return strInt.equals(intStr);
	}

}

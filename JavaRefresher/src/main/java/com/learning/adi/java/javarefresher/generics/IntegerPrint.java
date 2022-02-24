package com.learning.adi.java.javarefresher.generics;

public class IntegerPrint {
	public static void main(String[] args) {
		int Number, Temp, Reminder, Times = 0;
		double Sum = 0;
		Number = 150;

		//Helps to prevent altering the original value
		Temp = Number;
		while (Temp != 0) {
			Reminder = Temp % 10;
			Sum = Sum + Reminder*Reminder*Reminder;
			Temp = Temp/10;
			Times = Times+1;
			System.out.println(Sum);
		   }
		
		if (Sum == Number) {
			System.out.format("\n% d is a Armstrong Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Armstrong Number", Number);
		}
	
	String a= "abc";
	StringBuilder input1 = new StringBuilder();
	for(int i=a.length()-1; i>=0; i--) {
		input1 = input1.append(a.charAt(i));		
	}
	System.out.println(input1);
	}

}

package com.learning.adi.java.javarefresher.generics;

public class GenericTest {
	public static void main(String[] args) {
		GenericExample<Integer> obj1 = new GenericExample<>(10);
		GenericExample<Double> obj2 = new GenericExample<>(20.0);
		obj1.showType();
		obj2.showType();
		
		
		shout("John");
		shout(57);
		shout(new Integer(10));
	}

	private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + " !!!!!");
       
	}
}

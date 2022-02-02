package com.learning.adi.java.JavaRefresher.Objects;

public interface InterfaceJavaEight {
   /// Java * interface with static and default methods. 
	default int d1() {
		return 1;
	}
	static int s1() {
		return 42;
	}
	void getMeSomething();
}

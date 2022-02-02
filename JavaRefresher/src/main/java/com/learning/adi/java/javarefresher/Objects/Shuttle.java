package com.learning.adi.java.JavaRefresher.Objects;

public class Shuttle  extends Rocket{
	public static void main(String[] args) {
		new Shuttle().go();
	}
	void go() {
		blastOff();
	}

	private void blastOff() {
		System.out.println("sh-bang ");
	}
}

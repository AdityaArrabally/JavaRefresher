package com.learning.adi.java.javarefresher.algorithms;

public class Stack {
	private int array[];
	private int top;
	private int capacity;

	Stack(int size) {
		array = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("The Stack is full !!");
			System.exit(-1);
		}
		System.out.println("Inserting " + x);
		array[++top] = x;
	}


	public boolean isEmpty() {
		return array.length == 0;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
}

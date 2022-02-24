package com.learning.adi.java.javarefresher.algorithms;

import java.lang.reflect.Array;

public class StackUsingArray {

	private int[] array;
	private int capacity;
	private int top;
	
	StackUsingArray(int capacity){
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	public void push(int number) throws RuntimeException {
		array[++top] = number;
	}
	public void pop() throws RuntimeException{
		top--;
	}
	public int peek() {
		return array[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==capacity-1;
	}
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(5);
		System.out.println("Stack is Empty :"+stack.isEmpty());
		stack.push(6);
		System.out.println("Stack push Element :"+stack.peek());
		stack.pop();
		stack.pop();
		stack.push(1);

	}

}

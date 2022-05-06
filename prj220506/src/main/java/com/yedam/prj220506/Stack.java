package com.yedam.prj220506;

public class Stack {

	private static int size;
	private static int[] arr;
	private static int top;

	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isFull() {
		if (top == size) {
			return true;
		} else {
			return false;
		}
	}

	public static void push(int sc) {
		if (!isFull()) {
			arr[++top] = sc;
		} else {
			System.out.println("스택이 가득 찼습니다.");
		}

	}

	public void pop() {
		if (!isEmpty()) {
			for (int i = top; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		} else {
			System.out.println("스택이 비었습니다.");
		}
	}

}

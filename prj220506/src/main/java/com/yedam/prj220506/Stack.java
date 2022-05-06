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
		if (top + 1 == size) {
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

	public int pop() {
		if (!isEmpty()) {
			return arr[top--];
		} else {
			return -1;
		}
	}

	public void show() {
		System.out.print("top : " + top + "\nstack : ");
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}

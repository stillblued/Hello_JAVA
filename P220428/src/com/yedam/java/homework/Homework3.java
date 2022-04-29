package com.yedam.java.homework;

public class Homework3 {

	public static void main(String[] args) {

		try {
			method1();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	}

	public static void method1() {
		throw new NullPointerException();
	}
}

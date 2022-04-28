package com.yedam.java.homework;

public class Homework3 {

	public static void main(String[] args) {

		try {
			method1();
			System.out.println(1);
			System.out.println(2);

		} catch (NullPointerException e) {

		} finally {
			System.out.println(3);
			System.out.println(4);
		}

	}

	public static void method1() {
		throw new NullPointerException();
	}
}

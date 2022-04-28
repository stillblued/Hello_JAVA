package com.yedam.java.homework;

public class Homework4 {

	public static void main(String[] args) {

		method(true);
		method(false);

	}

	public static void method(boolean value) {
		System.out.println(1);

		try {
			if (value) {
				throw new RuntimeException();
			}
			System.out.println(2);
		} catch (RuntimeException e) {
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
}

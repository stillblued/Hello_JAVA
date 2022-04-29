package com.yedam.java.ch07_02;

public class MyFunctionalInterfaceExample3 {

	public static void main(String[] args) {

		MyFunctionalInterface3 fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(4, 7));

		fi = (x, y) -> x + y;
		System.out.println(fi.method(10, 20));

		fi = (x, y) -> Math.subtractExact(x, y);
		System.out.println(fi.method(10, 20));

	}

}

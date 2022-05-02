package com.yedam.java.ch09_01;

public class StringValueOfExamlpe {

	public static void main(String[] args) {

		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;

		String intStr = String.valueOf(intValue);
		String doubleStr = String.valueOf(doubleValue);
		String booleanStr = String.valueOf(booleanValue);

		System.out.println(intStr);
		System.out.println(doubleStr);
		System.out.println(booleanStr);

		System.out.println("" + intValue);
		System.out.println("" + doubleValue);
		System.out.println("" + booleanValue);

	}

}

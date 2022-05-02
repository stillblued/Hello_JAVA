package com.yedam.java.ch09_01;

public class StringTolowerUpperCaseExample {
	public static void main(String[] args) {

		String str1 = "Java Programing";
		String str2 = "JAVA Programing";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(lowerStr2));
	}
}

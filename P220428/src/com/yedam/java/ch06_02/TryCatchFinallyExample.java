package com.yedam.java.ch06_02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("존재하지 않는 클래스입니다.");
		}

	}

}

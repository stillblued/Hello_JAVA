package com.yedam.java.ch08_01;

public class SystemTimeExample {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += 1;
		}

		long endTime = System.nanoTime();

		System.out.println("1~100000까지의 합 : " + sum);
		System.out.println("계산에 " + (endTime - startTime) + " 나노초가 소요되었습니다.");

	}

}

package com.yedam.java.ch08_01;

public class Main {

	public static void main(String[] args) {

		String str1 = new String("홍길동");
		String str2 = new String("홍길동");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				System.exit(0);
				// return; main에서만 같은 역할
				// break; for문에서 벗어남 마무리 코드 출력
			}
		}
		System.out.println("마무리 코드");

	}

}

package com.yedam.java.ch01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 세번째 수를 구하시오
		// 어떤 연산식이 되는 지를 출력하세요.
		// 예를 들어 2, 3, 5를 입력받았을 경우 2 + 3 = 5를 출력하세요.

		int x;
		int y;
		int z;

		while (true) {
			System.out.println("사칙연산 프로그램입니다~ ^^");
			System.out.println("첫번째 숫자를 입력해주세요.");
			x = sc.nextInt();
			System.out.println("두번째 숫자를 입력해주세요.");
			y = sc.nextInt();
			System.out.println("세번째 숫자를 입력해주세요.");
			z = sc.nextInt();

			if (x + y == z) {
				System.out.println(x + " + " + y + " = " + z + " 입니다.");
				System.out.println("====================================");
			} else if (x - y == z) {
				System.out.println(x + " - " + y + " = " + z + " 입니다.");
				System.out.println("====================================");
			} else if (x / y == z) {
				System.out.println(x + " / " + y + " = " + z + " 입니다.");
				System.out.println("====================================");
			} else if (x * y == z) {
				System.out.println(x + " * " + y + " = " + z + " 입니다.");
				System.out.println("====================================");
			} else {
				System.out.println("사칙연산으로 연산할 수 없습니다. ㅠㅜ");
				System.out.println("====================================");
			}
			;

		}

	}

}

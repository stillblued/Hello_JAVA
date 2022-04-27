package com.yedam.java.ch02;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
//		 메뉴는 아래와 같이 구성합니다.
//		input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		boolean isExecuted = false;
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("메뉴 선택>");

			String selected = sc.nextLine();

			if (selected.equals("input")) { // 숫자입력
				System.out.print("첫번째 숫자>");
				x = Integer.parseInt(sc.nextLine());
				System.out.print("두번째 숫자>");
				y = Integer.parseInt(sc.nextLine());
				isExecuted = true;
			} else if (selected.equals("exit")) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			} else if (isExecuted) {
				switch (selected) {
				case "+":
					System.out.println(x + "+" + y + "=" + (x + y));
					break;
				case "-":
					System.out.println(x + "-" + y + "=" + (x - y));
					break;
				case "*":
					System.out.println(x + "*" + y + "=" + (x * y));
					break;
				case "/":
					System.out.println(x + "/" + y + "=" + (x / y));
					break;
				case "?":
					if (x > y) {
						System.out.printf("%d가 %d보다 큽니다.\n", x, y);
					} else if (x < y) {
						System.out.printf("%d가 %d보다 작습나다.\n", x, y);
					} else {
						System.out.printf("%d와 %d는 같습니다.\n", x, y);
					}
					break;
				}
			} else {
				System.out.println("메뉴를 잘못 입력하거나 input을 실행하지 않았습니다.");
			}

		}
	}

}

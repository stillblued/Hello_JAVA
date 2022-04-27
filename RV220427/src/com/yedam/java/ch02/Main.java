package com.yedam.java.ch02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 두수를 입력 받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요
		// 메뉴는 아래와 같이 구성합니다.
		// input.숫자입력 | +.더하기 |-.빼기 |*.곱하기 | /.나누기 | ?.대소관계 | exit.종료

		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;
		String menu;
		boolean run = true;

		while (run) {
			System.out.println("===================================================================");
			System.out.println("input.숫자입력 | +.더하기 |-.빼기 |*.곱하기 | /.나누기 | ?.대소관계 | exit.종료");
			System.out.println("===================================================================");
			System.out.println("menu>> ");

			menu = sc.nextLine();

			switch (menu) {
			case "input":
				System.out.println("첫번째 숫자를 입력해주세요.");
				x = Integer.parseInt(sc.nextLine());
				System.out.println("두번째 숫자를 입력해주세요.");
				y = Integer.parseInt(sc.nextLine());
				break;
			case "+":
				if (x + y == 0) {
					System.out.println("숫자를 먼저 입력해주세요.");
				} else {
					System.out.println(x + "+" + y + "=" + (x + y));
				}
				break;
			case "-":
				if (x + y == 0) {
					System.out.println("숫자를 먼저 입력해주세요.");
				} else {
					System.out.println(x + "-" + y + "=" + (x - y));
				}
				break;
			case "*":
				if (x + y == 0) {
					System.out.println("숫자를 먼저 입력해주세요.");
				} else {
					System.out.println(x + "*" + y + "=" + (x * y));
				}
				break;
			case "/":
				if (x + y == 0) {
					System.out.println("숫자를 먼저 입력해주세요.");
				} else {
					System.out.println(x + "/" + y + "=" + (x / y));
				}
				break;
			case "?":

				if (x > y) {
					System.out.println(x + ">" + y);
				}
				if (x < y) {
					System.out.println(x + "<" + y);
				}
				if (x == y) {
					System.out.println(x + "=" + y);
				}
				if (x + y == 0) {
					System.out.println("숫자를 먼저 입력해주세요.");
				}
				break;
			case "exit":
				System.out.println("시스템 종료.");
				run = false;
			}

		}

	}

}

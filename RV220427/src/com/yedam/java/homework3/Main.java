package com.yedam.java.homework3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 세번째 수를 구하시오
		// 어떤 연산식이 되는 지를 출력하세요.
		// 예를 들어 2, 3, 5를 입력받았을 경우 2+ 3=5를 출력하세요.

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;

		while (true) {
			System.out.println("사칙연산 프로그램");
			System.out.println("첫번째 숫자 입력.");
			x = sc.nextInt();
			System.out.println("두번째 숫자 입력.");
			y = sc.nextInt();
			System.out.println("세번째 숫자 입력.");
			z = sc.nextInt();

			if (x + y == z) {
				System.out.println(x + " + " + y + " = " + z);
			} else if (x - y == z) {
				System.out.println(x + " - " + y + " = " + z);
			} else if (x / y == z) {
				System.out.println(x + " / " + y + " = " + z);
			} else if (x * y == z) {
				System.out.println(x + " * " + y + " = " + z);
			} else {
				System.out.println("사칙연산으로 연산 불가");
			}
			;
		}

		// 두수를 입력 받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요
		// 메뉴는 아래와 같이 구성합니다.
		// input.숫자입력 | +.더하기 |-.빼기 |*.곱하기 | /.나누기 | ?.대소관계 | exit.종료
		int a = 0;
		int b = 0;
		String menu;
		boolean run = true;

		while (run) {
			System.out.println("===================================================================");
			System.out.println("input.숫자입력 | +.더하기 |-.빼기 |*.곱하기 | /.나누기 | ?.대소관계 | exit.종료");
			System.out.println("===================================================================");
			System.out.println("menu>> ");
			menu = sc.nextLine();
			
			if(menu.equals("input")) {
				System.out.println();
				System.out.println();
			}
			else if () {
				
			}
			}
			else if() {
				
			}
			else {
				
			}
			

		// 로또 번호 생성기

		// 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중
		// 1.최고 수와 2.최저 수, 3.수들의 합을 구하는 프로그램을 구현하세요.
	}
}

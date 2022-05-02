package com.yedam.java.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		Calculator.printCalType(); // 계산기 종류를 선택하기 위해 메뉴출력
		int selected = sc.nextInt();
		Calculator cal = Calculator.getCalType(selected); // 선택된 계산기를 반환

		while (run && cal != null) {
			try {
				cal.printMenu(); // 계산기 메뉴를 출력
				String menu = sc.next();

				switch (menu) {
				case "I":
				case "i":
					System.out.println("입력 값>>");
					double num = sc.nextDouble();
					cal.setInputNum(num);
					break;

				case "P":
				case "p":
					cal.print();
					break;

				case "D":
				case "d":
					cal.delete();
					break;

				case "+":
					cal.plus();
					break;

				case "-":
					cal.subtract();
					break;

				case "*":
					cal.multiply();
					break;

				case "/":
					cal.division();
					break;

				case "%":
					cal.remain();
					break;

				case "0":
					cal.init();
					System.out.println("저장된 값을 초기화헸습니다.");
					break;

				case "Q":
				case "q":
					run = false;
					System.out.println("프로그램을 종료하겠습니다.");
					break;

				default:
					System.out.println("메뉴를 잘못 선택하였습니다.");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("숫자는 최대 2개까지 입력 가능합니다.");
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다.");
				String temp = sc.next();
				temp = null; // 예외 처리 + 유효하지 않은 스캐너 값이 메뉴로 넘어가는 것 방지..
			}
		}
		sc.close();

	}
}

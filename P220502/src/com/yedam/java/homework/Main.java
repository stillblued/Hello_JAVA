package com.yedam.java.homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Homework home = new Homework();
		boolean run = true;
		int select = 0;

		home.select();

		while (run) {
			home.menu();
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				home.print();
				System.out.println("입력 값>> ");
				String input1 = sc.nextLine();
				home.correct(input1);
				break;
			case 2:
				home.print();
				System.out.println("입력 값>> ");
				String input2 = sc.nextLine();
				home.check(input2);
				break;
			case 3:
				home.print();
				break;
			case 4:
				home.game();
				home.select();
				System.out.println("새로운 게임을 시작합니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
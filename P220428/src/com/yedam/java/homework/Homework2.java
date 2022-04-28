package com.yedam.java.homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;

		// 사용자입력을 저장할 공간
		int input = 0;

		// 시도횟수를 세기 위한 변수
		int count = 0;

		Scanner sc = new Scanner(System.in);

		try {
			Outter: do {
				System.out.print("1과 100 사이의 값을 입력하세요 : ");
				input = Integer.parseInt(sc.nextLine());
				count++;
				if (input == answer) {
					System.out.println("맞췄습니다.");
					System.out.printf("시도 횟수는 %d번입니다.", count);
					break Outter;
				}
				if (input < answer) {
					System.out.println("더 큰 수를 입력하세요.");
				}
				if (input > answer) {
					System.out.println("더 작은 수를 입력하세요.");
				}
			} while (true);
		} catch (NumberFormatException e) {
			System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
		}

	}
}

package com.yedam.java.ch04;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// 문제4) 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중
		// 1.최고 수와 2.최저 수, 3.수들의 합을 구하는 프로그램을 구현하세요.

		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int size = 0;

		boolean run = true;
		while (run) {
			System.out.println("1.숫자입력 | 2.주사위 굴리기 | 3.최고 수 | 4.최저 수 | 5.총합 | 6.종료");

			System.out.print("선택>");
			int selectNo = sc.nextInt();

			switch (selectNo) {
			case 1:// 굴릴 횟수 입력
				System.out.println("주사위를 굴릴 횟수를 입력하세요.");
				size = sc.nextInt();
				numList = new int[size];
				break;
			case 2:// 실제로 주사위를 굴림
				for (int i = 0; i < numList.length; i++) {
					numList[i] = (int) (Math.random() * 6) + 1;
				}
				break;
			case 3:// 나온 수 중 최대 값
				int max = numList[0];
				int indexOfMax = 0;

				for (int i = 0; i < numList.length; i++) {
					if (numList[i] > max) {
						max = numList[i]; // 현재 최대값
						indexOfMax = i + 1; // 최대값이 나온 굴린 횟수
					}
				}

				System.out.printf("주사위를 굴린 결과 최고 숫자는 %d번 굴렸을 때 나온 %d입니다.\n", indexOfMax, max);
				break;
			case 4:// 나온 수 중 최소 값
				int min = numList[0];
				int indexOfMin = 0;

				for (int i = 0; i < numList.length; i++) {
					if (numList[i] < min) {
						min = numList[i]; // 현재 최대값
						indexOfMin = i + 1; // 최대값이 나온 굴린 횟수
					}
				}

				System.out.printf("주사위를 굴린 결과 최소 숫자는 %d번 굴렸을 때 나온 %d입니다.\n", indexOfMin, min);
				break;
			case 5:// 나온 수들의 합
				int sum = 0;
				for (int num : numList) {
					sum += num;
				}

				System.out.println("주사위를 굴린 결과 나온 수를 모두 더한 합은 " + sum + "입니다.");
				break;
			case 6:
				run = false;
				System.out.println("시스템을 종료합니다.");
				break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
	}
}

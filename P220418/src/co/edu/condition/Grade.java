package co.edu.condition;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 학점 측정 프로그램
		int grade1;
		System.out.println("성적을 입력하세요.");
		// 문자열 숫자를 정수 숫자로 변경
		grade1 = Integer.parseInt(sc.nextLine());

		if (grade1 >= 90) {
			System.out.println("A학점");
		} else if (grade1 >= 80) {
			System.out.println("B학점");
		} else if (grade1 >= 70) {
			System.out.println("C학점");
		} else if (grade1 >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점, 공부하세요.");
		}

		System.out.println("어떤 혜택을 원하세요?");
		char grade2 = 'C';
		switch (grade2) {
		case 'A':
			System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		case 'B':
			System.out.println("VIP 혜택을 받으실 수 있습니다.");
			break;
		case 'C':
			System.out.println("우수회원 혜택을 받으실 수 있습니다.");
		case 'D':
			System.out.println("일반회원 혜택을 받으실 수 있습니다.");
			break;
		default:
			System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다.");
		System.out.println("==================");

		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각 :" + time + " 시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}

	}
}

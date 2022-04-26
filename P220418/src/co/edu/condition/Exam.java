package co.edu.condition;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		// 1. 화씨 데이터 받아서 섭씨로 변환 프로그램

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Q. 화씨 온도를 입력하세요.");
			double F = Double.parseDouble(sc.nextLine());
			double C = 5 / 9.0 * (F - 32);
			System.out.println("A. 섭씨 온도는 " + C + "도 입니다.");
		}

		// 2. 가위바위보 (반복X) scanner random
		// 가위(0), 바위(1), 보(2) 게임
		// 컴퓨터와 대결하여 승리/패배 출력

	}
}

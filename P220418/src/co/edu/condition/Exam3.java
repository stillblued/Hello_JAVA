package co.edu.condition;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {

		// 3. 학점 관리프로그램 switch만 사용 출력
		// scanner => data 100~90A 89~80B 79~70C 출력

		Scanner sc = new Scanner(System.in);

		int score;

		while (true) {
			System.out.println("성적을 입력하세요.");
			score = Integer.parseInt(sc.nextLine());

			int grade = (score / 10);

			switch (grade) {
			case 10:
			case 9:
				System.out.println("A학점입니다.");
				break;
			case 8:
				System.out.println("B학점입니다.");
				break;
			case 7:
				System.out.println("C학점입니다.");
				break;
			case 6:
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("노력합시다.");
				break;
			default:
				System.out.println("입력 범위를 초과하였습니다.");
				break;
			}

		}
	}

}

package co.edu.condition;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		// 2. 가위바위보 (반복X) scanner random
		// 가위(0), 바위(1), 보(2) 게임
		// 컴퓨터와 대결하여 승리/패배 출력

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("가위바위보를 해봅시다. 가위(0), 바위(1), 보(2)");
			int my = Integer.parseInt(sc.nextLine());
			int num = (int) (Math.random() * 3);
			System.out.println("컴퓨터의 결과 : " + num);

			int outCome = my - num;

			if (outCome == 0) {
				System.out.println("비겼습니다.");
			} else if (outCome == -2) {
				System.out.println("승리.");
			} else if (outCome == 1) {
				System.out.println("승리.");
			} else if (outCome == 2) {
				System.out.println("패배.");
			} else if (outCome == -1) {
				System.out.println("패배.");
			} else {
				System.out.println("잘못 입력된 값입니다.");
			}

		}
	}

}
